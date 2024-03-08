
(ns pretty-models.input.utils)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn input-field-auto-tag
  ; @description
  ; Selects a HICCUP tag for an input field based on its properties.
  ;
  ; @param (keyword) id
  ; @param (map) props
  ; {:multiline? (boolean)(opt)
  ;  ...}
  ;
  ; @usage
  ; (input-field-auto-tag :my-element {...})
  ; =>
  ; :input
  ;
  ; @usage
  ; (input-field-auto-tag :my-element {:multiline? true ...})
  ; =>
  ; :textarea
  ;
  ; @return (keyword)
  [_ {:keys [multiline?]}]
  (if multiline? :textarea :input))
