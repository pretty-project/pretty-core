
(ns pretty-models.icon.standards
    (:require [pretty-standards.api :as pretty-standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn icon-model-standard-props
  [props]
  (-> props (pretty-standards/standard-icon-props)))
