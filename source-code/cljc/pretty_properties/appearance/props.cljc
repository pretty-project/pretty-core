
(ns pretty-properties.appearance.props
    (:require [fruits.map.api                      :as map]
              [pretty-properties.appearance.config :as appearance.config]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-background-props
  ; @description
  ; Applies the given default background properties on the given property map.
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
  ; (default-background-props {...} {:fill-color :primary})
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

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-border-props
  ; @description
  ; - Applies the given default border properties on the given property map.
  ; - Applies the standard border properties on the given property map;
  ;   in case of any border related value is provided.
  ;
  ; @param (map) props
  ; {:border-color (keyword or string)(opt)
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
  ; {:border-color    :primary
  ;  :border-position :all
  ;  :border-width    :xxs
  ;  ...}
  ;
  ; @return (map)
  ; {:border-color (keyword or string)
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
  (-> props (map/use-default-values default-props)
            (map/use-default-value-group appearance.config/STANDARD-BORDER-PROPERTIES)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-line-props
  ; @description
  ; - Applies the given default line properties on the given property map.
  ; - Applies the standard line properties on the given property map;
  ;   in case of any line related value is provided.
  ;
  ; @param (map) props
  ; {:line-color (keyword or string)(opt)
  ;  :line-orientation (keyword)(opt)
  ;  :line-strength (keyword, px or string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-line-props {...} {:line-color :primary})
  ; =>
  ; {:line-color       :primary
  ;  :line-orientation :horizontal
  ;  :line-strength    :xxs
  ;  ...}
  ;
  ; @return (map)
  ; {:line-color (keyword or string)
  ;  :line-orientation (keyword)
  ;  :line-strength (keyword, px or string)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)
            (map/use-default-value-group appearance.config/STANDARD-LINE-PROPERTIES)))

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
