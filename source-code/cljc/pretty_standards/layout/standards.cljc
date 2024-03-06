
(ns pretty-standards.layout.standards
    (:require [fruits.map.api                 :as map]
              [pretty-standards.layout.config :as layout.config]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn standard-flex-props
  ; @description
  ; Applies the standard flex properties on the given property map; in case of any flex related value is provided.
  ;
  ; @param (map) props
  ; {:gap (keyword, px or string)(opt)
  ;  :horizontal-align (keyword)(opt)
  ;  :orientation (keyword)(opt)
  ;  :overflow (keyword)(opt)
  ;  :vertical-align (keyword)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-flex-props {:gap :s ...})
  ; =>
  ; {:gap              :s
  ;  :horizontal-align :center
  ;  :vertical-align   :center
  ;  ...}
  ;
  ; @return (map)
  ; {:gap (keyword, px or string)
  ;  :horizontal-align (keyword)
  ;  :orientation (keyword)
  ;  :overflow (keyword)
  ;  :vertical-align (keyword)
  ;  ...}
  [props]
  (-> props (map/use-default-value-group layout.config/STANDARD-FLEX-PROPERTIES)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn standard-inner-position-props
  ; @description
  ; Applies the standard inner position properties on the given property map; in case of any inner position related value is provided.
  ;
  ; @param (map) props
  ; {:inner-position (keyword)(opt)
  ;  :inner-position-method (keyword)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-inner-position-props {:inner-position :tr ...})
  ; =>
  ; {:inner-position        :tr
  ;  :inner-position-method :flex
  ;  ...}
  ;
  ; @return (map)
  ; {:inner-position (keyword)
  ;  :inner-position-method (keyword)
  ;  ...}
  [props]
  (-> props (map/use-default-value-group layout.config/STANDARD-INNER-POSITION-PROPERTIES)))

(defn standard-outer-position-props
  ; @description
  ; Applies the standard outer position properties on the given property map; in case of any outer position related value is provided.
  ;
  ; @param (map) props
  ; {:outer-position (keyword)(opt)
  ;  :outer-position-method (keyword)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-outer-position-props {:outer-position :tr ...})
  ; =>
  ; {:outer-position        :tr
  ;  :outer-position-method :absolute
  ;  ...}
  ;
  ; @return (map)
  ; {:outer-position (keyword)
  ;  :outer-position-method (keyword)
  ;  ...}
  [props]
  (-> props (map/use-default-value-group layout.config/STANDARD-OUTER-POSITION-PROPERTIES)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn standard-shape-props
  ; @description
  ; Applies the standard shape properties on the given property map.
  ;
  ; @param (map) props
  ; {:strength (percentage)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-shape-props {...})
  ; =>
  ; {:strength 100
  ;  ...}
  ;
  ; @return (map)
  ; {:strength (percentage)
  ;  ...}
  [props]
  (-> props (map/use-default-values layout.config/STANDARD-SHAPE-PROPERTIES)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn standard-inner-size-props
  ; @description
  ; Applies the standard inner size properties on the given property map.
  ;
  ; @param (map) props
  ; {:inner-height (keyword, px or string)(opt)
  ;  :inner-width (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-inner-size-props {...})
  ; =>
  ; {:inner-height :parent
  ;  :inner-width  :parent
  ;  ...}
  ;
  ; @return (map)
  ; {:inner-height (keyword, px or string)
  ;  :inner-width (keyword, px or string)
  ;  ...}
  [props]
  (-> props (map/use-default-values layout.config/STANDARD-INNER-SIZE-PROPERTIES)))

(defn standard-outer-size-props
  ; @description
  ; Applies the standard outer size properties on the given property map.
  ;
  ; @param (map) props
  ; {:outer-height (keyword, px or string)(opt)
  ;  :outer-width (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-outer-size-props {...})
  ; =>
  ; {:outer-height :content
  ;  :outer-width  :content
  ;  ...}
  ;
  ; @return (map)
  ; {:outer-height (keyword, px or string)
  ;  :outer-width (keyword, px or string)
  ;  ...}
  [props]
  (-> props (map/use-default-values layout.config/STANDARD-OUTER-SIZE-PROPERTIES)))
