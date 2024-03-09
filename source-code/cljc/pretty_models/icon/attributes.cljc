
(ns pretty-models.icon.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn icon-model-content-attributes
  [props]
  (-> props (pretty-attributes/icon-attributes props)))
