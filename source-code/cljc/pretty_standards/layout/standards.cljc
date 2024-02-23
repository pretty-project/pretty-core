
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

(defn standard-size-props
  ; @description
  ; Applies the standard size properties on the given property map.
  ;
  ; @param (map) props
  ; {:height (keyword, px or string)(opt)
  ;  :width (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-size-props {...})
  ; =>
  ; {:height :content
  ;  :width  :content
  ;  ...}
  ;
  ; @return (map)
  ; {:height (keyword, px or string)
  ;  :width (keyword, px or string)
  ;  ...}
  [props]
  (-> props (map/use-default-values layout.config/STANDARD-SIZE-PROPERTIES)))

(defn standard-body-size-props
  ; @description
  ; Applies the standard body size properties on the given property map.
  ;
  ; @param (map) props
  ; {:body-height (keyword, px or string)(opt)
  ;  :body-width (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-body-size-props {...})
  ; =>
  ; {:body-height :parent
  ;  :body-width  :parent
  ;  ...}
  ;
  ; @return (map)
  ; {:body-height (keyword, px or string)
  ;  :body-width (keyword, px or string)
  ;  ...}
  [props]
  (-> props (map/use-default-values layout.config/STANDARD-BODY-SIZE-PROPERTIES)))
