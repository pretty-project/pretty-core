
(ns pretty-models.shape.standards
    (:require [pretty-standards.api :as pretty-standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn shape-model-standard-props
  [props]
  (-> props (pretty-standards/standard-shape-props)))
