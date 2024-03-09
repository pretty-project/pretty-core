
(ns pretty-models.line.standards
    (:require [pretty-standards.api :as pretty-standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn line-model-standard-props
  [props]
  (-> props (pretty-standards/standard-line-props)))
