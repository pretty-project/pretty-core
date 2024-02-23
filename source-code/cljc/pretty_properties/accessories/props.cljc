
(ns pretty-properties.accessories.props
    (:require [fruits.map.api :as map]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-overlay-props
  ; @description
  ; Applies the given default overlay properties on the given property map.
  ;
  ; @param (map) props
  ; {:overlay (keyword)(opt)
  ;  :overlay-color (keyword or string)(opt)
  ;  :overlay-opacity (keyword or number)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-overlay-props {...} {:overlay-color :invert})
  ; =>
  ; {:overlay-color :invert
  ;  ...}
  ;
  ; @return (map)
  ; {:overlay (keyword)
  ;  :overlay-color (keyword or string)
  ;  :overlay-opacity (keyword or number)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))
