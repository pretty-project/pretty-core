
(ns pretty-models.icon.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn icon-model-content-attributes
  [attributes props]
  (-> attributes (pretty-attributes/icon-attributes props)))

(defn icon-model-inner-attributes
  [attributes _]
  (-> attributes))

(defn icon-model-outer-attributes
  [attributes _]
  (-> attributes))
