
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

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn merge-event-fn
  ; @description
  ; - Associates the given 'event-f' function to a specific key within the given property map.
  ; - In case the property map already contains a function associated to the key, it ensures that the existing function will be fired also.
  ;
  ; @param (map) attributes
  ; @param (keyword) event-key
  ; @param (map) event-f
  ;
  ; @usage
  ; (merge-event-fn {:on-click-f (fn [_] (println "Function #1")) ...}
  ;                 :on-click-f
  ;                 (fn [_] (println "Function #1")))
  ; =>
  ; {:on-click-f (fn [_] (println "Function #1")
  ;                      (println "Function #2"))
  ;  ...}
  ;
  ; @return (map)
  [props event-key event-f]
  (cond (-> event-f         ifn? not) (-> props)
        (-> props event-key ifn? not) (-> props (assoc event-key (fn [& params] (-> event-f         (apply params)))))
        :merge-event-fn               (-> props (assoc event-key (fn [& params] (-> event-f         (apply params))
                                                                                (-> props event-key (apply params)))))))
