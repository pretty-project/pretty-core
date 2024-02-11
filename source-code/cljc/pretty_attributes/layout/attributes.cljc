
(ns pretty-attributes.layout.attributes
    (:require [fruits.map.api          :as map]
              [pretty-attributes.utils :as utils]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn flex-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the flex layout related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:gap (keyword, px or string)(opt)
  ;  :horizontal-align (keyword)(opt)
  ;  :orientation (keyword)(opt)
  ;  :overflow (keyword)(opt)
  ;  :vertical-align (keyword)(opt)
  ;  ...}
  ;
  ; @usage
  ; (flex-attributes {...} {:horizontal-align :left :orientation :vertical :vertical-align :space-between})
  ; =>
  ; {:data-flex-horizontal-align :left
  ;  :data-flex-orientation      :vertical
  ;  :data-flex-vertical-align   :space-between
  ;  ...}
  ;
  ; @return (map)
  ; {:data-flex-gap (keyword)
  ;  :data-flex-horizontal-align (keyword)
  ;  :data-flex-orientation (keyword)
  ;  :data-flex-overflow (keyword)
  ;  :data-flex-vertical-align (keyword)
  ;  :style (map)
  ;   {"--flex-gap" (string)
  ;    ...}
  ;  ...}
  [attributes {:keys [gap horizontal-align orientation overflow vertical-align]}]
  (-> attributes (map/merge-some {:data-flex-horizontal-align horizontal-align
                                  :data-flex-orientation      orientation
                                  :data-flex-overflow         overflow
                                  :data-flex-vertical-align   vertical-align})
                 (utils/apply-property-value :flex-gap :data-flex-gap gap "px")))

(defn grid-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the grid layout related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:column-count (integer)(opt)
  ;  :column-gap (keyword, px or string)(opt)
  ;  :column-template (keyword or string)(opt)
  ;  :row-count (integer)(opt)
  ;  :row-gap (keyword, px or string)(opt)
  ;  :row-template (keyword or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (grid-attributes {...} {:column-count 10 :column-template :even})
  ; =>
  ; {:data-grid-column-count    :var
  ;  :data-grid-column-template :even
  ;  :style {"--grid-column-count" "10"}
  ;  ...}
  ;
  ; @return (map)
  ; {:data-grid-column-count (keyword)
  ;  :data-grid-column-gap (keyword)
  ;  :data-grid-column-template (keyword)
  ;  :data-grid-row-count (keyword)
  ;  :data-grid-row-gap (keyword)
  ;  :data-grid-row-template (keyword)
  ;  :style (map)
  ;   {"--grid-column-count" (string)
  ;    "--grid-column-gap" (string)
  ;    "--grid-column-template" (string)
  ;    "--grid-row-count" (string)
  ;    "--grid-row-gap" (string)}
  ;    "--grid-row-template" (string)
  ;    ...}
  ;  ...}
  [attributes {:keys [column-count column-gap column-template row-count row-gap row-template]}]
  (-> attributes (utils/apply-property-value :grid-column-count    :data-grid-column-count    column-count)
                 (utils/apply-property-value :grid-row-count       :data-grid-row-count       row-count)
                 (utils/apply-property-value :grid-column-template :data-grid-column-template column-template)
                 (utils/apply-property-value :grid-row-template    :data-grid-row-template    row-template)
                 (utils/apply-property-value :grid-column-gap      :data-grid-column-gap      column-gap)
                 (utils/apply-property-value :grid-row-gap         :data-grid-row-gap         row-gap)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn indent-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @note
  ; The 'indent' and 'outdent' attributes cannot be applied on the same element.
  ; Apply the outdent attributes on an outer element and the indent attributes on an inner element.
  ;
  ; @description
  ; Applies the indent related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:indent (map)(opt)
  ;   {:bottom (keyword, px or string)(opt)
  ;    :left (keyword, px or string)(opt)
  ;    :right (keyword, px or string)(opt)
  ;    :top (keyword, px or string)(opt)
  ;    :horizontal (keyword, px or string)(opt)
  ;    :vertical (keyword, px or string)(opt)
  ;    :all (keyword, px or string)(opt)}
  ;  ...}
  ;
  ; @usage
  ; (indent-attributes {...} {:indent {:horizontal :xxl :left :xs}})
  ; =>
  ; {:data-indent-horizontal :xxl
  ;  :data-indent-left       :xs
  ;  ...}
  ;
  ; @return (map)
  ; {:data-indent-bottom (keyword)
  ;  :data-indent-horizontal (keyword)
  ;  :data-indent-left (keyword)
  ;  :data-indent-right (keyword)
  ;  :data-indent-top (keyword)
  ;  :data-indent-vertical (keyword)
  ;  :style (map)
  ;   {"--indent-bottom" (string)
  ;    "--indent-horizontal" (string)
  ;    "--indent-left" (string)
  ;    "--indent-right" (string)
  ;    "--indent-top" (string)
  ;    "--indent-vertical" (string)
  ;    ...}
  ;  ...}
  [attributes {:keys [indent]}]
  (letfn [(f0 [result k v]
              (let [css-var-name        (keyword (str      "indent-" (name k)))
                    data-attribute-name (keyword (str "data-indent-" (name k)))]
                   (utils/apply-property-value result css-var-name data-attribute-name v "px")))]
         (-> attributes (merge (if (map?            indent)
                                   (reduce-kv f0 {} indent))))))

(defn outdent-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @note
  ; The 'indent' and 'outdent' attributes cannot be applied on the same element.
  ; Apply the outdent attributes on an outer element and the indent attributes on an inner element.
  ;
  ; @description
  ; Applies the outdent related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:outdent (map)(opt)
  ;   {:bottom (keyword, px or string)(opt)
  ;    :left (keyword, px or string)(opt)
  ;    :right (keyword, px or string)(opt)
  ;    :top (keyword, px or string)(opt)
  ;    :horizontal (keyword, px or string)(opt)
  ;    :vertical (keyword, px or string)(opt)
  ;    :all (keyword, px or string)(opt)}
  ;  ...}
  ;
  ; @usage
  ; (outdent-attributes {...} {:outdent {:horizontal :xxl :left :xs}})
  ; =>
  ; {:data-outdent-horizontal :xxl
  ;  :data-outdent-left       :xs
  ;  ...}
  ;
  ; @return (map)
  ; {:data-outdent-bottom (keyword)
  ;  :data-outdent-horizontal (keyword)
  ;  :data-outdent-left (keyword)
  ;  :data-outdent-right (keyword)
  ;  :data-outdent-top (keyword)
  ;  :data-outdent-vertical (keyword)
  ;  :style (map)
  ;   {"--outdent-bottom" (string)
  ;    "--outdent-horizontal" (string)
  ;    "--outdent-left" (string)
  ;    "--outdent-right" (string)
  ;    "--outdent-top" (string)
  ;    "--outdent-vertical" (string)
  ;    ...}
  ;  ...}
  [attributes {:keys [outdent]}]
  (letfn [(f0 [result k v]
              (let [css-var-name        (keyword (str      "outdent-" (name k)))
                    data-attribute-name (keyword (str "data-outdent-" (name k)))]
                   (utils/apply-property-value result css-var-name data-attribute-name v "px")))]
         (-> attributes (merge (if (map?            outdent)
                                   (reduce-kv f0 {} outdent))))))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn position-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the position related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:layer (keyword or integer)(opt)
  ;  :position (keyword)(opt)
  ;  :position-base (keyword)(opt)
  ;  :position-method (keyword)(opt)
  ;  ...}
  ;
  ; @usage
  ; (position-attributes {...} {:layer :uppermost :position :tr :position-method :absolute})
  ; =>
  ; {:data-layer           :uppermost
  ;  :data-position        :tr
  ;  :data-position-method :absolute
  ;  ...}
  ;
  ; @return (map)
  ; {:data-layer (keyword)
  ;  :data-position (keyword)
  ;  :position-base (keyword)
  ;  :position-method (keyword)
  ;  :style (map)
  ;   {"--layer" (string)
  ;    ...}
  ;  ...}
  [attributes {:keys [layer position position-base position-method]}]
  (-> attributes (map/merge-some {:data-position        position
                                  :data-position-base   position-base
                                  :data-position-method position-method})
                 (utils/apply-property-value :layer :data-layer layer)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn size-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the size related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:height (keyword, px or string)(opt)
  ;  :max-height (keyword, px or string)(opt)
  ;  :max-width (keyword, px or string)(opt)
  ;  :min-height (keyword, px or string)(opt)
  ;  :min-width (keyword, px or string)(opt)
  ;  :size-unit (keyword)(opt)
  ;  :width (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (size-attributes {...} {:height :xl :size-unit :full-block :width :xl})
  ; =>
  ; {:data-height    :xl
  ;  :data-size-unit :full-block
  ;  :data-width     :xl
  ;  ...}
  ;
  ; @return (map)
  ; {:data-height (keyword)
  ;  :data-max-height (keyword)
  ;  :data-max-width (keyword)
  ;  :data-min-height (keyword)
  ;  :data-min-width (keyword)
  ;  :data-size-unit (keyword)
  ;  :data-width (keyword)
  ;  :style (map)
  ;   {"--height" (string)
  ;    "--max-height" (string)
  ;    "--max-width" (string)
  ;    "--min-height" (string)
  ;    "--min-width" (string)
  ;    "--width" (string)
  ;    ...}
  ;  ...}
  [attributes {:keys [height max-height max-width min-height min-width size-unit width]}]
  (-> attributes (map/merge-some {:data-size-unit size-unit})
                 (utils/apply-property-value :height     :data-height     height     "px")
                 (utils/apply-property-value :width      :data-width      width      "px")
                 (utils/apply-property-value :max-height :data-max-height max-height "px")
                 (utils/apply-property-value :max-width  :data-max-width  max-width  "px")
                 (utils/apply-property-value :min-height :data-min-height min-height "px")
                 (utils/apply-property-value :min-width  :data-min-width  min-width  "px")))

(defn canvas-size-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the canvas size related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:canvas-height (keyword, px or string)(opt)
  ;  :canvas-width (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (canvas-size-attributes {...} {:canvas-height :parent :canvas-width :parent})
  ; =>
  ; {:data-canvas-height :parent
  ;  :data-canvas-width  :parent
  ;  ...}
  ;
  ; @return (map)
  ; {:data-canvas-height (keyword)
  ;  :data-canvas-width (keyword)
  ;  :style (map)
  ;   {"--canvas-height" (string)
  ;    "--canvas-width" (string)
  ;    ...}
  ;  ...}
  [attributes {:keys [canvas-height canvas-width]}]
  (-> attributes (utils/apply-property-value :canvas-height :data-canvas-height canvas-height "px")
                 (utils/apply-property-value :canvas-width  :data-canvas-width  canvas-width  "px")))

(defn wrapper-size-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the wrapper size related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:wrapper-height (keyword, px or string)(opt)
  ;  :wrapper-width (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (wrapper-size-attributes {...} {:wrapper-height :content :wrapper-width :content})
  ; =>
  ; {:data-wrapper-height :content
  ;  :data-wrapper-width  :content
  ;  ...}
  ;
  ; @return (map)
  ; {:data-wrapper-height (keyword)
  ;  :data-wrapper-width (keyword)
  ;  :style (map)
  ;   {"--wrapper-height" (string)
  ;    "--wrapper-width" (string)
  ;    ...}
  ;  ...}
  [attributes {:keys [wrapper-height wrapper-width]}]
  (-> attributes (utils/apply-property-value :wrapper-height :data-wrapper-height wrapper-height "px")
                 (utils/apply-property-value :wrapper-width  :data-wrapper-width  wrapper-width  "px")))