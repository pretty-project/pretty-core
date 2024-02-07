
(ns pretty-properties.accessories.props
    (:require [fruits.map.api                       :as map]
              [metamorphic-content.api              :as metamorphic-content]
              [pretty-properties.accessories.config :as accessories.config]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-badge-props
  ; @description
  ; - Applies the given default badge properties on the given property map.
  ; - Applies the standard badge properties on the given property map;
  ;   in case of any badge related value is provided.
  ; - Composes ':badge-content' metamorphic content value (if any).
  ;
  ; @param (map) props
  ; {:badge-color (keyword or string)(opt)
  ;  :badge-content (metamorphic-content)(opt)
  ;  :badge-position (keyword)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-badge-props {...} {:badge-content "My badge"})
  ; =>
  ; {:badge-color    :default
  ;  :badge-content  "My badge"
  ;  :badge-position :br
  ;  ...}
  ;
  ; @return (map)
  ; {:badge-color (keyword or string)
  ;  :badge-content (metamorphic-content)
  ;  :badge-position (keyword)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)
            (map/update-some :badge-content metamorphic-content/compose)
            (map/use-default-value-group accessories.config/STANDARD-BADGE-PROPERTIES)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-bullet-props
  ; @description
  ; - Applies the given default bullet properties on the given property map.
  ; - Applies the standard bullet properties on the given property map;
  ;   in case of any bullet related value is provided.
  ;
  ; @param (map) props
  ; {:bullet-color (keyword or string)(opt)
  ;  :bullet-position (keyword)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-bullet-props {...} {:bullet-color :primary})
  ; =>
  ; {:bullet-color    :primary
  ;  :bullet-position :center
  ;  ...}
  ;
  ; @return (map)
  ; {:bullet-color (keyword or string)
  ;  :bullet-position (keyword)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)
            (map/use-default-value-group accessories.config/STANDARD-BULLET-PROPERTIES)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-marker-props
  ; @description
  ; - Applies the given default marker properties on the given property map.
  ; - Applies the standard marker properties on the given property map;
  ;   in case of any marker related value is provided.
  ;
  ; @param (map) props
  ; {:marker-color (keyword or string)(opt)
  ;  :marker-position (keyword)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-marker-props {...} {:marker-color :primary})
  ; =>
  ; {:marker-color    :primary
  ;  :marker-position :tr
  ;  ...}
  ;
  ; @return (map)
  ; {:marker-color (keyword or string)
  ;  :marker-position (keyword)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)
            (map/use-default-value-group accessories.config/STANDARD-MARKER-PROPERTIES)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-tooltip-props
  ; @description
  ; - Applies the given default tooltip properties on the given property map.
  ; - Applies the standard tooltip properties on the given property map;
  ;   in case of any tooltip related value is provided.
  ; - Composes ':tooltip-content' metamorphic content value (if any).
  ;
  ; @param (map) props
  ; {:tooltip-content (metamorphic-content)(opt)
  ;  :tooltip-position (keyword)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-tooltip-props {...} {:tooltip-content "My tooltip"})
  ; =>
  ; {:tooltip-content  "My tooltip"
  ;  :tooltip-position :right
  ;  ...}
  ;
  ; @return (map)
  ; {:tooltip-content (metamorphic-content)
  ;  :tooltip-position (keyword)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)
            (map/update-some :tooltip-content metamorphic-content/compose)
            (map/use-default-value-group accessories.config/STANDARD-TOOLTIP-PROPERTIES)))
