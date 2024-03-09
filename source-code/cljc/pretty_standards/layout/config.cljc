
(ns pretty-standards.layout.config)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @note (pretty-standards.appearance.config#4011)
; @note (pretty-standards.appearance.config#4012)
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

; @constant (map)
; {:strength (percent)}
(def STANDARD-SHAPE-PROPERTIES
     {:strength 100})

; @note (pretty-standards.appearance.config#4011)
; @note (pretty-standards.appearance.config#4012)
;
; @constant (map)
; {:inner-position (keyword)
;  :inner-position-method (keyword)}
(def STANDARD-INNER-POSITION-PROPERTIES
     {:inner-position        nil
      :inner-position-method :flex})

; @note (pretty-standards.appearance.config#4011)
; @note (pretty-standards.appearance.config#4012)
;
; @constant (map)
; {:outer-position (keyword)
;  :outer-position-method (keyword)}
(def STANDARD-OUTER-POSITION-PROPERTIES
     {:outer-position        nil
      :outer-position-method :absolute})

; @constant (map)
; {:inner-height (keyword, px or string)
;  :inner-width (keyword, px or string)}
(def STANDARD-INNER-SIZE-PROPERTIES
     {:inner-height :parent
      :inner-width  :parent})

; @constant (map)
; {:outer-height (keyword, px or string)
;  :outer-width (keyword, px or string)}
(def STANDARD-OUTER-SIZE-PROPERTIES
     {:outer-height :content
      :outer-width  :content})
