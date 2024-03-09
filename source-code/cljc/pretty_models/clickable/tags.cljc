
(ns pretty-models.clickable.tags)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn clickable-model-auto-tag
  ; @description
  ; Selects a HICCUP tag for a clickable element based on its properties.
  ;
  ; @param (map) props
  ; {:href-uri (string)(opt)
  ;  :on-click-f (function)(opt)
  ;  ...}
  ;
  ; @usage
  ; (clickable-model-auto-tag {:href-uri "..." ...})
  ; =>
  ; :a
  ;
  ; @usage
  ; (clickable-model-auto-tag {:on-click-f (fn [] ...) ...})
  ; =>
  ; :button
  ;
  ; @usage
  ; (clickable-model-auto-tag {...})
  ; =>
  ; :div
  ;
  ; @return (keyword)
  [{:keys [href-uri on-click-f]}]
  (cond href-uri   :a
        on-click-f :button
        :static    :div))
