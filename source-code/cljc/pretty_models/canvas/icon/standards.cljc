
(ns pretty-models.canvas.icon.standards
    (:require [pretty-standards.api :as pretty-standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn icon-canvas-standard-props
  ; @description
  ; Associates the standard properties of the icon canvas model to the given property map.
  ;
  ; @param (map) props
  ;
  ; @return (map)
  [props]
  (-> props (pretty-standards/standard-icon-props)))
