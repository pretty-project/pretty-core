
(ns pretty-standards.appearance.config)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @note (#4011)
; Property groups are applied if at least one property of the group is also present in the provided property map.
;
; @note (#4012)
; The '{:badge-content nil}' property is part of the group to ensure that the group is applied even if only the ':badge-content' property is provided.
;
; @constant (map)
; {:background-position (keyword)
;  :background-repeat? (boolean)
;  :background-size (keyword)
;  :background-uri (string)}
(def STANDARD-BACKGROUND-IMAGE-PROPERTIES
     {:background-position :center
      :background-repeat?  false
      :background-size     :cover
      :background-uri      nil})

; @note (#4011)
;
; @constant (map)
; {:border-color (keyword or string)
;  :border-position (keyword)
;  :border-width (keyword, px or string)}
(def STANDARD-BORDER-PROPERTIES
     {:border-color    :default
      :border-position :all
      :border-width    :xxs})

; @note (#4011)
;
; @constant (map)
; {:line-color (keyword or string)
;  :line-orientation (keyword)
;  :line-strength (keyword, px or string)}
(def STANDARD-LINE-PROPERTIES
     {:line-color       :default
      :line-orientation :horizontal
      :line-strength    :xxs})
