
(ns pretty-models.content.flex.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn flex-content-content-attributes
  [attributes props]
  (-> attributes (pretty-attributes/content-size-attributes props)
                 (pretty-attributes/flex-attributes         props)
                 (pretty-attributes/font-attributes         props)
                 (pretty-attributes/overflow-attributes     props)
                 (pretty-attributes/text-attributes         props)))

(defn flex-content-inner-attributes
  [attributes _]
  (-> attributes))

(defn flex-content-outer-attributes
  [attributes _]
  (-> attributes))
