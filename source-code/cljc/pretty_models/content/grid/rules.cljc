
(ns pretty-models.content.grid.rules
    (:require [pretty-rules.api :as pretty-rules]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn grid-content-rules
  ; @description
  ; Applies the rule functions of the grid content model on the given property map.
  ;
  ; @param (map) props
  ;
  ; @return (map)
  [props]
  (-> props (pretty-rules/compose-content)))
