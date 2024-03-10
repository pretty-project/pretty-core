
(ns pretty-models.content.grid.standards
    (:require [pretty-standards.api :as pretty-standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn grid-content-standard-props
  [props]
  (-> props (pretty-standards/standard-content-size-props)
            (pretty-standards/standard-font-props)
            (pretty-standards/standard-text-props)))
