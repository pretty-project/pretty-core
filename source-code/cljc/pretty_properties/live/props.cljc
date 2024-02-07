
(ns pretty-properties.live.props
    (:require [fruits.map.api                :as map]
              [pretty-properties.live.config :as live.config]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-animation-props
  ; @description
  ; - Applies the given default animation properties on the given property map.
  ; - Applies the standard animation properties on the given property map;
  ;   in case of any animation related value is provided.
  ;
  ; @param (map) props
  ; {:animation-direction (keyword)(opt)
  ;  :animation-duration (ms)(opt)
  ;  :animation-mode (keyword)(opt)
  ;  :animation-name (keyword or string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-animation-props {...} {:animation-name :my-animation})
  ; =>
  ; {:animation-duration 350
  ;  :animation-mode     :single
  ;  :animation-name     :my-animation
  ;  ...}
  ;
  ; @return (map)
  ; {:animation-direction (keyword)
  ;  :animation-duration (ms)
  ;  :animation-mode (keyword)
  ;  :animation-name (keyword or string)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)
            (map/use-default-value-group live.config/STANDARD-ANIMATION-PROPERTIES)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-effect-props
  ; @description
  ; - Applies the given default effect properties on the given property map.
  ; - In case the ':href-uri' or ':on-click-f' property is provided, it uses
  ;   the ':opacity' as default value for the ':click-effect' property in the given property map.
  ;
  ; @param (map) props
  ; {:href-uri (string)(opt)
  ;  :on-click-f (string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-effect-props {...} {:href-uri "/my-uri"})
  ; =>
  ; {:click-effect :opacity
  ;  :href-uri     "/my-uri"
  ;  ...}
  ;
  ; @return (map)
  ; {:click-effect (keyword)
  ;  ...}
  [{:keys [href-uri on-click-f] :as props} & [default-props]]
  (cond on-click-f (map/use-default-values props {:click-effect :opacity} default-props)
        href-uri   (map/use-default-values props {:click-effect :opacity} default-props)
        :static    (map/use-default-values props {}                       default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-progress-props
  ; @description
  ; - Applies the given default progress properties on the given property map.
  ; - Applies the standard progress properties on the given property map;
  ;   in case of any progress related value is provided.
  ;
  ; @param (map) props
  ; {:progress (percent)(opt)
  ;  :progress-color (keyword or string)(opt)
  ;  :progress-direction (keyword)(opt)
  ;  :progress-duration (ms)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-progress-props {...} {:progress 42})
  ; =>
  ; {:progress           42
  ;  :progress-color     :default
  ;  :progress-direction :ltr
  ;  :progress-duration  350
  ;  ...}
  ;
  ; @return (map)
  ; {:progress (percent)
  ;  :progress-color (keyword or string)
  ;  :progress-direction (keyword)
  ;  :progress-duration (ms)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)
            (map/use-default-value-group live.config/STANDARD-PROGRESS-PROPERTIES)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-transform-props
  ; @description
  ; Applies the given default transform properties on the given property map.
  ;
  ; @param (map) props
  ; {:transform (keyword or string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-transform-props {...} {:transform :rotate-90})
  ; =>
  ; {:transform :rotate-90
  ;  ...}
  ;
  ; @return (map)
  ; {:transform (keyword or string)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))
