
(ns pretty-models.content.plain.standards
    (:require [pretty-standards.api :as pretty-standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn plain-content-standard-props
  ; @description
  ; Associates the standard properties of the plain content model to the given property map.
  ;
  ; @param (map) props
  ;
  ; @return (map)
  [props]
  (-> props (pretty-standards/standard-content-size-props)
            (pretty-standards/standard-font-props)
            (pretty-standards/standard-text-props)))
