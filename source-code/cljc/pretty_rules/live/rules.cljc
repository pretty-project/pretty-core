
(ns pretty-rules.live.rules)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn auto-disable-effects
 ; @description
 ; Dissociates the ':click-effect' and ':hover-effect' properties of disabled elements.
 ;
 ; @param (map) props
 ; {:disabled? (boolean)(opt)
 ;  ...}
 ;
 ; @usage
 ; (auto-disable-effects {:click-effect :opacity :hover-effect :opacity :disabled? true ...})
 ; =>
 ; {:disabled? true
 ;  ...}
 ;
 ; @return (map)
 [{:keys [disabled?] :as props}]
 (if disabled? (-> props (dissoc :click-effect :hover-effect))
               (-> props)))

(defn auto-set-click-effect
  ; @description
  ; In case the ':href-uri' or ':on-click-f' property is provided, it uses the ':opacity' as default value
  ; for the ':click-effect' property in the given property map.
  ;
  ; @param (map) props
  ; {:href-uri (string)(opt)
  ;  :on-click-f (string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (auto-set-click-effect {:href-uri "/my-uri" ...})
  ; =>
  ; {:click-effect :opacity
  ;  :href-uri     "/my-uri"
  ;  ...}
  ;
  ; @return (map)
  ; {:click-effect (keyword)
  ;  ...}
  [{:keys [href-uri on-click-f] :as props}]
  (cond on-click-f (-> props (map/use-default-values {:click-effect :opacity}))
        href-uri   (-> props (map/use-default-values {:click-effect :opacity}))
        :static    (-> props)))
