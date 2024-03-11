
(ns pretty-models.canvas.line.standards
    (:require [pretty-standards.api :as pretty-standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn line-canvas-standard-props
  ; @description
  ; Associates the standard properties of the line canvas model to the given property map.
  ;
  ; @param (map) props
  ;
  ; @return (map)
  [props]
  (-> props (pretty-standards/standard-line-props)))
