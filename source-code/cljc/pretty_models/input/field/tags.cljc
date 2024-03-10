
(ns pretty-models.input.field.tags)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn field-input-auto-tag
  ; @description
  ; Selects a HICCUP tag for a field input based on its properties.
  ;
  ; @param (map) props
  ; {:multiline? (boolean)(opt)
  ;  ...}
  ;
  ; @usage
  ; (field-input-auto-tag {...})
  ; =>
  ; :input
  ;
  ; @usage
  ; (field-input-auto-tag {:multiline? true ...})
  ; =>
  ; :textarea
  ;
  ; @return (keyword)
  [{:keys [multiline?]}]
  (if multiline? :textarea :input))
