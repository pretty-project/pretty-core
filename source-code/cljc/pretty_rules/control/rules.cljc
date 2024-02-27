
(ns pretty-rules.control.rules
    #?(:clj  (:require [fruits.map.api :as map])
       :cljs (:require [dom.api        :as dom]
                       [fruits.map.api :as map])))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn auto-disable-mouse-events
  ; @description
  ; Dissociates the mouse event properties of disabled elements.
  ;
  ; @param (map) props
  ; {:disabled? (boolean)(opt)
  ;  ...}
  ;
  ; @usage
  ; (auto-disable-mouse-events {:disabled? true :on-click-f (fn [_] ...)})
  ; =>
  ; {:disabled? true
  ;  ...}
  ;
  ; @return (map)
  [{:keys [disabled?] :as props}]
  (if disabled? (-> props (dissoc :on-click-f :on-mouse-down-f :on-mouse-leave-f :on-mouse-over-f :on-mouse-up-f :on-right-click-f))
                (-> props)))

(defn auto-blur-click-events
  ; @description
  ; In case the ':href-uri', ':on-click-f', ':on-mouse-down-f' or ':on-mouse-up-f' property is provided,
  ; it extends the ':on-mouse-up-f' function with the 'dom.api/blur-active-element!' function
  ; in the given property map to prevent clickable elements staying focused after a click event.
  ;
  ; @param (map) props
  ; {:href-uri (string)(opt)
  ;  :on-click-f (function)(opt)
  ;  :on-mouse-down-f (function)(opt)
  ;  :on-mouse-up-f (function)(opt)
  ;  ...}
  ;
  ; @usage
  ; (auto-blur-click-events {:on-click-f (fn [_] ...) ...})
  ; =>
  ; {:on-click-f    (fn [_] ...)
  ;  :on-mouse-up-f (fn [_] ... (dom.api/blur-active-element!))
  ;  ...}
  ;
  ; @return (map)
  [{:keys [href-uri on-click-f on-mouse-down-f on-mouse-up-f] :as props}]
  (letfn [(f0 [e] #?(:clj  (do (when on-mouse-up-f (on-mouse-up-f e)))
                     :cljs (do (when on-mouse-up-f (on-mouse-up-f e))
                               (when :always       (dom/blur-active-element!)))))]
         (cond on-click-f      (-> props (map/use-default-values {:on-mouse-up-f f0}))
               on-mouse-down-f (-> props (map/use-default-values {:on-mouse-up-f f0}))
               on-mouse-up-f   (-> props (map/use-default-values {:on-mouse-up-f f0}))
               href-uri        (-> props (map/use-default-values {:on-mouse-up-f f0}))
               :else           (-> props))))
