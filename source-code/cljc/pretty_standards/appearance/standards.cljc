
(ns pretty-standards.appearance.standards
    (:require [fruits.map.api :as map]
              [pretty-standards.appearance.config :as appearance.config]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn standard-background-image-props
  ; @description
  ; Applies the standard background image properties on the given property map; in case of any background image related value is provided.
  ;
  ; @param (map) props
  ; {:background-position (keyword)(opt)
  ;  :background-repeat? (boolean)(opt)
  ;  :background-size (keyword)(opt)
  ;  :background-uri (string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-background-image-props {:background-uri "/my-image.png" ...})
  ; =>
  ; {:background-position :center
  ;  :background-repeat?  false
  ;  :background-size     :cover
  ;  :background-uri      "/my-image.png"
  ;  ...}
  ;
  ; @return (map)
  ; {:background-position (keyword)
  ;  :background-repeat? (boolean)
  ;  :background-size (keyword)
  ;  :background-uri (string)
  ;  ...}
  [props]
  (-> props (map/use-default-value-group appearance.config/STANDARD-BACKGROUND-IMAGE-PROPERTIES)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn standard-border-props
  ; @description
  ; Applies the standard border properties on the given property map; in case of any border related value is provided.
  ;
  ; @param (map) props
  ; {:border-color (keyword or string)(opt)
  ;  :border-crop (keyword)(opt)
  ;  :border-radius (map)(opt)
  ;   {:tl (keyword, px or string)(opt)
  ;    :tr (keyword, px or string)(opt)
  ;    :br (keyword, px or string)(opt)
  ;    :bl (keyword, px or string)(opt)
  ;    :all (keyword, px or string)(opt)}}
  ;  :border-position (keyword)(opt)
  ;  :border-width (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-border-props {:border-color :primary ...})
  ; =>
  ; {:border-color    :primary
  ;  :border-position :all
  ;  :border-width    :xxs
  ;  ...}
  ;
  ; @return (map)
  ; {:border-color (keyword or string)
  ;  :border-crop (keyword)
  ;  :border-radius (map)
  ;   {:tl (keyword, px or string)
  ;    :tr (keyword, px or string)
  ;    :br (keyword, px or string)
  ;    :bl (keyword, px or string)
  ;    :all (keyword, px or string)}}
  ;  :border-position (keyword)
  ;  :border-width (keyword, px or string)
  ;  ...}
  [props]
  (-> props (map/use-default-value-group appearance.config/STANDARD-BORDER-PROPERTIES)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn standard-line-props
  ; @description
  ; Applies the standard line properties on the given property map; in case of any line related value is provided.
  ;
  ; @param (map) props
  ; {:line-color (keyword or string)(opt)
  ;  :line-orientation (keyword)(opt)
  ;  :line-size (keyword, px or string)(opt)
  ;  :line-strength (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-line-props {:line-color :primary ...})
  ; =>
  ; {:line-color       :primary
  ;  :line-orientation :horizontal
  ;  :line-strength    :xxs
  ;  ...}
  ;
  ; @return (map)
  ; {:line-color (keyword or string)
  ;  :line-orientation (keyword)
  ;  :line-size (keyword, px or string)
  ;  :line-strength (keyword, px or string)
  ;  ...}
  [props]
  (-> props (map/use-default-value-group appearance.config/STANDARD-LINE-PROPERTIES)))
