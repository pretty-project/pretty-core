
(ns pretty-models.content.plain.rules
    (:require [pretty-rules.api :as pretty-rules]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn plain-content-rules
  ; @description
  ; Applies the rule functions of the plain content model on the given property map.
  ;
  ; @param (map) props
  ;
  ; @return (map)
  [props]
  (-> props (pretty-rules/compose-content)))
