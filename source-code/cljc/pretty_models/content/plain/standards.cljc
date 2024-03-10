
(ns pretty-models.content.plain.standards
    (:require [pretty-standards.api :as pretty-standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn plain-content-standard-props
  [props]
  (-> props (pretty-standards/standard-content-size-props)
            (pretty-standards/standard-font-props)
            (pretty-standards/standard-text-props)))
