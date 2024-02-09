
(ns pretty-attributes.content.attributes
    (:require [fruits.map.api          :as map]
              [pretty-attributes.utils :as utils]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn cursor-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @note
  ; Automatically applies the default cursor on disabled elements unless a specific cursor value is provided.
  ;
  ; @description
  ; Applies the cursor related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:cursor (keyword or string)(opt)
  ;  :disabled? (boolean)(opt)
  ;  ...}
  ;
  ; @usage
  ; (cursor-attributes {...} {:cursor :pointer})
  ; =>
  ; {:data-cursor :pointer
  ;  ...}
  ;
  ; @usage
  ; (cursor-attributes {...} {:disabled? true})
  ; =>
  ; {:data-cursor :default
  ;  ...}
  ;
  ; @usage
  ; (cursor-attributes {...} {:cursor :pointer :disabled? true})
  ; =>
  ; {:data-cursor :pointer
  ;  ...}
  ;
  ; @return (map)
  ; {:data-cursor (keyword)
  ;  :style (map)
  ;   {"--cursor" (string)
  ;    ...}
  ;  ...}
  [attributes {:keys [cursor disabled?]}]
  (if disabled? (-> attributes (utils/apply-property-value :cursor :data-cursor (or cursor :default)))
                (-> attributes (utils/apply-property-value :cursor :data-cursor (-> cursor)))))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn font-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the font related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:font-size (keyword, px or string)(opt)
  ;  :font-weight (keyword, px or string)(opt)
  ;  :letter-spacing (keyword, px or string)(opt)
  ;  :line-height (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (font-attributes {...} {:font-size :s :font-weight :bold :letter-spacing :s :line-height :text-block})
  ; =>
  ; {:data-font-size      :s
  ;  :data-font-weight    :bold
  ;  :data-letter-spacing :s
  ;  :data-line-height    :text-block
  ;  ...}
  ;
  ; @return (map)
  ; {:data-font-size (keyword)
  ;  :data-font-weight (keyword)
  ;  :data-letter-spacing (keyword)
  ;  :data-line-height (keyword)
  ;  :style (map)
  ;   {"--font-size" (string)
  ;    "--font-weight" (string)
  ;    "--letter-spacing" (string)
  ;    "--line-height" (string)
  ;    ...}
  ;  ...}
  [attributes {:keys [font-size font-weight letter-spacing line-height]}]
  (-> attributes (utils/apply-property-value :font-size      :data-font-size      font-size      "px")
                 (utils/apply-property-value :letter-spacing :data-letter-spacing letter-spacing "px")
                 (utils/apply-property-value :line-height    :data-line-height    line-height    "px")
                 (utils/apply-property-value :font-weight    :data-font-weight    font-weight)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn icon-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @note
  ; Disables the text selectability on the element to make the icon unselectable.
  ;
  ; @description
  ; Applies the icon related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:icon-color (keyword or string)(opt)
  ;  :icon-family (keyword)(opt)
  ;  :icon-size (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (icon-attributes {...} {:icon-color :default :icon-family :my-icon-family :icon-size :s})
  ; =>
  ; {:data-icon-color  :default
  ;  :data-icon-family :my-icon-family
  ;  :data-icon-size   :s
  ;  ...}
  ;
  ; @return (map)
  ; {:data-icon-color (keyword)
  ;  :data-icon-family (keyword)
  ;  :data-icon-size (keyword)
  ;  :data-text-selectable (boolean)
  ;  :style (map)
  ;   {"--icon-color" (string)
  ;    "--icon-size" (string)
  ;    ...}
  ;  ...}
  [attributes {:keys [icon-color icon-family icon-size]}]
  (-> attributes (map/merge-some {:data-icon-family icon-family
                                  :data-text-selectable false})
                 (utils/apply-property-value :icon-color :data-icon-color icon-color)
                 (utils/apply-property-value :icon-size  :data-icon-size  icon-size "px")))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn image-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the image related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:image-alt (string)(opt)
  ;  :image-uri (string)(opt)
  ;  :on-error-f (function)(opt)
  ;  ...}
  ;
  ; @usage
  ; (image-attributes {...} {:image-alt "My image" :image-uri "/my-image.png"})
  ; =>
  ; {:alt "My image"
  ;  :src "/my-image.png"
  ;  ...}
  ;
  ; @return (map)
  ; {:alt (string)
  ;  :src (string)
  ;  ...}
  [attributes {:keys [image-alt image-uri on-error-f]}]
  (-> attributes (map/merge-some {:alt      image-alt
                                  :on-error on-error-f
                                  :src      image-uri})))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn text-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the text related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:text-align (keyword)(opt)
  ;  :text-caret (keyword)(opt)
  ;  :text-color (keyword or string)(opt)
  ;  :text-direction (keyword)(opt)
  ;  :text-overflow (keyword)(opt)
  ;  :text-selectable? (boolean)(opt)
  ;  :text-transform (keyword)(opt)
  ;  ...}
  ;
  ; @usage
  ; (text-attributes {...} {:text-direction :reversed :text-overflow :ellipsis})
  ; =>
  ; {:data-text-direction :default
  ;  :data-text-overflow  :ellipsis
  ;  ...}
  ;
  ; @return (map)
  ; {:data-text-color (keyword)
  ;  :data-text-caret (keyword)
  ;  :data-text-selectable (boolean)
  ;  :data-text-horizontal-align (keyword)
  ;  :data-text-direction (keyword)
  ;  :data-text-overflow (keyword)}
  ;  :data-text-transform (keyword)
  ;  :style (map)
  ;   {"--text-color" (string)
  ;    ...}
  ;  ...}
  [attributes {:keys [text-align text-caret text-color text-direction text-overflow text-selectable? text-transform]}]
  (-> attributes (map/merge-some {:data-text-caret            text-caret
                                  :data-text-horizontal-align text-align
                                  :data-text-direction        text-direction
                                  :data-text-overflow         text-overflow
                                  :data-text-selectable       text-selectable?
                                  :data-text-transform        text-transform})
                 (utils/apply-property-value :text-color :data-text-color text-color)))
