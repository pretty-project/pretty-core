
(ns pretty-models.content.grid.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn grid-content-content-attributes
  [attributes props]
  (-> attributes (pretty-attributes/content-size-attributes props)
                 (pretty-attributes/font-attributes         props)
                 (pretty-attributes/grid-attributes         props)
                 (pretty-attributes/overflow-attributes     props)
                 (pretty-attributes/text-attributes         props)))

(defn grid-content-inner-attributes
  [attributes _]
  (-> attributes))

(defn grid-content-outer-attributes
  [attributes _]
  (-> attributes))
