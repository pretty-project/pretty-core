
(ns pretty-models.content.flex.standards
    (:require [pretty-standards.api :as pretty-standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn flex-content-standard-props
  [props]
  (-> props (pretty-standards/standard-content-size-props)
            (pretty-standards/standard-flex-props)
            (pretty-standards/standard-font-props)
            (pretty-standards/standard-text-props)))
