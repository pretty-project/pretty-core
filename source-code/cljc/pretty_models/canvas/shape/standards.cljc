
(ns pretty-models.canvas.shape.standards
    (:require [pretty-standards.api :as pretty-standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn shape-canvas-standard-props
  ; @description
  ; Associates the standard properties of the shape canvas model to the given property map.
  ;
  ; @param (map) props
  ;
  ; @return (map)
  [props]
  (-> props (pretty-standards/standard-shape-props)))
