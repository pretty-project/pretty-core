
(ns pretty-models.canvas.image.standards
    (:require [pretty-standards.api :as pretty-standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn image-canvas-standard-props
  [props]
  (-> props (pretty-standards/standard-background-image-props)))
