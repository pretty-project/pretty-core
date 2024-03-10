
(ns pretty-models.content.grid.rules
    (:require [pretty-rules.api :as pretty-rules]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn grid-content-rules
  [props]
  (-> props (pretty-rules/compose-content)))
