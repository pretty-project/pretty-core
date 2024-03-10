
(ns pretty-models.content.multiline.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn multiline-content-content-attributes
  [attributes props]
  (-> attributes (pretty-attributes/content-size-attributes props)
                 (pretty-attributes/font-attributes         props)
                 (pretty-attributes/overflow-attributes     props)
                 (pretty-attributes/text-attributes         props)))

(defn multiline-content-inner-attributes
  [attributes _]
  (-> attributes))

(defn multiline-content-outer-attributes
  [attributes _]
  (-> attributes))
