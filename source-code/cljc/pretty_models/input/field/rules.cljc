
(ns pretty-models.input.field.rules
    (:require [pretty-rules.api :as pretty-rules]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn field-input-rules
  [props]
  (-> props (pretty-rules/assoc-field-value-as-content)
            (pretty-rules/auto-disable-input-autofill)
            (pretty-rules/auto-disable-input-events)
            (pretty-rules/generate-input-autofill)))
