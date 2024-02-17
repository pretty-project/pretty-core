
(ns pretty-standards.input.standards
    (:require [fruits.map.api :as map]
              [pretty-standards.input.config :as input.config]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn standard-input-option-props
  ; @description
  ; Applies the standard input option properties on the given property map; in case of any input option related value is provided.
  ;
  ; @param (map) props
  ; {:get-options-f (function)(opt)
  ;  :option-color-f (function)(opt)
  ;  :option-helper-f (function)(opt)
  ;  :option-label-f (function)(opt)
  ;  :option-value-f (function)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-input-option-props {:get-options-f (fn [_] ...) ...})
  ; =>
  ; {:get-options-f    (fn [_] ...)
  ;  :option-color-f fruits.noop.api/none
  ;  :option-helper-f fruits.noop.api/none
  ;  :option-label-f fruits.noop.api/none
  ;  :option-value-f fruits.noop.api/return
  ;  ...}
  ;
  ; @return (map)
  ; {:get-options-f (function)
  ;  :option-color-f (function)
  ;  :option-helper-f (function)
  ;  :option-label-f (function)
  ;  :option-value-f (function)
  ;  ...}
  [props]
  (-> props (map/use-default-value-group input.config/STANDARD-INPUT-OPTION-PROPERTIES)))
