
(ns pretty-attributes.layout.attributes
    (:require [fruits.map.api          :as map]
              [pretty-attributes.utils :as utils]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn quarter-block-size-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; - Applies the size related values on the given attribute map.
  ; - Applies the size related values as quarter block size data attributes.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:height (keyword, px or string)(opt)
  ;  :max-height (keyword, px or string)(opt)
  ;  :max-width (keyword, px or string)(opt)
  ;  :min-height (keyword, px or string)(opt)
  ;  :min-width (keyword, px or string)(opt)
  ;  :width (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (quarter-block-size-attributes {...} {:height :xl, :width :xl})
  ; =>
  ; {:data-quarter-block-height :xl
  ;  :data-quarter-block-width  :xl
  ;  ...}
  ;
  ; @return (map)
  ; {:data-quarter-block-height (keyword)
  ;  :data-quarter-block-max-height (keyword)
  ;  :data-quarter-block-max-width (keyword)
  ;  :data-quarter-block-min-height (keyword)
  ;  :data-quarter-block-min-width (keyword)
  ;  :data-quarter-block-width (keyword)
  ;  :style (map)
  ;   {"--quarter-block-height" (string)
  ;    "--quarter-block-max-height" (string)
  ;    "--quarter-block-max-width" (string)
  ;    "--quarter-block-min-height" (string)
  ;    "--quarter-block-min-width" (string)
  ;    "--quarter-block-width" (string)
  ;    ...}
  ;  ...}
  [attributes {:keys [height max-height max-width min-height min-width width]}]
  (-> attributes (utils/apply-property-value :quarter-block-height     :data-quarter-block-height     height     "px")
                 (utils/apply-property-value :quarter-block-width      :data-quarter-block-width      width      "px")
                 (utils/apply-property-value :quarter-block-max-height :data-quarter-block-max-height max-height "px")
                 (utils/apply-property-value :quarter-block-max-width  :data-quarter-block-max-width  max-width  "px")
                 (utils/apply-property-value :quarter-block-min-height :data-quarter-block-min-height min-height "px")
                 (utils/apply-property-value :quarter-block-min-width  :data-quarter-block-min-width  min-width  "px")))

(defn half-block-size-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; - Applies the size related values on the given attribute map.
  ; - Applies the size related values as half block size data attributes.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:height (keyword, px or string)(opt)
  ;  :max-height (keyword, px or string)(opt)
  ;  :max-width (keyword, px or string)(opt)
  ;  :min-height (keyword, px or string)(opt)
  ;  :min-width (keyword, px or string)(opt)
  ;  :width (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (half-block-size-attributes {...} {:height :xl, :width :xl})
  ; =>
  ; {:data-half-block-height :xl
  ;  :data-half-block-width  :xl
  ;  ...}
  ;
  ; @return (map)
  ; {:data-half-block-height (keyword)
  ;  :data-half-block-max-height (keyword)
  ;  :data-half-block-max-width (keyword)
  ;  :data-half-block-min-height (keyword)
  ;  :data-half-block-min-width (keyword)
  ;  :data-half-block-width (keyword)
  ;  :style (map)
  ;   {"--half-block-height" (string)
  ;    "--half-block-max-height" (string)
  ;    "--half-block-max-width" (string)
  ;    "--half-block-min-height" (string)
  ;    "--half-block-min-width" (string)
  ;    "--half-block-width" (string)
  ;    ...}
  ;  ...}
  [attributes {:keys [height max-height max-width min-height min-width width]}]
  (-> attributes (utils/apply-property-value :half-block-height     :data-half-block-height     height     "px")
                 (utils/apply-property-value :half-block-width      :data-half-block-width      width      "px")
                 (utils/apply-property-value :half-block-max-height :data-half-block-max-height max-height "px")
                 (utils/apply-property-value :half-block-max-width  :data-half-block-max-width  max-width  "px")
                 (utils/apply-property-value :half-block-min-height :data-half-block-min-height min-height "px")
                 (utils/apply-property-value :half-block-min-width  :data-half-block-min-width  min-width  "px")))

(defn full-block-size-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; - Applies the size related values on the given attribute map.
  ; - Applies the size related values as full block size data attributes.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:height (keyword, px or string)(opt)
  ;  :max-height (keyword, px or string)(opt)
  ;  :max-width (keyword, px or string)(opt)
  ;  :min-height (keyword, px or string)(opt)
  ;  :min-width (keyword, px or string)(opt)
  ;  :width (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (full-block-size-attributes {...} {:height :xl, :width :xl})
  ; =>
  ; {:data-full-block-height :xl
  ;  :data-full-block-width  :xl
  ;  ...}
  ;
  ; @return (map)
  ; {:data-full-block-height (keyword)
  ;  :data-full-block-max-height (keyword)
  ;  :data-full-block-max-width (keyword)
  ;  :data-full-block-min-height (keyword)
  ;  :data-full-block-min-width (keyword)
  ;  :data-full-block-width (keyword)
  ;  :style (map)
  ;   {"--full-block-height" (string)
  ;    "--full-block-max-height" (string)
  ;    "--full-block-max-width" (string)
  ;    "--full-block-min-height" (string)
  ;    "--full-block-min-width" (string)
  ;    "--full-block-width" (string)
  ;    ...}
  ;  ...}
  [attributes {:keys [height max-height max-width min-height min-width width]}]
  (-> attributes (utils/apply-property-value :full-block-height     :data-full-block-height     height     "px")
                 (utils/apply-property-value :full-block-width      :data-full-block-width      width      "px")
                 (utils/apply-property-value :full-block-max-height :data-full-block-max-height max-height "px")
                 (utils/apply-property-value :full-block-max-width  :data-full-block-max-width  max-width  "px")
                 (utils/apply-property-value :full-block-min-height :data-full-block-min-height min-height "px")
                 (utils/apply-property-value :full-block-min-width  :data-full-block-min-width  min-width  "px")))

(defn double-block-size-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; - Applies the size related values on the given attribute map.
  ; - Applies the size related values as double block size data attributes.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:height (keyword, px or string)(opt)
  ;  :max-height (keyword, px or string)(opt)
  ;  :max-width (keyword, px or string)(opt)
  ;  :min-height (keyword, px or string)(opt)
  ;  :min-width (keyword, px or string)(opt)
  ;  :width (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (double-block-size-attributes {...} {:height :xl, :width :xl})
  ; =>
  ; {:data-double-block-height :xl
  ;  :data-double-block-width  :xl
  ;  ...}
  ;
  ; @return (map)
  ; {:data-double-block-height (keyword)
  ;  :data-double-block-max-height (keyword)
  ;  :data-double-block-max-width (keyword)
  ;  :data-double-block-min-height (keyword)
  ;  :data-double-block-min-width (keyword)
  ;  :data-double-block-width (keyword)
  ;  :style (map)
  ;   {"--double-block-height" (string)
  ;    "--double-block-max-height" (string)
  ;    "--double-block-max-width" (string)
  ;    "--double-block-min-height" (string)
  ;    "--double-block-min-width" (string)
  ;    "--double-block-width" (string)
  ;    ...}
  ;  ...}
  [attributes {:keys [height max-height max-width min-height min-width width]}]
  (-> attributes (utils/apply-property-value :double-block-height     :data-double-block-height     height     "px")
                 (utils/apply-property-value :double-block-width      :data-double-block-width      width      "px")
                 (utils/apply-property-value :double-block-max-height :data-double-block-max-height max-height "px")
                 (utils/apply-property-value :double-block-max-width  :data-double-block-max-width  max-width  "px")
                 (utils/apply-property-value :double-block-min-height :data-double-block-min-height min-height "px")
                 (utils/apply-property-value :double-block-min-width  :data-double-block-min-width  min-width  "px")))

(defn triple-block-size-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; - Applies the size related values on the given attribute map.
  ; - Applies the size related values as triple block size data attributes.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:height (keyword, px or string)(opt)
  ;  :max-height (keyword, px or string)(opt)
  ;  :max-width (keyword, px or string)(opt)
  ;  :min-height (keyword, px or string)(opt)
  ;  :min-width (keyword, px or string)(opt)
  ;  :width (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (triple-block-size-attributes {...} {:height :xl, :width :xl})
  ; =>
  ; {:data-triple-block-height :xl
  ;  :data-triple-block-width  :xl
  ;  ...}
  ;
  ; @return (map)
  ; {:data-triple-block-height (keyword)
  ;  :data-triple-block-max-height (keyword)
  ;  :data-triple-block-max-width (keyword)
  ;  :data-triple-block-min-height (keyword)
  ;  :data-triple-block-min-width (keyword)
  ;  :data-triple-block-width (keyword)
  ;  :style (map)
  ;   {"--triple-block-height" (string)
  ;    "--triple-block-max-height" (string)
  ;    "--triple-block-max-width" (string)
  ;    "--triple-block-min-height" (string)
  ;    "--triple-block-min-width" (string)
  ;    "--triple-block-width" (string)
  ;    ...}
  ;  ...}
  [attributes {:keys [height max-height max-width min-height min-width width]}]
  (-> attributes (utils/apply-property-value :triple-block-height     :data-triple-block-height     height     "px")
                 (utils/apply-property-value :triple-block-width      :data-triple-block-width      width      "px")
                 (utils/apply-property-value :triple-block-max-height :data-triple-block-max-height max-height "px")
                 (utils/apply-property-value :triple-block-max-width  :data-triple-block-max-width  max-width  "px")
                 (utils/apply-property-value :triple-block-min-height :data-triple-block-min-height min-height "px")
                 (utils/apply-property-value :triple-block-min-width  :data-triple-block-min-width  min-width  "px")))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn content-size-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; - Applies the size related values on the given attribute map.
  ; - Applies the size related values as content size data attributes.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:height (keyword, px or string)(opt)
  ;  :max-height (keyword, px or string)(opt)
  ;  :max-width (keyword, px or string)(opt)
  ;  :min-height (keyword, px or string)(opt)
  ;  :min-width (keyword, px or string)(opt)
  ;  :width (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (content-size-attributes {...} {:height :xl, :width :xl})
  ; =>
  ; {:data-content-height :xl
  ;  :data-content-width  :xl
  ;  ...}
  ;
  ; @return (map)
  ; {:data-content-height (keyword)
  ;  :data-content-max-height (keyword)
  ;  :data-content-max-width (keyword)
  ;  :data-content-min-height (keyword)
  ;  :data-content-min-width (keyword)
  ;  :data-content-width (keyword)
  ;  :style (map)
  ;   {"--content-height" (string)
  ;    "--content-max-height" (string)
  ;    "--content-max-width" (string)
  ;    "--content-min-height" (string)
  ;    "--content-min-width" (string)
  ;    "--content-width" (string)
  ;    ...}
  ;  ...}
  [attributes {:keys [height max-height max-width min-height min-width width]}]
  (-> attributes (utils/apply-property-value :content-height     :data-content-height     height     "px")
                 (utils/apply-property-value :content-width      :data-content-width      width      "px")
                 (utils/apply-property-value :content-max-height :data-content-max-height max-height "px")
                 (utils/apply-property-value :content-max-width  :data-content-max-width  max-width  "px")
                 (utils/apply-property-value :content-min-height :data-content-min-height min-height "px")
                 (utils/apply-property-value :content-min-width  :data-content-min-width  min-width  "px")))

(defn wrapper-size-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @note
  ; Apply this function on wrapper elements of size-controlled elements to ensure
  ; that the wrapper element doesn't prevent the expansion of the size-controlled element.
  ;
  ; @description
  ; - Applies the size related values on the given attribute map.
  ; - Applies the size related values as wrapper size data attributes.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:height (keyword, px or string)(opt)
  ;  :width (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (wrapper-size-attributes {...} {:height :auto, :width :parent})
  ; =>
  ; {:data-wrapper-height :auto
  ;  :data-wrapper-width  :parent
  ;  ...}
  ;
  ; @return (map)
  ; {:data-wrapper-height (keyword)
  ;  :data-wrapper-width (keyword)
  ;  ...}
  [attributes {:keys [height width]}]
  ; In case the height or width of the element is ':auto' or ':parent', the height and width
  ; of the wrapper element must be set also. Otherwise, the wrapper would prevent the expansion of the element.
  (merge attributes (case height :auto   {:data-wrapper-height :auto}
                                 :parent {:data-wrapper-height :parent}
                                         {:data-wrapper-height :content})
                    (case width  :auto   {:data-wrapper-width  :auto}
                                 :parent {:data-wrapper-width  :parent}
                                         {:data-wrapper-width  :content})))

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
