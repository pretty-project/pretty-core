
(ns pretty-models.control.click.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn click-control-body-attributes
  ; @description
  ; Associates the body element attributes of the click control model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes _]
  (-> attributes))

(defn click-control-inner-attributes
  ; @description
  ; Associates the inner element attributes of the click control model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes props]
  (-> attributes (pretty-attributes/anchor-attributes   props)
                 (pretty-attributes/progress-attributes props)
                 (pretty-attributes/react-attributes    props)))

(defn click-control-outer-attributes
  ; @description
  ; Associates the outer element attributes of the click control model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes _]
  (-> attributes))
