
(ns pretty-models.container.grid.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn grid-container-body-attributes
  ; @description
  ; Associates the body element attributes of the grid container model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes _]
  (-> attributes))

(defn grid-container-inner-attributes
  ; @description
  ; Associates the inner element attributes of the grid container model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes props]
  (-> attributes (pretty-attributes/animation-attributes        props)
                 (pretty-attributes/background-color-attributes props)
                 (pretty-attributes/border-attributes           props)
                 (pretty-attributes/cursor-attributes           props)
                 (pretty-attributes/grid-attributes             props)
                 (pretty-attributes/inner-size-attributes       props)
                 (pretty-attributes/inner-space-attributes      props)
                 (pretty-attributes/mouse-event-attributes      props)
                 (pretty-attributes/state-attributes            props)
                 (pretty-attributes/style-attributes            props)))

(defn grid-container-outer-attributes
  ; @description
  ; Associates the outer element attributes of the grid container model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes props]
  (-> attributes (pretty-attributes/class-attributes          props)
                 (pretty-attributes/inner-position-attributes props)
                 (pretty-attributes/outer-position-attributes props)
                 (pretty-attributes/outer-size-attributes     props)
                 (pretty-attributes/outer-space-attributes    props)
                 (pretty-attributes/theme-attributes          props)
                 (pretty-attributes/transformation-attributes props)
                 (pretty-attributes/visibility-attributes     props)))
