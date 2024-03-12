
(ns pretty-models.input.field.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn field-input-body-attributes
  ; @description
  ; Associates the body element attributes of the field input model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes props]
  ; @note (#8805)
  ; The cursor attributes has to be applied on the input element as well; otherwise the it would use the user agent cursor value.
  ;
  ; @bug (#8806)
  ; If the '{:disabled? true}' state sets the 'disabled="true"' attribute on the input element, several consequences may occur:
  ; 1. The input element would lose its focus.
  ; 2. The 'on-blur' event may not occur in some browsers when the 'disabled="true"' attribute is applied. Leading to:
  ;    - The keypress handler staying in type mode.
  ;    - The the field remaining marked as focused.
  ; 3. After the '{:disabled? true}' state ends, the field may not regain its focused state.
  (-> attributes (pretty-attributes/cursor-attributes         props)
                 (pretty-attributes/focus-event-attributes    props)
                 (pretty-attributes/input-autofill-attributes props)
                 (pretty-attributes/input-field-attributes    props)
                 (pretty-attributes/react-attributes          props)))

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
