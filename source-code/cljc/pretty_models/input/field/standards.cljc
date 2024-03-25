
(ns pretty-models.input.field.standards
    (:require [pretty-standards.api :as pretty-standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn field-input-standard-props
  ; @description
  ; Associates the standard properties of the field input model to the given property map.
  ;
  ; @param (map) props
  ;
  ; @return (map)
  [props]
  (-> props (pretty-standards/standard-input-autofill-props)))
