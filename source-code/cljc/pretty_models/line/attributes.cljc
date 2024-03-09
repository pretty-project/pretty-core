
(ns pretty-models.line.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn line-model-content-attributes
  [attributes props]
  (-> attributes (pretty-attributes/line-attributes props)))

(defn line-model-inner-attributes
  [attributes _]
  (-> attributes))

(defn line-model-outer-attributes
  [attributes _]
  (-> attributes))
