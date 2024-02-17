
(ns pretty-standards.layout.standards
    (:require [fruits.map.api                  :as map]
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

(defn standard-wrapper-size-props
  ; @description
  ; Applies the standard wrapper size properties on the given property map.
  ;
  ; @param (map) props
  ; {:wrapper-height (keyword, px or string)(opt)
  ;  :wrapper-width (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-wrapper-size-props {...})
  ; =>
  ; {:wrapper-height :content
  ;  :wrapper-width :content
  ;  ...}
  ;
  ; @return (map)
  ; {:wrapper-height (keyword, px or string)
  ;  :wrapper-width (keyword, px or string)
  ;  ...}
  [props]
  (-> props (map/use-default-values layout.config/STANDARD-WRAPPER-SIZE-PROPERTIES)))
