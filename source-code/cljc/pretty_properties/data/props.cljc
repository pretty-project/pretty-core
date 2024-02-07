
(ns pretty-properties.data.props
    (:require [fruits.map.api                :as map]
              [pretty-properties.data.config :as data.config]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-data-props
  ; @description
  ; - Applies the given default data properties on the given property map.
  ; - Applies the standard data properties on the given property map;
  ;   in case of any data related value is provided.
  ;
  ; @param (map) props
  ; {:datum-color-f (function)(opt)
  ;  :datum-label-f (function)(opt)
  ;  :datum-value-f (function)(opt)
  ;  :get-data-f    (function)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-data-props {...} {:get-data-f (fn [_] ...)})
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
  [props & [default-props]]
  (-> props (map/use-default-values default-props)
            (map/use-default-value-group data.config/STANDARD-DATA-PROPERTIES)))
