
(ns pretty-properties.content.props
    (:require [fruits.map.api :as map]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-cursor-props
  ; @description
  ; Applies the given default cursor properties on the given property map.
  ;
  ; @param (map) props
  ; {:cursor (keyword or string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-cursor-props {...} {:cursor :pointer})
  ; =>
  ; {:cursor :pointer
  ;  ...}
  ;
  ; @return (map)
  ; {:cursor (keyword or string)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-font-props
  ; @description
  ; Applies the given default font properties on the given property map.
  ;
  ; @param (map) props
  ; {:font-size (keyword, px or string)(opt)
  ;  :font-weight (keyword)(opt)
  ;  :letter-spacing (keyword, px or string)(opt)
  ;  :line-height (keyword, px or string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-font-props {...} {:font-size :s})
  ; =>
  ; {:font-size :s
  ;  ...}
  ;
  ; @return (map)
  ; {:font-size (keyword, px or string)
  ;  :font-weight (keyword)
  ;  :letter-spacing (keyword, px or string)
  ;  :line-height (keyword, px or string)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-icon-props
  ; @description
  ; Applies the given default icon properties on the given property map.
  ;
  ; @param (map) props
  ; {:icon-color (keyword or string)(opt)
  ;  :icon-family (keyword)(opt)
  ;  :icon-name (keyword)(opt)
  ;  :icon-position (keyword)(opt)
  ;  :icon-size (keyword, px or string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-icon-props {...} {:icon-name :my_icon})
  ; =>
  ; {:icon-name :my_icon
  ;  ...}
  ;
  ; @return (map)
  ; {:icon-color (keyword or string)
  ;  :icon-family (keyword)
  ;  :icon-name (keyword)
  ;  :icon-position (keyword)
  ;  :icon-size (keyword, px or string)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-image-props
  ; @description
  ; Applies the given default image properties on the given property map.
  ;
  ; @param (map) props
  ; {:image-alt (string)(opt)
  ;  :image-uri (string)(opt)
  ;  :on-error-f (function)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-image-props {...} {:image-alt "My image" :image-uri "/my-image-png"})
  ; =>
  ; {:image-alt "My image"
  ;  :image-uri "/my-image-png"
  ;  ...}
  ;
  ; @return (map)
  ; {:image-alt (string)
  ;  :image-uri (string)
  ;  :on-error-f (function)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-multiline-props
  ; @description
  ; Applies the given default multiline properties on the given property map.
  ;
  ; @param (map) props
  ; {:line-count (integer)(opt)
  ;  :max-lines (integer)(opt)
  ;  :min-lines (integer)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-multiline-props {...} {:max-lines 15 :line-count 10})
  ; =>
  ; {:max-lines  15
  ;  :line-count 10
  ;  ...}
  ;
  ; @return (map)
  ; {:line-count (integer)
  ;  :max-lines (integer)
  ;  :min-lines (integer)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-text-props
  ; @description
  ; Applies the given default text properties on the given property map.
  ;
  ; @param (map) props
  ; {:text-align (keyword)(opt)
  ;  :text-caret (keyword)(opt)
  ;  :text-color (keyword or string)(opt)
  ;  :text-direction (keyword)(opt)
  ;  :text-overflow (keyword)(opt)
  ;  :text-selectable? (boolean)(opt)
  ;  :text-transform (keyword)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-text-props {...} {:text-color :default})
  ; =>
  ; {:text-color :default
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
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-content-props
  ; @description
  ; Applies the given default content properties on the given property map.
  ;
  ; @param (map) props
  ; {:content (metamorphic-content)(opt)
  ;  :content-placeholder (metamorphic-content)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-content-props {...} {:content "My content"})
  ; =>
  ; {:content "My content"
  ;  ...}
  ;
  ; @return (map)
  ; {:content (metamorphic-content)
  ;  :content-placeholder (metamorphic-content)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

(defn default-label-props
  ; @description
  ; Applies the given default label properties on the given property map.
  ;
  ; @param (map) props
  ; {:label (metamorphic-content)(opt)
  ;  :label-placeholder (metamorphic-content)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-label-props {...} {:label "My label"})
  ; =>
  ; {:label "My label"
  ;  ...}
  ;
  ; @return (map)
  ; {:label (metamorphic-content)
  ;  :label-placeholder (metamorphic-content)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))
