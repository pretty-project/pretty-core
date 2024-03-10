
(ns pretty-models.container.flex.rules
    (:require [pretty-rules.api :as pretty-rules]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn flex-container-rules
  [props]
  (-> props (pretty-rules/apply-auto-border-crop)
            (pretty-rules/auto-align-scrollable-flex)
            (pretty-rules/auto-blur-click-events)
            (pretty-rules/auto-disable-cursor)
            (pretty-rules/auto-disable-mouse-events)
            (pretty-rules/auto-set-mounted)))
