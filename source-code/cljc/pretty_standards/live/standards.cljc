
(ns pretty-standards.live.standards
    (:require [fruits.map.api               :as map]
              [pretty-standards.live.config :as live.config]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn standard-animation-props
  ; @description
  ; Applies the standard animation properties on the given property map; in case of any animation related value is provided.
  ;
  ; @param (map) props
  ; {:animation-direction (keyword)(opt)
  ;  :animation-duration (ms)(opt)
  ;  :animation-mode (keyword)(opt)
  ;  :animation-name (keyword or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-animation-props {:animation-name :my-animation ...})
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
  [props]
  (-> props (map/use-default-value-group live.config/STANDARD-ANIMATION-PROPERTIES)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn standard-progress-props
  ; @description
  ; Applies the standard progress properties on the given property map; in case of any progress related value is provided.
  ;
  ; @param (map) props
  ; {:progress (percentage)(opt)
  ;  :progress-color (keyword or string)(opt)
  ;  :progress-direction (keyword)(opt)
  ;  :progress-duration (ms)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-progress-props {:progress 42 ...})
  ; =>
  ; {:progress           42
  ;  :progress-color     :default
  ;  :progress-direction :ltr
  ;  :progress-duration  350
  ;  ...}
  ;
  ; @return (map)
  ; {:progress (percentage)
  ;  :progress-color (keyword or string)
  ;  :progress-direction (keyword)
  ;  :progress-duration (ms)
  ;  ...}
  [props]
  (-> props (map/use-default-value-group live.config/STANDARD-PROGRESS-PROPERTIES)))
