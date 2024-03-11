
(ns pretty-models.input.field.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn field-input-content-attributes
  ; @description
  ; Associates the content element attributes of the field input model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes props]
  (-> attributes (pretty-attributes/focus-event-attributes props)
                 (pretty-attributes/input-field-attributes props)
                 (pretty-attributes/react-attributes       props)))

(defn field-input-inner-attributes
  ; @description
  ; Associates the inner element attributes of the field input model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes _]
  (-> attributes))

(defn field-input-outer-attributes
  ; @description
  ; Associates the outer element attributes of the field input model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes _]
  (-> attributes))
