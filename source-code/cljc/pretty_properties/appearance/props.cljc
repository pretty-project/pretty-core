
(ns pretty-properties.appearance.props
    (:require [fruits.map.api :as map]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-background-color-props
  ; @description
  ; Applies the given default background color properties on the given property map.
  ;
  ; @param (map) props
  ; {:fill-color (keyword or string)(opt)
  ;  :fill-pattern (keyword)(opt)
  ;  :highlight-color (keyword or string)(opt)
  ;  :highlight-pattern (keyword)(opt)
  ;  :hover-color (keyword or string)(opt)
  ;  :hover-pattern (keyword)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-background-color-props {...} {:fill-color :primary})
  ; =>
  ; {:fill-color :primary
  ;  ...}
  ;
  ; @return (map)
  ; {:fill-color (keyword or string)
  ;  :fill-pattern (keyword)
  ;  :highlight-color (keyword or string)
  ;  :highlight-pattern (keyword)
  ;  :hover-color (keyword or string)
  ;  :hover-pattern (keyword)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

(defn default-background-image-props
  ; @description
  ; Applies the given default background image properties on the given property map.
  ;
  ; @param (map) props
  ; {:background-position (keyword)(opt)
  ;  :background-repeat? (boolean)(opt)
  ;  :background-size (keyword)(opt)
  ;  :background-uri (string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-background-image-props {...} {:background-uri "/my-image.png"})
  ; =>
  ; {:background-uri "/my-image.png"
  ;  ...}
  ;
  ; @return (map)
  ; {:background-position (keyword)
  ;  :background-repeat? (boolean)
  ;  :background-size (keyword)
  ;  :background-uri (string)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-border-props
  ; @description
  ; Applies the given default border properties on the given property map.
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
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-border-props {...} {:border-color :primary})
  ; =>
  ; {:border-color :primary
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
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-line-props
  ; @description
  ; Applies the given default line properties on the given property map.
  ;
  ; @param (map) props
  ; {:line-color (keyword or string)(opt)
  ;  :line-orientation (keyword)(opt)
  ;  :line-size (keyword, px or string)(opt)
  ;  :line-strength (keyword, px or string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-line-props {...} {:line-color :primary})
  ; =>
  ; {:line-color :primary
  ;  ...}
  ;
  ; @return (map)
  ; {:line-color (keyword or string)
  ;  :line-orientation (keyword)
  ;  :line-size (keyword, px or string)
  ;  :line-strength (keyword, px or string)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-shadow-props
  ; @description
  ; Applies the given default shadow properties on the given property map.
  ;
  ; @param (map) props
  ; {:shadow-color (keyword or string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-shadow-props {...} {:shadow-color :primary})
  ; =>
  ; {:shadow-color :primary
  ;  ...}
  ;
  ; @return (map)
  ; {:shadow-color (keyword or string)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-theme-props
  ; @description
  ; Applies the given default theme properties on the given property map.
  ;
  ; @param (map) props
  ; {:theme (keyword)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-theme-props {...} {:theme :my-theme})
  ; =>
  ; {:theme :my-theme
  ;  ...}
  ;
  ; @return (map)
  ; {:theme (keyword)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-visibility-props
  ; @description
  ; Applies the given default visibility properties on the given property map.
  ;
  ; @param (map) props
  ; {:opacity (keyword or number)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-visibility-props {...} {:opacity :soft})
  ; =>
  ; {:opacity :soft
  ;  ...}
  ;
  ; @return (map)
  ; {:opacity (keyword or number)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))
