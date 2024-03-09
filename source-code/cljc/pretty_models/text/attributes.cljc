
(ns pretty-models.text.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn text-model-content-attributes
  [props]
  (-> props (pretty-attributes/font-attributes props)
            (pretty-attributes/text-attributes props)))
