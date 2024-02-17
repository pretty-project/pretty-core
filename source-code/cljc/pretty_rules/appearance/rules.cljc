
(ns pretty-rules.appearance.rules)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn auto-disable-hover-color
  ; @description
  ; Dissociates the ':hover-color' and ':hover-pattern' properties (from the given property map) of disabled elements.
  ;
  ; @param (map) props
  ; {:disabled? (boolean)(opt)
  ;  ...}
  ;
  ; @usage
  ; (auto-disable-hover-color {:disabled? true :fill-color :muted :hover-color :muted ...})
  ; =>
  ; {:disabled?  true
  ;  :fill-color :muted
  ;  ...}
  ;
  ; @return (map)
  [{:keys [disabled?] :as props}]
  (if disabled? (-> props (dissoc :hover-color :hover-pattern))
                (-> props)))

(defn auto-disable-highlight-color
  ; @description
  ; Dissociates the ':highlight-color' and ':highlight-pattern' properties (from the given property map) of non-highlighted elements.
  ;
  ; @param (map) props
  ; {:highlighted? (boolean)(opt)
  ;  ...}
  ;
  ; @usage
  ; (auto-disable-highlight-color {:highlight-color :muted ...})
  ; =>
  ; {...}
  ;
  ; @return (map)
  [{:keys [highlighted?] :as props}]
  (if-not highlighted? (-> props (dissoc :highlight-color :highlight-pattern))
                       (-> props)))

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
