
(ns pretty-models.content.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn content-model-content-attributes
  [attributes props]
  (-> attributes (pretty-attributes/content-size-attributes props)
                 (pretty-attributes/font-attributes         props)
                 (pretty-attributes/overflow-attributes     props)
                 (pretty-attributes/text-attributes         props)))

(defn content-model-inner-attributes
  [attributes _]
  (-> attributes))

(defn content-model-outer-attributes
  [attributes _]
  (-> attributes))
