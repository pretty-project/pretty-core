
(ns pretty-standards.data.config
    (:require [fruits.noop.api :refer [none return]]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @note (pretty-standards.appearance.config#4011)
; @note (pretty-standards.appearance.config#4012)
;
; @constant (map)
; {:datum-color-f (function)
;  :datum-label-f (function)
;  :datum-value-f (function)
;  :get-data-f (function)}
(def STANDARD-DATA-PROPERTIES
     {:datum-color-f none
      :datum-label-f none
      :datum-value-f return
      :get-data-f    nil})
