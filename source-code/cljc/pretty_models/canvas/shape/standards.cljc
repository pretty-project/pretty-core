
(ns pretty-models.canvas.shape.standards
    (:require [pretty-standards.api :as pretty-standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn shape-canvas-standard-props
  [props]
  (-> props (pretty-standards/standard-shape-props)))
