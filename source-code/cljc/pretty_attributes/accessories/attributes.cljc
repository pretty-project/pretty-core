
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
  ; {:on-overlay-f (function)(opt)
  ;  :overlay (keyword)(opt)
  ;  :overlay-color (keyword or string)(opt)
  ;  :overlay-opacity (keyword)(opt)
  ;  ...}
  ;
  ; @usage
  ; (overlay-attributes {...} {:on-overlay-f (fn [_] ...) :overlay :cover :overlay-color :invert :overlay-opacity :medium})
  ; =>
  ; {:data-overlay         :cover
  ;  :data-overlay-color   :invert
  ;  :data-overlay-opacity :medium
  ;  :on-click             (fn [_] ...)
  ;  ...}
  ;
  ; @return (map)
  ; {:data-overlay (keyword)
  ;  :data-overlay-color (keyword)
  ;  :data-overlay-opacity (keyword)
  ;  :on-click (function)
  ;  :style (map)
  ;   {"--overlay-color" (string)
  ;    ...}
  ;  ...}
  [attributes {:keys [on-overlay-f overlay overlay-color overlay-opacity]}]
  (-> attributes (map/assoc-some             :data-overlay                      overlay)
                 (map/assoc-some             :data-overlay-opacity              overlay-opacity)
                 (utils/apply-property-value :overlay-color :data-overlay-color overlay-color)))
                ;(utils/apply-event-function :on-click on-overlay-f) ; <- Clicking on a child element also triggers the event :(
