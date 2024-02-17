
(ns pretty-standards.svg.standards
    (:require [fruits.map.api               :as map]
              [pretty-standards.svg.config :as svg.config]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn standard-svg-stroke-props
  ; @description
  ; Applies the standard SVG stroke properties on the given property map; in case of any SVG stroke related value is provided.
  ;
  ; @param (map) props
  ; {:stroke-color (keyword or string)(opt)
  ;  :stroke-pattern (string)(opt)
  ;  :stroke-width (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-svg-stroke-props {:stroke-color :primary ...})
  ; =>
  ; {:stroke-color :primary
  ;  :stroke-width 1
  ;  ...}
  ;
  ; @return (map)
  ; {:stroke-color (keyword or string)
  ;  :stroke-pattern (string)
  ;  :stroke-width (keyword, px or string)
  ;  ...}
  [props]
  (-> props (map/use-default-value-group svg.config/STANDARD-SVG-STROKE-PROPERTIES)))
