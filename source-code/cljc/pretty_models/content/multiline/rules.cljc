
(ns pretty-models.content.multiline.rules
    (:require [pretty-rules.api :as pretty-rules]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn multiline-content-rules
  [props]
  (-> props (pretty-rules/auto-align-scrollable-flex)
            (pretty-rules/auto-count-content-lines)
            (pretty-rules/auto-limit-multiline-count)
            (pretty-rules/auto-set-multiline-height)
            (pretty-rules/compose-content)))
