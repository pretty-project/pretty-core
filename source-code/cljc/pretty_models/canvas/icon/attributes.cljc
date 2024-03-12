
(ns pretty-models.canvas.icon.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn icon-canvas-body-attributes
  ; @description
  ; Associates the body element attributes of the icon canvas model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes props]
  (-> attributes (pretty-attributes/icon-attributes props)))

(defn icon-canvas-inner-attributes
  ; @description
  ; Associates the inner element attributes of the icon canvas model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes _]
  (-> attributes))

(defn icon-canvas-outer-attributes
  ; @description
  ; Associates the outer element attributes of the icon canvas model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes _]
  (-> attributes))
