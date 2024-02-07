
(ns pretty-attributes.accessories.attributes
    (:require [fruits.map.api          :as map]
              [pretty-attributes.utils :as utils]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn badge-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the badge related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:badge-color (keyword or string)(opt)
  ;  :badge-content (string)(opt)
  ;  :badge-position (keyword)(opt)}
  ;
  ; @usage
  ; (badge-attributes {...} {:badge-color :primary :badge-content "420" :badge-position :tr})
  ; =>
  ; {:data-badge-color    :primary
  ;  :data-badge-content  "420"
  ;  :data-badge-position :tr
  ;  ...}
  ;
  ; @return (map)
  ; {:data-badge-color (keyword)
  ;  :data-badge-content (string)
  ;  :data-badge-position (keyword)
  ;  :style (map)
  ;   {"--badge-color" (string)}
  ;  ...}
  [attributes {:keys [badge-color badge-content badge-position]}]
  (-> (map/merge-some attributes {:data-badge-content  badge-content
                                  :data-badge-position badge-position})
      (utils/apply-property-value :badge-color :data-badge-color badge-color)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn bullet-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the bullet related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:bullet-color (keyword or string)(opt)
  ;  :bullet-position (keyword)(opt)}
  ;
  ; @usage
  ; (bullet-attributes {...} {:bullet-color :primary :bullet-position :left})
  ; =>
  ; {:data-bullet-color    :primary
  ;  :data-bullet-position :left
  ;  ...}
  ;
  ; @return (map)
  ; {:data-bullet-color (keyword)
  ;  :data-bullet-position (keyword)
  ;  :style (map)
  ;   {"--bullet-color" (string)}
  ;  ...}
  [attributes {:keys [bullet-color bullet-position]}]
  (-> (map/merge-some attributes {:data-bullet-position bullet-position})
      (utils/apply-property-value :bullet-color :data-bullet-color bullet-color)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn marker-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the marker related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:marker-color (keyword or string)(opt)
  ;  :marker-position (keyword)(opt)}
  ;
  ; @usage
  ; (marker-attributes {...} {:marker-color :primary :marker-position :tr})
  ; =>
  ; {:data-marker-color    :primary
  ;  :data-marker-position :tr
  ;  ...}
  ;
  ; @return (map)
  ; {:data-marker-color (keyword)
  ;  :data-marker-position (keyword)
  ;  :style (map)
  ;   {"--marker-color" (string)}
  ;  ...}
  [attributes {:keys [marker-color marker-position]}]
  (-> (map/merge-some attributes {:data-marker-position marker-position})
      (utils/apply-property-value :marker-color :data-marker-color marker-color)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn tooltip-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @note
  ; Automatically turns off the tooltip on disabled elements.
  ;
  ; @description
  ; Applies the tooltip related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:disabled? (boolean)(opt)
  ;  :tooltip-content (string)(opt)
  ;  :tooltip-position (keyword)(opt)}
  ;
  ; @usage
  ; (tooltip-attributes {...} {:tooltip-content "My tooltip" :tooltip-position :left})
  ; =>
  ; {:data-tooltip-content  "My tooltip"
  ;  :data-tooltip-position :left
  ;  ...}
  ;
  ; @usage
  ; (tooltip-attributes {...} {:tooltip-content "My tooltip" :tooltip-position :left
  ;                            :disabled? true})
  ; =>
  ; {...}
  ;
  ; @return (map)
  ; {:data-tooltip-content (string)
  ;  :data-tooltip-position (keyword)
  ;  ...}
  [attributes {:keys [disabled? tooltip-content tooltip-position]}]
  (if disabled? (map/merge-some attributes {})
                (map/merge-some attributes {:data-tooltip-content  tooltip-content
                                            :data-tooltip-position tooltip-position})))
