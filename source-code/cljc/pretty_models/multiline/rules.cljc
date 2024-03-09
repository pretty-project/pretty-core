
(ns pretty-models.multiline.rules
    (:require [pretty-rules.api :as pretty-rules]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn multiline-model-rules
  [props]
  (-> props (pretty-rules/auto-count-content-lines)
            (pretty-rules/auto-limit-multiline-count)
            (pretty-rules/auto-set-multiline-height)))
