
(ns pretty-models.canvas.image.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn image-canvas-body-attributes
  ; @description
  ; Associates the body element attributes of the image canvas model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes props]
  (-> attributes (pretty-attributes/background-image-attributes props)))

(defn image-canvas-inner-attributes
  ; @description
  ; Associates the inner element attributes of the image canvas model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes _]
  (-> attributes))

(defn image-canvas-outer-attributes
  ; @description
  ; Associates the outer element attributes of the image canvas model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes _]
  (-> attributes))
