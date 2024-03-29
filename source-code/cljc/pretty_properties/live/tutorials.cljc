
(ns pretty-properties.live.tutorials)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Animation properties
;
; @note
; Using moving animations requires the animation direction to be set.
;
; @title animation-direction property
;
; @--- Accepted types
; {:animation-direction (keyword)}
;
; @--- Examples
; {:animation-direction :ltr}
;
; @--- Predefined values
; :ltr, :rtl, :ttb, :btt,
; :cw, :ccw
;
;
;
; @title animation-duration property
;
; @--- Accepted types
; {:animation-duration (ms)}
;
; @--- Examples
; {:animation-duration 250}
;
;
;
; @title animation-mode property
;
; @--- Accepted types
; {:animation-mode (keyword)}
;
; @--- Examples
; {:animation-mode :repeat}
;
; @--- Predefined values
; :repeat, :single
;
;
;
; @title animation-name property
;
; @--- Accepted types
; {:animation-name (keyword or string)}
;
; @--- Examples
; {:animation-name :fade-in}
; {:animation-name "my-animation"}
;
; @--- Predefined values
; :rotate-90, :rotate-180, :rotate-270, :rotate-360,
; :fade-in,   :fade-out,
; :slide-in,  :slide-out,
; :pop-in,    :pop-out,
; :poke-in,   :poke-out,
; :appear-in, :appear-out,
; :pulse

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Progress properties
;
; @note
; Using predefined color values requires the presence of a set theme on the element / any ancestor element.
;
; @title progress property
;
; @--- Accepted types
; {:progress (percent)}
;
; @--- Examples
; {:progress 42}
;
;
;
; @title progress-color property
;
; @--- Accepted types
; {:progress-color (keyword or string)}
;
; @--- Examples
; {:progress-color :primary}
; {:progress-color "#888"}
;
; @--- Predefined values
; :default, :highlight, :inverse, :muted, :primary, :secondary, :tertiary, :success, :warning
;
;
;
; @title progress-direction property
;
; @--- Accepted types
; {:progress-direction (keyword)}
;
; @--- Examples
; {:progress-direction :ltr}
;
; @--- Predefined values
; :ltr, :rtl
;
;
;
; @title progress-duration property
;
; @--- Accepted types
; {:progress-duration (ms)}
;
; @--- Examples
; {:progress-duration 250}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial transformation properties
;
; @title transform property
;
; @--- Accepted types
; {:transform (keyword or string)}
;
; @--- Examples
; {:transform :rotate-90}
; {:transform "rotateZ(90deg)"}
;
; @--- Predefined values
; :rotate-90,  :rotate-180,  :rotate-270,  :rotate-360,
; :rotate--90, :rotate--180, :rotate--270, :rotate--360
