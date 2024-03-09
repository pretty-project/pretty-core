
(ns pretty-models.text.standards
    (:require [pretty-standards.api :as pretty-standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn text-model-standard-props
  [props]
  (-> props (pretty-standards/standard-font-props)
            (pretty-standards/standard-text-props)))
