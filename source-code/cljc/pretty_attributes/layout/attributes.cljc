
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
  ;  :grow (integer)(opt)
  ;  :horizontal-align (keyword)(opt)
  ;  :orientation (keyword)(opt)
  ;  :overflow (keyword)(opt)
  ;  :shrink (integer)(opt)
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
  ;  :data-flex-grow (integer)
  ;  :data-flex-horizontal-align (keyword)
  ;  :data-flex-orientation (keyword)
  ;  :data-flex-overflow (keyword)
  ;  :data-flex-shrink (integer)
  ;  :data-flex-vertical-align (keyword)
  ;  :style (map)
  ;   {"--flex-gap" (string)
  ;    "--flex-grow" (string)
  ;    "--flex-shrink" (string)
  ;    ...}
  ;  ...}
  [attributes {:keys [gap grow horizontal-align orientation overflow shrink vertical-align]}]
  (-> attributes (map/merge-some {:data-flex-horizontal-align horizontal-align
                                  :data-flex-orientation      orientation
                                  :data-flex-overflow         overflow
                                  :data-flex-vertical-align   vertical-align})
                 (utils/apply-property-value :flex-gap    :data-flex-gap    gap "px")
                 (utils/apply-property-value :flex-grow   :data-flex-grow   grow)
                 (utils/apply-property-value :flex-shrink :data-flex-shrink shrink)))

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

(defn overflow-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the overflow related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:horizontal-overflow (keyword)(opt)
  ;  :vertical-overflow (keyword)(opt)
  ;  ...}
  ;
  ; @usage
  ; (overflow-attributes {...} {:horizontal-overflow :scroll :vertical-overflow :hidden})
  ; =>
  ; {:data-horizontal-overflow :scroll
  ;  :data-horizontal-overflow :hidden
  ;  ...}
  ;
  ; @return (map)
  ; {:horizontal-overflow (keyword)
  ;  :vertical-overflow (keyword)
  ;  ...}
  [attributes {:keys [horizontal-overflow vertical-overflow]}]
  (-> attributes (map/merge-some {:data-horizontal-overflow horizontal-overflow
                                  :data-vertical-overflow   vertical-overflow})))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn inner-position-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @note
  ; Apply both the inner position and outer position attributes on the [outer element](#xxx).
  ;
  ; @description
  ; Applies the inner position related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:inner-position (keyword)(opt)
  ;  :inner-position-method (keyword)(opt)
  ;  ...}
  ;
  ; @usage
  ; (inner-position-attributes {...} {:inner-position :tr :inner-position-method :flex})
  ; =>
  ; {:data-inner-position        :tr
  ;  :data-inner-position-method :flex
  ;  ...}
  ;
  ; @return (map)
  ; {:data-inner-position (keyword)
  ;  :inner-position-method (keyword)
  ;  ...}
  [attributes {:keys [inner-position inner-position-base inner-position-method]}]
  (-> attributes (map/merge-some {:data-inner-position        inner-position
                                  :data-inner-position-method inner-position-method})))

(defn outer-position-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @note
  ; Apply both the inner position and outer position attributes on the [outer element](#xxx).
  ;
  ; @description
  ; Applies the outer position related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:outer-layer (keyword or integer)(opt)
  ;  :outer-position (keyword)(opt)
  ;  :outer-position-base (keyword)(opt)
  ;  :outer-position-method (keyword)(opt)
  ;  ...}
  ;
  ; @usage
  ; (outer-position-attributes {...} {:outer-layer :uppermost :outer-position :tr :outer-position-method :absolute})
  ; =>
  ; {:data-outer-layer           :uppermost
  ;  :data-outer-position        :tr
  ;  :data-outer-position-method :absolute
  ;  ...}
  ;
  ; @return (map)
  ; {:data-outer-layer (keyword)
  ;  :data-outer-position (keyword)
  ;  :outer-position-base (keyword)
  ;  :outer-position-method (keyword)
  ;  :style (map)
  ;   {"--outer-layer" (string)
  ;    ...}
  ;  ...}
  [attributes {:keys [outer-layer outer-position outer-position-base outer-position-method]}]
  (-> attributes (map/merge-some {:data-outer-position        outer-position
                                  :data-outer-position-base   outer-position-base
                                  :data-outer-position-method outer-position-method})
                 (utils/apply-property-value :outer-layer :data-outer-layer outer-layer)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn content-size-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the content size related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:content-height (keyword, px or string)(opt)
  ;  :content-size-unit (keyword)(opt)
  ;  :content-width (keyword, px or string)(opt)
  ;  :max-content-height (keyword, px or string)(opt)
  ;  :max-content-width (keyword, px or string)(opt)
  ;  :min-content-height (keyword, px or string)(opt)
  ;  :min-content-width (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (content-size-attributes {...} {:content-height :parent :content-size-unit :full-block :content-width :parent})
  ; =>
  ; {:data-height    :parent
  ;  :data-size-unit :full-block
  ;  :data-width     :parent
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
  [attributes {:keys [content-height content-size-unit content-width max-content-height max-content-width min-content-height min-content-width]}]
  (-> attributes (map/merge-some {:data-size-unit content-size-unit})
                 (utils/apply-property-value :height     :data-height     content-height     "px")
                 (utils/apply-property-value :width      :data-width      content-width      "px")
                 (utils/apply-property-value :max-height :data-max-height max-content-height "px")
                 (utils/apply-property-value :max-width  :data-max-width  max-content-width  "px")
                 (utils/apply-property-value :min-height :data-min-height min-content-height "px")
                 (utils/apply-property-value :min-width  :data-min-width  min-content-width  "px")))

(defn inner-size-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the inner size related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:inner-height (keyword, px or string)(opt)
  ;  :inner-size-unit (keyword)(opt)
  ;  :inner-width (keyword, px or string)(opt)
  ;  :max-inner-height (keyword, px or string)(opt)
  ;  :max-inner-width (keyword, px or string)(opt)
  ;  :min-inner-height (keyword, px or string)(opt)
  ;  :min-inner-width (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (inner-size-attributes {...} {:inner-height :xl :inner-size-unit :full-block :inner-width :xl})
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
  [attributes {:keys [inner-height inner-size-unit inner-width max-inner-height max-inner-width min-inner-height min-inner-width]}]
  (-> attributes (map/merge-some {:data-size-unit inner-size-unit})
                 (utils/apply-property-value :height     :data-height     inner-height     "px")
                 (utils/apply-property-value :width      :data-width      inner-width      "px")
                 (utils/apply-property-value :max-height :data-max-height max-inner-height "px")
                 (utils/apply-property-value :max-width  :data-max-width  max-inner-width  "px")
                 (utils/apply-property-value :min-height :data-min-height min-inner-height "px")
                 (utils/apply-property-value :min-width  :data-min-width  min-inner-width  "px")))

(defn outer-size-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the outer size related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:max-outer-height (keyword, px or string)(opt)
  ;  :max-outer-width (keyword, px or string)(opt)
  ;  :min-outer-height (keyword, px or string)(opt)
  ;  :min-outer-width (keyword, px or string)(opt)
  ;  :outer-height (keyword, px or string)(opt)
  ;  :outer-size-unit (keyword)(opt)
  ;  :outer-width (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (outer-size-attributes {...} {:outer-height :xl :outer-size-unit :full-block :outer-width :xl})
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
  [attributes {:keys [max-outer-height max-outer-width min-outer-height min-outer-width outer-height outer-size-unit outer-width]}]
  (-> attributes (map/merge-some {:data-size-unit outer-size-unit})
                 (utils/apply-property-value :height     :data-height     outer-height     "px")
                 (utils/apply-property-value :width      :data-width      outer-width      "px")
                 (utils/apply-property-value :max-height :data-max-height max-outer-height "px")
                 (utils/apply-property-value :max-width  :data-max-width  max-outer-width  "px")
                 (utils/apply-property-value :min-height :data-min-height min-outer-height "px")
                 (utils/apply-property-value :min-width  :data-min-width  min-outer-width  "px")))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn inner-space-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the inner space related values on the given attribute map.
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
  ; (inner-space-attributes {...} {:indent {:horizontal :xxl :left :xs}})
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

(defn outer-space-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the outer space related values on the given attribute map.
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
  ; (outer-space-attributes {...} {:outdent {:horizontal :xxl :left :xs}})
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
