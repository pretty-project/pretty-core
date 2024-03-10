
(ns pretty-models.content.plain.rules
    (:require [pretty-rules.api :as pretty-rules]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn plain-content-rules
  [props]
  (-> props (pretty-rules/compose-content)))
