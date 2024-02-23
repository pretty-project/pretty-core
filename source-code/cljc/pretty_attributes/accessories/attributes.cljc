
(ns pretty-attributes.accessories.attributes
    (:require [fruits.map.api :as map]
              [pretty-attributes.utils :as utils]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn overlay-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the overlay related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:overlay (keyword)(opt)
  ;  :overlay-color (keyword or string)(opt)
  ;  :overlay-opacity (keyword)(opt)
  ;  ...}
  ;
  ; @usage
  ; (overlay-attributes {...} {:overlay :cover :overlay-color :invert :overlay-opacity :medium})
  ; =>
  ; {:data-overlay         :cover
  ;  :data-overlay-color   :invert
  ;  :data-overlay-opacity :medium
  ;  ...}
  ;
  ; @return (map)
  ; {:data-overlay (keyword)
  ;  :data-overlay-color (keyword)
  ;  :data-overlay-opacity (keyword)
  ;  :style (map)
  ;   {"--overlay-color" (string)
  ;    ...}
  ;  ...}
  [attributes {:keys [overlay overlay-color overlay-opacity]}]
  (-> attributes (map/assoc-some             :data-overlay                      overlay)
                 (map/assoc-some             :data-overlay-opacity              overlay-opacity)
                 (utils/apply-property-value :overlay-color :data-overlay-color overlay-color)))
