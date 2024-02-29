
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
