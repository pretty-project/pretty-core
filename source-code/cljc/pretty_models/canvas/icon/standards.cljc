
(ns pretty-models.canvas.icon.standards
    (:require [pretty-standards.api :as pretty-standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn icon-canvas-standard-props
  [props]
  (-> props (pretty-standards/standard-icon-props)))
