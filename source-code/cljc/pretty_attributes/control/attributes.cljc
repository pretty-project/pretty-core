
(ns pretty-attributes.control.attributes
    (:require [fruits.map.api          :as map]
              [pretty-attributes.utils :as utils]))

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

(defn clickable-state-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; - Applies the clickable state related values on the given attribute map.
  ; - Applies the disabled state via the 'disabled' attribute (supported by form controls).
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:disabled? (boolean)(opt)
  ;  :tab-disabled? (boolean)(opt)
  ;  ...}
  ;
  ; @usage
  ; (clickable-state-attributes {...} {:disabled? true :tab-disabled? true})
  ; =>
  ; {:disabled  true
  ;  :tab-index -1
  ;  ...}
  ;
  ; @return (map)
  ; {:disabled (boolean)
  ;  :tab-index (integer)
  ;  ...}
  [attributes {:keys [disabled? tab-disabled?]}]
  (-> attributes (map/merge-some {:disabled  (-> disabled?)
                                  :tab-index (if tab-disabled? -1)})))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn mouse-event-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @note
  ; Automatically ignores mouse events on disabled elements.
  ;
  ; @description
  ; Applies the mouse event related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:disabled? (boolean)(opt)
  ;  :on-click-f (function)(opt)
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
  ;  :on-context-menu (function)}
  ;  :on-mouse-down (function)
  ;  :on-mouse-leave (function)
  ;  :on-mouse-over (function)
  ;  :on-mouse-up (function)
  ;  ...}
  [attributes {:keys [disabled? on-click-f on-mouse-down-f on-mouse-leave-f on-mouse-over-f on-mouse-up-f on-right-click-f]}]
  (if disabled? (-> attributes)
                (-> attributes (utils/apply-event-function :on-click        on-click-f)
                               (utils/apply-event-function :on-context-menu on-right-click-f) ; <- Test it!
                               (utils/apply-event-function :on-mouse-down   on-mouse-down-f)
                               (utils/apply-event-function :on-mouse-leave  on-mouse-leave-f)
                               (utils/apply-event-function :on-mouse-over   on-mouse-over-f)
                               (utils/apply-event-function :on-mouse-up     on-mouse-up-f))))
