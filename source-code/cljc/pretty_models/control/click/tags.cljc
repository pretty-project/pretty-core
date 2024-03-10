
(ns pretty-models.control.click.tags)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn click-control-auto-tag
  ; @description
  ; Selects a HICCUP tag for a clickable element based on its properties.
  ;
  ; @param (map) props
  ; {:href-uri (string)(opt)
  ;  :on-click-f (function)(opt)
  ;  ...}
  ;
  ; @usage
  ; (click-control-auto-tag {:href-uri "..." ...})
  ; =>
  ; :a
  ;
  ; @usage
  ; (click-control-auto-tag {:on-click-f (fn [] ...) ...})
  ; =>
  ; :button
  ;
  ; @usage
  ; (click-control-auto-tag {...})
  ; =>
  ; :div
  ;
  ; @return (keyword)
  [{:keys [href-uri on-click-f]}]
  (cond href-uri   :a
        on-click-f :button
        :static    :div))
