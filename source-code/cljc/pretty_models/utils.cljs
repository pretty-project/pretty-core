
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

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn use-longhand
  ; @description
  ; Converts the given property map to longhand from in case it is provided in shorthand form.
  ;
  ; @param (keyword) id
  ; @param (* or map) props
  ; @param (keyword) shorthand-key
  ;
  ; @usage
  ; (use-longhand :my-element {:content "My content"} :content)
  ; =>
  ; {:content "My content"}
  ;
  ; @usage
  ; (use-longhand :my-element "My content" :content)
  ; =>
  ; {:content "My content"}
  ;
  ; @return (map)
  [_ props shorthand-key]
  (if (-> props map?)
      (-> props)
      (-> {shorthand-key props})))

(defn use-subitem-longhand
  ; @description
  ; Converts a specific subitem in the given property map to longhand from in case it is provided in shorthand form.
  ;
  ; @param (keyword) id
  ; @param (map) props
  ; @param (keyword) subitem-key
  ; @param (keyword) shorthand-key
  ;
  ; @usage
  ; (use-subitem-longhand :my-element {:my-subitem {:content "My content"}} :my-subitem :content)
  ; =>
  ; {:my-subitem {:content "My content"}}
  ;
  ; @usage
  ; (use-subitem-longhand :my-element {:my-subitem "My content"} :my-subitem :content)
  ; =>
  ; {:my-subitem {:content "My content"}}
  ;
  ; @return (map)
  [_ props subitem-key shorthand-key]
  (cond (-> props subitem-key nil?) (-> props)
        (-> props subitem-key map?) (-> props)
        :else (let [subitem (-> props subitem-key)]
                   (-> props (assoc subitem-key {shorthand-key subitem})))))
