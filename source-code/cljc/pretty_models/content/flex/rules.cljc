
(ns pretty-models.content.flex.rules
    (:require [pretty-rules.api :as pretty-rules]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn flex-content-rules
  ; @description
  ; Applies the rule functions of the flex content model on the given property map.
  ;
  ; @param (map) props
  ;
  ; @return (map)
  [props]
  (-> props (pretty-rules/auto-align-scrollable-flex)
            (pretty-rules/compose-content)))
