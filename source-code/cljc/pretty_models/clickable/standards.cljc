
(ns pretty-models.clickable.standards
    (:require [pretty-standards.api :as pretty-standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn clickable-model-standard-props
  [props]
  (-> props (pretty-standards/standard-anchor-props)
            (pretty-standards/standard-progress-props)))
