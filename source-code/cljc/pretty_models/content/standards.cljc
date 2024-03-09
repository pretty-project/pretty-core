
(ns pretty-models.content.standards
    (:require [pretty-standards.api :as pretty-standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn content-model-standard-props
  [props]
  (-> props (pretty-standards/standard-font-props)
            (pretty-standards/standard-text-props)))
