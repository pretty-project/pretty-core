
(ns pretty-properties.live.tutorials)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Animation properties
;
; @title :animation-direction property
;
; @code Usage
; {:animation-direction (keyword)}
; {:animation-direction :ltr}
;
; @code Predefined values
; :ltr, :rtl, :ttb, :btt,
; :cw, :ccw
;
;
;
; @title :animation-duration property
;
; @code Usage
; {:animation-duration (ms)}
; {:animation-duration 250}
;
;
;
; @title :animation-mode property
;
; @code Usage
; {:animation-mode (keyword)}
; {:animation-mode :repeat}
;
; @code Predefined values
; :repeat, :single
;
;
;
; @title :animation-name property
;
; @code Usage
; {:animation-name (keyword or string)}
; {:animation-name :fade-in}
; {:animation-name "my-animation"}
;
; @code Predefined values
; :rotate-90, :rotate-180, :rotate-270, :rotate-360,
; :fade-in,   :fade-out,
; :slide-in,  :slide-out,
; :pop-in,    :pop-out,
; :poke-in,   :poke-out,
; :appear-in, :appear-out,
; :pulse

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Effect properties
;
; @title :click-effect property
;
; @code Usage
; {:click-effect (keyword)}
; {:click-effect :opacity}
;
; @code Predefined values
; :none, :opacity
;
;
;
; @title :hover-effect property
;
; @code Usage
; {:hover-effect (keyword)}
; {:hover-effect :opacity}
;
; @code Predefined values
; :none, :opacity

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Progress properties
;
; @title :progress property
;
; @code Usage
; {:progress (percent)}
; {:progress 42}
;
;
;
; @title :progress-color property
;
; @note
; Using predefined color values requires the presence of a set theme on the element / any ancestor element.
;
; @code Usage
; {:progress-color (keyword or string)}
; {:progress-color :primary}
; {:progress-color "#888"}
;
; @code Predefined values
; :default, :highlight, :invert, :muted, :primary, :secondary, :tertiary, :success, :warning
;
;
;
; @title :progress-direction property
;
; @code Usage
; {:progress-direction (keyword)}
; {:progress-direction :ltr}
;
; @code Predefined values
; :ltr, :rtl
;
;
;
; @title :progress-duration property
;
; @code Usage
; {:progress-duration (ms)}
; {:progress-duration 250}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Transform properties
;
; @title :transform property
;
; @code Usage
; {:transform (keyword or string)}
; {:transform :rotate-90}
; {:transform "rotateZ(90deg)"}
;
; @code Predefined values
; :rotate-90,  :rotate-180,  :rotate-270,  :rotate-360,
; :rotate--90, :rotate--180, :rotate--270, :rotate--360
