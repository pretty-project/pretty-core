
(ns pretty-standards.data.standards
    (:require [fruits.map.api               :as map]
              [pretty-standards.data.config :as data.config]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn standard-data-props
  ; @description
  ; Applies the standard data properties on the given property map; in case of any data related value is provided.
  ;
  ; @param (map) props
  ; {:datum-color-f (function)(opt)
  ;  :datum-label-f (function)(opt)
  ;  :datum-value-f (function)(opt)
  ;  :get-data-f    (function)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-data-props {:get-data-f (fn [_] ...) ...})
  ; =>
  ; {:datum-color-f fruits.noop.api/none
  ;  :datum-label-f fruits.noop.api/none
  ;  :datum-value-f fruits.noop.api/return
  ;  :get-data-f    (fn [_] ...)
  ;  ...}
  ;
  ; @return (map)
  ; {:datum-color-f (function)
  ;  :datum-label-f (function)
  ;  :datum-value-f (function)
  ;  :get-data-f    (function)
  ;  ...}
  [props]
  (-> props (map/use-default-value-group data.config/STANDARD-DATA-PROPERTIES)))
