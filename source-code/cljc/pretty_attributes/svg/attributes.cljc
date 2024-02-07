
(ns pretty-attributes.svg.attributes
    (:require [fruits.map.api          :as map]
              [pretty-attributes.utils :as utils]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn svg-circle-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the SVG circle related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:diameter (px)(opt)
  ;  :stroke-width (px)(opt)
  ;   Default: 0
  ;  ...}
  ;
  ; @usage
  ; (svg-circle-attributes {...} {:diameter 100 :stroke-width 10})
  ; =>
  ; {:cx 50
  ;  :cy 50
  ;  :r  45
  ;  ...}
  ;
  ; @return (map)
  ; {:cx (px)
  ;  :cy (px)
  ;  :r (px)
  ;  ...}
  [attributes {:keys [diameter stroke-width] :or {stroke-width 0}}]
  (-> attributes (map/merge-some {:cx (if diameter (/ diameter 2))
                                  :cy (if diameter (/ diameter 2))
                                  :r  (if diameter (/ (- diameter stroke-width) 2))})))

(defn svg-stroke-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the SVG stroke related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:stroke-color (keyword or string)(opt)
  ;  :stroke-pattern (string)(opt)
  ;  :stroke-width (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (svg-stroke-attributes {...} {:stroke-color :default :stroke-pattern "200, 100, 50" :stroke-width :s})
  ; =>
  ; {:data-stroke-color   :default
  ;  :data-stroke-pattern :var
  ;  :data-stroke-width   :s
  ;  :style {"--stroke-pattern" "200, 100, 50"}
  ;  ...}
  ;
  ; @return (map)
  ; {:data-stroke-color (keyword)
  ;  :data-stroke-pattern (keyword)
  ;  :data-stroke-width (keyword)
  ;  :style (map)
  ;   {"--stroke-color" (string)
  ;    "--stroke-pattern" (string)
  ;    "--stroke-width" (string)}
  ;  ...}
  [attributes {:keys [stroke-color stroke-pattern stroke-width]}]
  (-> attributes (utils/apply-property-value :stroke-color   :data-stroke-color   stroke-color)
                 (utils/apply-property-value :stroke-pattern :data-stroke-pattern stroke-pattern)
                 (utils/apply-property-value :stroke-width   :data-stroke-width   stroke-width "px")))
