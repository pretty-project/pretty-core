
(ns pretty-models.clickable.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn clickable-model-content-attributes
  [attributes _]
  (-> attributes))

(defn clickable-model-inner-attributes
  [attributes props]
  (-> attributes (pretty-attributes/anchor-attributes   props)
                 (pretty-attributes/progress-attributes props)
                 (pretty-attributes/react-attributes    props)))

(defn clickable-model-outer-attributes
  [attributes _]
  (-> attributes))
