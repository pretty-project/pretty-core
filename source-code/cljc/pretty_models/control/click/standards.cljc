
(ns pretty-models.control.click.standards
    (:require [pretty-standards.api :as pretty-standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn click-control-standard-props
  ; @description
  ; Associates the standard properties of the click control model to the given property map.
  ;
  ; @param (map) props
  ;
  ; @return (map)
  [props]
  (-> props (pretty-standards/standard-anchor-props)
            (pretty-standards/standard-progress-props)))
