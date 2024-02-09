
(ns pretty-properties.layout.config)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @note (pretty-properties.accessories.config#4011)
; @note (pretty-properties.accessories.config#4012)
;
; @constant (map)
; {:gap (keyword, px or string)
;  :horizontal-align (keyword)
;  :orientation (keyword)
;  :overflow (keyword)
;  :vertical-align (keyword)}
(def STANDARD-FLEX-PROPERTIES
     {:gap              nil
      :horizontal-align :center
      :orientation      nil
      :overflow         nil
      :vertical-align   :center})

; @note (pretty-properties.accessories.config#4011)
;
; @constant (map)
; {:strength (percentage)}
(def STANDARD-SHAPE-PROPERTIES
     {:strength 100})
