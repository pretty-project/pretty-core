
(ns pretty-properties.live.props
    (:require [fruits.map.api :as map]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-animation-props
  ; @description
  ; Applies the given default animation properties on the given property map.
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
  ; {:animation-name :my-animation
  ;  ...}
  ;
  ; @return (map)
  ; {:animation-direction (keyword)
  ;  :animation-duration (ms)
  ;  :animation-mode (keyword)
  ;  :animation-name (keyword or string)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-effect-props
  ; @description
  ; Applies the given default effect properties on the given property map.
  ;
  ; @param (map) props
  ; {:click-effect (keyword)(opt)
  ;  :hover-effect (keyword)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-effect-props {...} {:click-effect :opacity})
  ; =>
  ; {:click-effect :opacity
  ;  ...}
  ;
  ; @return (map)
  ; {:click-effect (keyword)
  ;  :hover-effect (keyword)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-progress-props
  ; @description
  ; Applies the given default progress properties on the given property map.
  ;
  ; @param (map) props
  ; {:progress (percentage)(opt)
  ;  :progress-color (keyword or string)(opt)
  ;  :progress-direction (keyword)(opt)
  ;  :progress-duration (ms)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-progress-props {...} {:progress-color :primary})
  ; =>
  ; {:progress-color :primary
  ;  ...}
  ;
  ; @return (map)
  ; {:progress (percentage)
  ;  :progress-color (keyword or string)
  ;  :progress-direction (keyword)
  ;  :progress-duration (ms)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

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
