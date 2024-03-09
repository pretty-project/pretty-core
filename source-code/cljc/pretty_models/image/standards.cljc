
(ns pretty-models.image.standards
    (:require [pretty-standards.api :as pretty-standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn image-model-standard-props
  [props]
  (-> props (pretty-standards/standard-background-image-props)))
