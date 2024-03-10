
(ns pretty-models.canvas.image.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn image-canvas-content-attributes
  [attributes props]
  (-> attributes (pretty-attributes/background-image-attributes props)))


(defn image-canvas-inner-attributes
  [attributes _]
  (-> attributes))

(defn image-canvas-outer-attributes
  [attributes _]
  (-> attributes))
