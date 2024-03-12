
(ns pretty-properties.utils)

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
  (if (-> props event-key ifn? not)
      (-> props (assoc event-key (fn [& params] (-> event-f         (apply params)))))
      (-> props (assoc event-key (fn [& params] (-> event-f         (apply params))
                                                (-> props event-key (apply params)))))))
