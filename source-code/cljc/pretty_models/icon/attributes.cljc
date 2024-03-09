
(ns pretty-models.icon.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn icon-model-content-attributes
  [attributes props]
  (-> attributes (pretty-attributes/icon-attributes props)))
