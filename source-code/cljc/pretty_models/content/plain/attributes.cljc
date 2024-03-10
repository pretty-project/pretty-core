
(ns pretty-models.content.plain.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn plain-content-content-attributes
  [attributes props]
  (-> attributes (pretty-attributes/content-size-attributes props)
                 (pretty-attributes/font-attributes         props)
                 (pretty-attributes/overflow-attributes     props)
                 (pretty-attributes/text-attributes         props)))

(defn plain-content-inner-attributes
  [attributes _]
  (-> attributes))

(defn plain-content-outer-attributes
  [attributes _]
  (-> attributes))
