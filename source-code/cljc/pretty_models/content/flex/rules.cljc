
(ns pretty-models.content.flex.rules
    (:require [pretty-rules.api :as pretty-rules]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn flex-content-rules
  [props]
  (-> props (pretty-rules/auto-align-scrollable-flex)
            (pretty-rules/compose-content)))
