
(ns pretty-standards.input.config
    (:require [fruits.noop.api :refer [none return]]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @note (pretty-standards.appearance.config#4011)
; @note (pretty-standards.appearance.config#4012)
;
; @constant (map)
; {:get-options-f (function)
;  :option-color-f (function)
;  :option-helper-f (function)
;  :option-label-f (function)
;  :option-value-f (function)}
(def STANDARD-INPUT-OPTION-PROPERTIES
     {:get-options-f   nil
      :option-color-f  none
      :option-helper-f none
      :option-label-f  return
      :option-value-f  return})
