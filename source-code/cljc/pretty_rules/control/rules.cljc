
(ns pretty-rules.control.rules
    #?(:clj  (:require [fruits.hiccup.api     :as hiccup]
                       [fruits.map.api        :as map]
                       [pretty-properties.api :as pretty-properties])
       :cljs (:require [dom.api               :as dom]
                       [fruits.hiccup.api     :as hiccup]
                       [fruits.map.api        :as map]
                       [pretty-properties.api :as pretty-properties])))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn auto-disable-focus-events
  ; @description
  ; Dissociates the focus event properties of disabled elements.
  ;
  ; @param (map) props
  ; {:disabled? (boolean)(opt)
  ;  ...}
  ;
  ; @usage
  ; (auto-disable-focus-events {:disabled? true :on-focus-f (fn [_] ...)})
  ; =>
  ; {:disabled? true
  ;  ...}
  ;
  ; @return (map)
  [{:keys [disabled?] :as props}]
  (if disabled? (-> props (dissoc :on-blur-f :on-focus-f))
                (-> props)))

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
  ; Extends the ':on-mouse-up-f' function with the 'dom.api/blur-active-element!' function
  ; in the given property map to prevent clickable elements staying focused after a click event.
  ;
  ; @param (map) props
  ;
  ; @usage
  ; (auto-blur-click-events {:on-click-f (fn [_] ...) ...})
  ; =>
  ; {:on-click-f    (fn [_] ...)
  ;  :on-mouse-up-f (fn [_] ... (dom.api/blur-active-element!))
  ;  ...}
  ;
  ; @return (map)
  ; {:on-mouse-up-f (function)
  ;  ...}
  [props]
  (if (-> props pretty-properties/clickable-props?)
      (-> props (hiccup/merge-event-fn :on-mouse-up-f #?(:cljs dom/blur-active-element!)))
      (-> props)))
