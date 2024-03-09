
(ns pretty-models.field.tags)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn field-model-auto-tag
  ; @description
  ; Selects a HICCUP tag for an input field based on its properties.
  ;
  ; @param (map) props
  ; {:multiline? (boolean)(opt)
  ;  ...}
  ;
  ; @usage
  ; (field-model-auto-tag {...})
  ; =>
  ; :input
  ;
  ; @usage
  ; (field-model-auto-tag {:multiline? true ...})
  ; =>
  ; :textarea
  ;
  ; @return (keyword)
  [{:keys [multiline?]}]
  (if multiline? :textarea :input))
