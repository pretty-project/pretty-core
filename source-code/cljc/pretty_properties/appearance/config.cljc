
(ns pretty-properties.appearance.config)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @note (pretty-properties.accessories.config#4011)
;
; @constant (map)
; {:border-color (keyword or string)
;  :border-position (keyword)
;  :border-width (keyword, px or string)}
(def STANDARD-BORDER-PROPERTIES
     {:border-color    :default
      :border-position :all
      :border-width    :xxs})

; @note (pretty-properties.accessories.config#4011)
;
; @constant (map)
; {:line-color (keyword or string)
;  :line-orientation (keyword)
;  :line-strength (keyword, px or string)}
(def STANDARD-LINE-PROPERTIES
     {:line-color       :default
      :line-orientation :horizontal
      :line-strength    :xxs})
