
(ns pretty-properties.data.props
    (:require [fruits.map.api :as map]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-data-props
  ; @description
  ; Applies the given default data properties on the given property map.
  ;
  ; @param (map) props
  ; {:datum-color-f (function)(opt)
  ;  :datum-value-f (function)(opt)
  ;  :get-data-f (function)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-data-props {...} {:get-data-f (fn [_] ...)})
  ; =>
  ; {:get-data-f (fn [_] ...)
  ;  ...}
  ;
  ; @return (map)
  ; {:datum-color-f (function)
  ;  :datum-value-f (function)
  ;  :get-data-f (function)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))
