
(ns pretty-attributes.control.attributes
    (:require [fruits.map.api          :as map]
              [fruits.hiccup.api :as hiccup]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn anchor-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the anchor related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:href-target (keyword)(opt)
  ;  :href-uri (string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (anchor-attributes {...} {:href-target :blank :href-uri "/my-link"})
  ; =>
  ; {:href-target :_blank
  ;  :href-uri    "/my-link"
  ;  ...}
  ;
  ; @return (map)
  ; {:href (string)
  ;  :target (keyword)
  ;  ...}
  [attributes {:keys [href-target href-uri]}]
  (let [href-target (case href-target :blank :_blank :self :_self nil)]
       (-> attributes (map/merge-some {:href   href-uri
                                       :target href-target}))))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn focus-event-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the focus event related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:on-blur-f (function)(opt)
  ;  :on-focus-f (function)(opt)
  ;  ...}
  ;
  ; @usage
  ; (focus-event-attributes {...} {:on-blur-f (fn [_] ...) :on-focus-f (fn [_] ...)})
  ; =>
  ; {:on-blur  (fn [_] ...)
  ;  :on-focus (fn [_] ...)
  ;  ...}
  ;
  ; @return (map)
  ; {:on-blur (function)
  ;  :on-focus (function)
  ;  ...}
  [attributes {:keys [on-blur-f on-focus-f]}]
  (-> attributes (hiccup/merge-event-fn :on-blur  on-blur-f)
                 (hiccup/merge-event-fn :on-focus on-focus-f)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn mouse-event-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the mouse event related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:on-click-f (function)(opt)
  ;  :on-mouse-down-f (function)(opt)
  ;  :on-mouse-leave-f (function)(opt)
  ;  :on-mouse-over-f (function)(opt)
  ;  :on-mouse-up-f (function)(opt)
  ;  :on-right-click-f (function)(opt)
  ;  ...}
  ;
  ; @usage
  ; (mouse-event-attributes {...} {:on-click-f (fn [_] ...)})
  ; =>
  ; {:on-click (fn [_] ...)
  ;  ...}
  ;
  ; @return (map)
  ; {:on-click (function)
  ;  :on-context-menu (function)
  ;  :on-mouse-down (function)
  ;  :on-mouse-leave (function)
  ;  :on-mouse-over (function)
  ;  :on-mouse-up (function)
  ;  ...}
  [attributes {:keys [on-click-f on-mouse-down-f on-mouse-leave-f on-mouse-over-f on-mouse-up-f on-right-click-f]}]
  (-> attributes (hiccup/merge-event-fn :on-click        on-click-f)
                 (hiccup/merge-event-fn :on-context-menu on-right-click-f) ; <- Test it!
                 (hiccup/merge-event-fn :on-mouse-down   on-mouse-down-f)
                 (hiccup/merge-event-fn :on-mouse-leave  on-mouse-leave-f)
                 (hiccup/merge-event-fn :on-mouse-over   on-mouse-over-f)
                 (hiccup/merge-event-fn :on-mouse-up     on-mouse-up-f)))
