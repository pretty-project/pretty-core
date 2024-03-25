
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
  (-> props (pretty-rules/compose-content)             ; 1. Composes the content.
            (pretty-rules/auto-count-content-lines)    ; 2. Counts newlines in content (if string).
            (pretty-rules/auto-limit-multiline-count)  ; 3. Limits line count.
            (pretty-rules/auto-set-multiline-height))) ; 4. Uses line count to set height.
