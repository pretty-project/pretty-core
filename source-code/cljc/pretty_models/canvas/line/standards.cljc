
(ns pretty-models.canvas.line.standards
    (:require [pretty-standards.api :as pretty-standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn line-canvas-standard-props
  [props]
  (-> props (pretty-standards/standard-line-props)))
