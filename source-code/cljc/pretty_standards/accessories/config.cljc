
(ns pretty-standards.accessories.config)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @note (pretty-standards.appearance.config#4011)
; @note (pretty-standards.appearance.config#4012)
;
; @constant (map)
; {:on-overlay-f (function)
;  :overlay (keyword)
;  :overlay-color (keyword or string)
;  :overlay-opacity (keyword or number)}
(def STANDARD-OVERLAY-PROPERTIES
     {:on-overlay-f    nil
      :overlay         :cover
      :overlay-color   nil
      :overlay-opacity :medium})
