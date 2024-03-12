
(ns pretty-standards.content.standards
    (:require [fruits.map.api                  :as map]
              [pretty-standards.content.config :as content.config]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn standard-font-props
  ; @description
  ; - Applies the standard font properties on the given property map; in case of any font related value is provided.
  ; - The presence of any of the following properties in the given property map also triggers
  ;   the application of the standard font properties: ':content', ':content-placeholder'
  ;
  ; @param (map) props
  ; {:content (multitype-content)(opt)
  ;  :content-placeholder (multitype-content)(opt)
  ;  :font-size (keyword, px or string)(opt)
  ;  :font-weight (keyword)(opt)
  ;  :letter-spacing (keyword, px or string)(opt)
  ;  :line-height (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-font-props {:label "My label" ...})
  ; =>
  ; {:font-size      :s
  ;  :font-weight    :normal
  ;  :label          "My label"
  ;  :letter-spacing :auto
  ;  :line-height    :text-block
  ;  ...}
  ;
  ; @return (map)
  ; {:font-size (keyword, px or string)
  ;  :font-weight (keyword)
  ;  :letter-spacing (keyword, px or string)
  ;  :line-height (keyword, px or string)
  ;  ...}
  [props]
  (-> props (map/use-default-value-group content.config/STANDARD-FONT-PROPERTIES)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn standard-icon-props
  ; @description
  ; Applies the standard icon properties on the given property map; in case of any icon related value is provided.
  ;
  ; @param (map) props
  ; {:icon-color (keyword or string)(opt)
  ;  :icon-family (keyword)(opt)
  ;  :icon-name (keyword)(opt)
  ;  :icon-size (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-icon-props {:icon-name :my_icon ...})
  ; =>
  ; {:icon-color  :default
  ;  :icon-family :material-symbols-outlined
  ;  :icon-name   :my_icon
  ;  :icon-size   :s
  ;  ...}
  ;
  ; @return (map)
  ; {:icon-color (keyword or string)
  ;  :icon-family (keyword)
  ;  :icon-name (keyword)
  ;  :icon-size (keyword, px or string)
  ;  ...}
  [props]
  (-> props (map/use-default-value-group content.config/STANDARD-ICON-PROPERTIES)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn standard-multiline-props
  ; @description
  ; Applies the standard multiline properties on the given property map.
  ;
  ; @param (map) props
  ; {:line-count (integer)(opt)
  ;  :max-lines (integer)(opt)
  ;  :min-lines (integer)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-multiline-props {...})
  ; =>
  ; {:line-count  1
  ;  :max-lines  32
  ;  :min-lines   1
  ;  ...}
  ;
  ; @return (map)
  ; {:line-count (integer)
  ;  :max-lines (integer)
  ;  :min-lines (integer)
  ;  ...}
  [props]
  (-> props (map/use-default-value-group content.config/STANDARD-ICON-PROPERTIES)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn standard-text-props
  ; @description
  ; - Applies the standard text properties on the given property map; in case of any text related value is provided.
  ; - The presence of any of the following values in the given property map also triggers
  ;   the application of the standard text properties: ':content', ':content-placeholder'
  ;
  ; @param (map) props
  ; {:content (multitype-content)(opt)
  ;  :content-placeholder (multitype-content)(opt)
  ;  :text-align (keyword)(opt)
  ;  :text-caret (keyword)(opt)
  ;  :text-color (keyword or string)(opt)
  ;  :text-direction (keyword)(opt)
  ;  :text-overflow (keyword)(opt)
  ;  :text-selectable? (boolean)(opt)
  ;  :text-transform (keyword)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-text-props {:label "My label" ...})
  ; =>
  ; {:label         "My label"
  ;  :text-color    :default
  ;  :text-overflow :visible
  ;  ...}
  ;
  ; @return (map)
  ; {:text-align (keyword)
  ;  :text-caret (keyword)
  ;  :text-color (keyword or string)
  ;  :text-direction (keyword)
  ;  :text-overflow (keyword)
  ;  :text-selectable? (boolean)
  ;  :text-transform (keyword)
  ;  ...}
  [props]
  (-> props (map/use-default-value-group content.config/STANDARD-TEXT-PROPERTIES)))
