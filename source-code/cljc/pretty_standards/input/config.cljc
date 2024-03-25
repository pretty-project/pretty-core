
(ns pretty-standards.input.config)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @constant (map)
; {:autofill-style (keyword)}
(def STANDARD-INPUT-AUTOFILL-PROPERTIES
     {:autofill-style :normalized})

; @note (pretty-standards.appearance.config#4011)
; @note (pretty-standards.appearance.config#4012)
;
; @constant (map)
; {:option-highlighted (map)
;  :option-selected (map)
;  :option-value-f (function)
;  :options (maps in vector)}
(def STANDARD-INPUT-OPTION-PROPERTIES
     {:option-highlighted {}
      :option-selected    {}
      :option-value-f     nil
      :options            nil})
