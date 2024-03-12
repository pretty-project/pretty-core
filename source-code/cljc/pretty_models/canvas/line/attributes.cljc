
(ns pretty-models.canvas.line.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn line-canvas-body-attributes
  ; @description
  ; Associates the body element attributes of the line canvas model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes props]
  (-> attributes (pretty-attributes/line-attributes props)))

(defn line-canvas-inner-attributes
  ; @description
  ; Associates the inner element attributes of the line canvas model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes _]
  (-> attributes))

(defn line-canvas-outer-attributes
  ; @description
  ; Associates the outer element attributes of the line canvas model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes _]
  (-> attributes))
