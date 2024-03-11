
(ns pretty-models.content.multiline.rules
    (:require [pretty-rules.api :as pretty-rules]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn multiline-content-rules
  ; @description
  ; Applies the rule functions of the multiline content model on the given property map.
  ;
  ; @param (map) props
  ;
  ; @return (map)
  [props]
  (-> props (pretty-rules/auto-count-content-lines)
            (pretty-rules/auto-limit-multiline-count)
            (pretty-rules/auto-set-multiline-height)
            (pretty-rules/compose-content)))
