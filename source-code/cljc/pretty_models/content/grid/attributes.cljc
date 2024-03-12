
(ns pretty-models.content.grid.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn grid-content-body-attributes
  ; @description
  ; Associates the body element attributes of the grid content model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes props]
  (-> attributes (pretty-attributes/content-size-attributes props)
                 (pretty-attributes/font-attributes         props)
                 (pretty-attributes/grid-attributes         props)
                 (pretty-attributes/overflow-attributes     props)
                 (pretty-attributes/text-attributes         props)))

(defn grid-content-inner-attributes
  ; @description
  ; Associates the inner element attributes of the grid content model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes _]
  (-> attributes))

(defn grid-content-outer-attributes
  ; @description
  ; Associates the outer element attributes of the grid content model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes _]
  (-> attributes))
