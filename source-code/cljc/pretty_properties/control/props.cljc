
(ns pretty-properties.control.props
    (:require [fruits.map.api :as map]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-anchor-props
  ; @description
  ; Applies the given default anchor properties on the given property map.
  ;
  ; @param (map) props
  ; {:href-target (keyword)(opt)
  ;  :href-uri (string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-anchor-props {...} {:href-uri "/my-uri"})
  ; =>
  ; {:href-uri "/my-uri"
  ;  ...}
  ;
  ; @return (map)
  ; {:href-target (keyword)(opt)
  ;  :href-uri (string)(opt)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-clickable-state-props
  ; @description
  ; Applies the given default clickable state properties on the given property map.
  ;
  ; @param (map) props
  ; {:disabled? (keyword)(opt)
  ;  :highlighted? (boolean)(opt)
  ;  :tab-disabled? (keyword)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-clickable-state-props {...} {:tab-disabled? true})
  ; =>
  ; {:tab-disabled? true
  ;  ...}
  ;
  ; @return (map)
  ; {:disabled? (keyword)
  ;  :highlighted? (boolean)
  ;  :tab-disabled? (boolean)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-keypress-props
  ; @description
  ; Applies the given default keypress properties on the given property map.
  ;
  ; @param (map) props
  ; {:keypress (map)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-keypress-props {...} {:keypress {:key-code 27}})
  ; =>
  ; {:keypress {:key-code 27}
  ;  ...}
  ;
  ; @return (map)
  ; {:keypress (map)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-mouse-event-props
  ; @description
  ; Applies the given default mouse event properties on the given property map.
  ;
  ; @param (map) props
  ; {:on-click-f (function)(opt)
  ;  :on-click-timeout (ms)(opt)
  ;  :on-mouse-down-f (function)(opt)
  ;  :on-mouse-leave-f (function)(opt)
  ;  :on-mouse-over-f (function)(opt)
  ;  :on-mouse-up-f (function)(opt)
  ;  :on-right-click-f (function)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-mouse-event-props {:on-click-f (fn [_] ...) ...})
  ; =>
  ; {:on-click-f (fn [_] ...)
  ;  ...}
  ;
  ; @return (map)
  ; {:on-click-f (function)(opt)
  ;  :on-click-timeout (ms)(opt)
  ;  :on-mouse-down-f (function)(opt)
  ;  :on-mouse-leave-f (function)(opt)
  ;  :on-mouse-over-f (function)(opt)
  ;  :on-mouse-up-f (function)(opt)
  ;  :on-right-click-f (function)(opt)
  ;  ...}
  [{:keys [on-click-f on-mouse-down-f on-mouse-up-f] :as props} & [default-props]]
  (-> props (map/use-default-values default-props)))
