
(ns pretty-standards.control.standards
    (:require [fruits.map.api                  :as map]
              [pretty-standards.control.config :as control.config]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn standard-anchor-props
  ; @description
  ; Applies the standard anchor properties on the given property map; in case of any anchor related value is provided.
  ;
  ; @param (map) props
  ; {:href-target (keyword)(opt)
  ;  :href-uri (string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-anchor-props {:href-uri "/my-uri" ...})
  ; =>
  ; {:href-target :self
  ;  :href-uri    "/my-uri"
  ;  ...}
  ;
  ; @return (map)
  ; {:href-target (keyword)(opt)
  ;  :href-uri (string)(opt)
  ;  ...}
  [props]
  (-> props (map/use-default-value-group control.config/STANDARD-ANCHOR-PROPERTIES)))
