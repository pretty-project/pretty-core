
(ns pretty-properties.control.props
    #?(:clj  (:require [fruits.map.api                   :as map]
                       [pretty-properties.control.config :as control.config])
       :cljs (:require [dom.api                          :as dom]
                       [fruits.map.api                   :as map]
                       [pretty-properties.control.config :as control.config])))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-anchor-props
  ; @description
  ; - Applies the given default anchor properties on the given property map.
  ; - Applies the standard anchor properties on the given property map;
  ;   in case of any anchor related value is provided.
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
  ; {:href-target :self
  ;  :href-uri    "/my-uri"
  ;  ...}
  ;
  ; @return (map)
  ; {:href-target (keyword)(opt)
  ;  :href-uri (string)(opt)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)
            (map/use-default-value-group control.config/STANDARD-ANCHOR-PROPERTIES)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn clickable-text-auto-props
  ; @description
  ; Selects default text color for clickable elements based on the given properties.
  ;
  ; @param (map) props
  ; {:href-uri (string)(opt)
  ;  :on-click-f (string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (clickable-text-auto-props {:href-uri "/my-uri" ...})
  ; =>
  ; {:href-uri   "/my-uri"
  ;  :text-color :default
  ;  ...}
  ;
  ; @usage
  ; (clickable-text-auto-props {:on-click-f (fn [_] ...) ...})
  ; =>
  ; {:on-click-f (fn [_] ...)
  ;  :text-color :default
  ;  ...}
  ;
  ; @usage
  ; (clickable-text-auto-props {...})
  ; =>
  ; {:text-color :muted
  ;  ...}
  ;
  ; @return (map)
  ; {:text-color (keyword or string)
  ;  ...}
  [{:keys [href-uri on-click-f] :as props}]
  (cond on-click-f (map/use-default-values props {:text-color :default})
        href-uri   (map/use-default-values props {:text-color :default})
        :static    (map/use-default-values props {:text-color :muted})))

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
  ; - Applies the given default mouse event properties on the given property map.
  ; - In case the ':href-uri', ':on-click-f', ':on-mouse-down-f' or ':on-mouse-up-f' property is provided,
  ;   it extends the ':on-mouse-up-f' function with the 'dom.api/blur-active-element!' function
  ;   in the given property map to prevent clickable elements staying focused after a click event.
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
  ; {:on-click-f    (fn [_] ...)
  ;  :on-mouse-up-f (fn [_] ... (dom.api/blur-active-element!))
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
  [{:keys [href-uri on-click-f on-mouse-down-f on-mouse-up-f] :as props} & [default-props]]
  (letfn [(f0 [e] #?(:clj  (do (when on-mouse-up-f (on-mouse-up-f e)))
                     :cljs (do (when on-mouse-up-f (on-mouse-up-f e))
                               (when :always       (dom/blur-active-element!)))))]
         (cond on-click-f      (map/use-default-values props {:on-mouse-up-f f0} default-props)
               on-mouse-down-f (map/use-default-values props {:on-mouse-up-f f0} default-props)
               on-mouse-up-f   (map/use-default-values props {:on-mouse-up-f f0} default-props)
               href-uri        (map/use-default-values props {:on-mouse-up-f f0} default-props)
               :else           (map/use-default-values props {}                  default-props))))
