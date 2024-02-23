
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
; {:strength (percentage)}
(def STANDARD-SHAPE-PROPERTIES
     {:strength 100})

; @constant (map)
; {:height (keyword, px or string)
;  :width (keyword, px or string)}
(def STANDARD-SIZE-PROPERTIES
     {:height :content
      :width  :content})

; @constant (map)
; {:body-height (keyword, px or string)
;  :body-width (keyword, px or string)}
(def STANDARD-BODY-SIZE-PROPERTIES
     {:body-height :parent
      :body-width  :parent})
