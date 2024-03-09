
(ns pretty-rules.appearance.rules)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn apply-auto-border-crop
  ; @description
  ; If the ':border-crop' property is provided as ':auto',
  ; ... it is replaced with the value ':crop' in case the ':border-radius' property is also provided.
  ; ... it is replaced with NIL if the ':border-radius' property is not provided.
  ;
  ; @param (map) props
  ; {:border-crop (keyword)(opt)
  ;  :border-radius (map)(opt)
  ;  ...}
  ;
  ; @usage
  ; (apply-auto-border-crop {:border-crop :auto :border-radius {:all :s} ...})
  ; =>
  ; {:border-crop   :crop
  ;  :border-radius {:all :s}
  ;  ...}
  ;
  ; @return (map)
  ; {:border-crop (keyword)
  ;  ...}
  [{:keys [border-crop border-radius] :as props}]
  (case border-crop :auto (cond-> props border-radius (assoc :border-crop :crop))
                          (->     props)))
