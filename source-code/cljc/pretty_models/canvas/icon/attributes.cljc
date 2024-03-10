
(ns pretty-models.canvas.icon.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn icon-canvas-content-attributes
  [attributes props]
  (-> attributes (pretty-attributes/icon-attributes props)))

(defn icon-canvas-inner-attributes
  [attributes _]
  (-> attributes))

(defn icon-canvas-outer-attributes
  [attributes _]
  (-> attributes))
