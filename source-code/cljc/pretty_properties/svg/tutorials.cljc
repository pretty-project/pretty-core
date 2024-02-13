
(ns pretty-properties.svg.tutorials)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial SVG circle properties
;
; @title diameter property
;
; @--- Accepted types
; {:diameter (px)}
;
; @--- Examples
; {:diameter 48}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial SVG stroke properties
;
; @note
; Using predefined color values requires the presence of a set theme on the element / any ancestor element.
;
; @title stroke-color property
;
; @--- Accepted types
; {:stroke-color (keyword or string)}
;
; @--- Examples
; {:stroke-color :primary}
; {:stroke-color "#888"}
;
; @--- Predefined values
; :transparent,
; :default, :highlight, :invert, :muted, :primary, :secondary, :tertiary, :success, :warning
;
;
;
; @title stroke-pattern property
;
; @--- Accepted types
; {:stroke-pattern (keyword, px or string)}
;
; @--- Examples
; {:stroke-pattern :full}
; {:stroke-pattern 10}
; {:stroke-pattern "10, 20"}
;
; @--- Predefined values
; :full
;
;
;
; @title stroke-width property
;
; @--- Accepted types
; {:stroke-width (keyword, px or string)}
;
; @--- Examples
; {:stroke-width :xs}
; {:stroke-width 10}
; {:stroke-width "10px"}
; {:stroke-width "5%"}
;
; @--- Predefined values
; :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
