
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
  ; {:option-highlighted (map)(opt)
  ;  :option-selected (map)(opt)
  ;  :option-value-f (function)(opt)
  ;  :options (maps in vector)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-input-option-props {:options [{...} {...}] ...})
  ; =>
  ; {:option-highlighted {}
  ;  :option-selected    {}
  ;  :option-value-f     #(-> % :label :content)
  ;  :options            [{...} {...}]
  ;  ...}
  ;
  ; @return (map)
  ; {:option-highlighted (map)
  ;  :option-selected (map)
  ;  :option-value-f (function)
  ;  :options (maps in vector)
  ;  ...}
  [props]
  (-> props (map/use-default-value-group input.config/STANDARD-INPUT-OPTION-PROPERTIES)))
