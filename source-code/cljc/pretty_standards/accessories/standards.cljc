
(ns pretty-standards.accessories.standards
    (:require [fruits.map.api :as map]
              [pretty-standards.accessories.config :as accessories.config]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn standard-overlay-props
  ; @description
  ; Applies the standard overlay properties on the given property map; in case of any overlay related value is provided.
  ;
  ; @param (map) props
  ; {:on-overlay-f (function)(opt)
  ;  :overlay (keyword)(opt)
  ;  :overlay-color (keyword or string)(opt)
  ;  :overlay-opacity (keyword or number)(opt)
  ;  ...}
  ;
  ; @usage
  ; (standard-overlay-props {:overlay-color :invert ...})
  ; =>
  ; {:overlay         :cover
  ;  :overlay-color   :invert
  ;  :overlay-opacity :medium
  ;  ...}
  ;
  ; @return (map)
  ; {:on-overlay-f (function)
  ;  :overlay (keyword)
  ;  :overlay-color (keyword or string)
  ;  :overlay-opacity (keyword or number)
  ;  ...}
  [props]
  (-> props (map/use-default-value-group accessories.config/STANDARD-OVERLAY-PROPERTIES)))
