
(ns pretty-properties.svg.props
    (:require [fruits.map.api :as map]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-svg-circle-props
  ; @description
  ; Applies the given default SVG circle properties on the given property map.
  ;
  ; @param (map) props
  ; {:diameter (px)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-svg-circle-props {...} {:diameter 48})
  ; =>
  ; {:diameter 48
  ;  ...}
  ;
  ; @return (map)
  ; {:diameter (px)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-svg-stroke-props
  ; @description
  ; Applies the given default SVG stroke properties on the given property map.
  ;
  ; @param (map) props
  ; {:stroke-color (keyword or string)(opt)
  ;  :stroke-pattern (string)(opt)
  ;  :stroke-width (keyword, px or string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-svg-stroke-props {...} {:stroke-color :primary})
  ; =>
  ; {:stroke-color :primary
  ;  ...}
  ;
  ; @return (map)
  ; {:stroke-color (keyword or string)
  ;  :stroke-pattern (string)
  ;  :stroke-width (keyword, px or string)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))
