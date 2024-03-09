
(ns pretty-models.plain.rules
    (:require [pretty-rules.api :as pretty-rules]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn plain-model-rules
  [props]
  (-> props (pretty-rules/apply-auto-border-crop    props)
            (pretty-rules/auto-blur-click-events    props)
            (pretty-rules/auto-disable-mouse-events props)
            (pretty-rules/auto-set-mounted          props)))
