
(ns pretty-properties.svg.tutorials)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial SVG circle properties
;
; @title :diameter property
;
; @code Usage
; {:diameter (px)}
; {:diameter 48}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial SVG stroke properties
;
; @title :stroke-color property
;
; @note
; Using predefined color values requires the presence of a set theme on the element / any ancestor element.
;
; @code Usage
; {:stroke-color (keyword or string)}
; {:stroke-color :primary}
; {:stroke-color "#888"}
;
; @code Predefined values
; :transparent,
; :default, :highlight, :invert, :muted, :primary, :secondary, :tertiary, :success, :warning
;
;
;
; @title :stroke-pattern property
;
; @code Usage
; {:stroke-pattern (keyword, px or string)}
; {:stroke-pattern :full}
; {:stroke-pattern 10}
; {:stroke-pattern "10, 20"}
;
; @code Predefined values
; :full
;
;
;
; @title :stroke-width property
;
; @code Usage
; {:stroke-width (keyword, px or string)}
; {:stroke-width :xs}
; {:stroke-width 10}
; {:stroke-width "10px"}
; {:stroke-width "5%"}
;
; @code Predefined values
; :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
