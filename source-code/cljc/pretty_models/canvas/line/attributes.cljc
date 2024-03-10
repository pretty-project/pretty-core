
(ns pretty-models.canvas.line.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn line-canvas-content-attributes
  [attributes props]
  (-> attributes (pretty-attributes/line-attributes props)))

(defn line-canvas-inner-attributes
  [attributes _]
  (-> attributes))

(defn line-canvas-outer-attributes
  [attributes _]
  (-> attributes))
