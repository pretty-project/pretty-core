
(ns pretty-models.image.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn image-model-content-attributes
  [attributes props]
  (-> attributes (pretty-attributes/background-image-attributes props)))


(defn image-model-inner-attributes
  [attributes _]
  (-> attributes))

(defn image-model-outer-attributes
  [attributes _]
  (-> attributes))
