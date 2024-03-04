
(ns pretty-rules.basic.rules
    (:require [fruits.map.api :as map]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn auto-set-mounted
  ; @description
  ; Sets the default value of ':mounted?' property as TRUE.
  ;
  ; @param (map) props
  ;
  ; @usage
  ; (auto-set-mounted {...})
  ; =>
  ; {:mounted? true
  ;  ...}
  ;
  ; @return (map)
  [props]
  (-> props (map/use-default-values {:mounted? true})))
