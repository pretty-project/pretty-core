
(ns pretty-properties.svg.config)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @note (pretty-properties.accessories.config#4011)
; @note (pretty-properties.accessories.config#4012)
;
; @constant (map)
; {:stroke-color (keyword or string)
;  :stroke-pattern (string)
;  :stroke-width (keyword, px or string)}
(def STANDARD-SVG-STROKE-PROPERTIES
     {:stroke-color   :default
      :stroke-pattern nil
      :stroke-width   1})
