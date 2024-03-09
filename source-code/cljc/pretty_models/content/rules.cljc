
(ns pretty-models.content.rules
    (:require [pretty-rules.api :as pretty-rules]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn content-model-rules
  [props]
  (-> props (pretty-rules/compose-content props)))