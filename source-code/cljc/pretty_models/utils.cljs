
(ns pretty-models.utils)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn clickable-auto-tag
  ; @description
  ; Selects a HICCUP tag for a clickable element based on its properties.
  ;
  ; @param (keyword) id
  ; @param (map) props
  ; {:href-uri (string)(opt)
  ;  :on-click-f (function)(opt)
  ;  ...}
  ;
  ; @usage
  ; (clickable-auto-tag :my-element {:href-uri "..." ...})
  ; =>
  ; :a
  ;
  ; @usage
  ; (clickable-auto-tag :my-element {:on-click-f (fn [] ...) ...})
  ; =>
  ; :button
  ;
  ; @usage
  ; (clickable-auto-tag :my-element {...})
  ; =>
  ; :div
  ;
  ; @return (keyword)
  [_ {:keys [href-uri on-click-f]}]
  (cond href-uri   :a
        on-click-f :button
        :static    :div))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn use-shorthand
  ; @description
  ; Convets the given property map to longhand from in case it is provided in shorthand form.
  ;
  ; @param (keyword) id
  ; @param (* or map) props
  ; @param (keyword) shorthand-key
  ;
  ; @usage
  ; (use-shorthand :my-element {:label "My label"} :label)
  ; =>
  ; {:label "My label"}
  ;
  ; @usage
  ; (use-shorthand :my-element "My label" :label)
  ; =>
  ; {:label "My label"}
  ;
  ; @return (map)
  [_ props shorthand-key]
  (if (-> props map?)
      (-> props)
      (-> {shorthand-key props})))
