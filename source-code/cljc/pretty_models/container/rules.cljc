
(ns pretty-models.container.rules
    (:require [pretty-rules.api :as pretty-rules]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn container-model-rules
  [props]
  (-> props (pretty-rules/apply-auto-border-crop     props)
            (pretty-rules/auto-align-scrollable-flex props)
            (pretty-rules/auto-blur-click-events     props)
            (pretty-rules/auto-disable-cursor        props)
            (pretty-rules/auto-disable-mouse-events  props)
            (pretty-rules/auto-set-mounted           props)))
