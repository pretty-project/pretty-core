
(ns pretty-properties.utils)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn clickable-props?
  ; @description
  ; Returns TRUE if any of the ':href-uri', ':on-click-f', ':on-mouse-down-f', or ':on-mouse-down-f' properties is provided.
  ;
  ; @param (map) props
  ; {:href-uri (string)(opt)
  ;  :on-click-f (function)(opt)
  ;  :on-mouse-down-f (function)(opt)
  ;  :on-mouse-up-f (function)(opt)
  ;  ...}
  ;
  ; @usage
  ; (clickable-props? {:href-uri "/my-uri" ...})
  ; =>
  ; true
  ;
  ; @return (boolean)
  [{:keys [href-uri on-click-f on-mouse-down-f on-mouse-up-f]}]
  (or href-uri on-click-f on-mouse-down-f on-mouse-up-f))
