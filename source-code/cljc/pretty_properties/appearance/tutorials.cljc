
(ns pretty-properties.appearance.tutorials)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Background color properties
;
; @title :fill-color property
;
; @note
; Using predefined color values requires the presence of a set theme on the element / any ancestor element.
;
; @code Usage
; {:fill-color (keyword or string)}
; {:fill-color :primary}
; {:fill-color "#888"}
;
; @code Predefined values
; :transparent,
; :default, :highlight, :invert, :muted, :primary, :secondary, :tertiary, :success, :warning
;
;
;
; @title :fill-pattern property
;
; @code Usage
; {:fill-pattern (keyword)}
; {:fill-pattern :striped}
;
; @code Predefined values
; :cover, :striped
;
;
;
; @title :hover-color property
;
; @note
; Using predefined color values requires the presence of a set theme on the element / any ancestor element.
;
; @code Usage
; {:hover-color (keyword or string)}
; {:hover-color :primary}
; {:hover-color "#888"}
;
; @code Predefined values
; :transparent,
; :default, :highlight, :invert, :muted, :primary, :secondary, :tertiary, :success, :warning
;
;
;
; @title :hover-pattern property
;
; @code Usage
; {:hover-pattern (keyword)}
; {:hover-pattern :striped}
;
; @code Predefined values
; :cover, :striped

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Background image properties
;
; @title :background-position property
;
; @code Usage
; {:background-position (keyword)}
; {:background-position :center}
;
; @code Predefined values
; :top, :right, :bottom, :left, :center
;
;
;
; @title :background-repeat? property
;
; @code Usage
; {:background-repeat? (keyword)}
; {:background-repeat? true}
;
;
;
; @title :background-size property
;
; @code Usage
; {:background-size (keyword)}
; {:background-size :cover}
;
; @code Predefined values
; :cover, :contain
;
;
;
; @title :background-uri property
;
; @code Usage
; {:background-uri (string)}
; {:background-uri "/my-image.png"}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Border properties
;
; @title :border-color property
;
; @note
; Using predefined color values requires the presence of a set theme on the element / any ancestor element.
;
; @code Usage
; {:border-color (keyword or string)}
; {:border-color :primary}
; {:border-color "#888"}
;
; @code Predefined values
; :transparent,
; :default, :highlight, :invert, :muted, :primary, :secondary, :tertiary, :success, :warning
;
;
;
; @title :border-position property
;
; @code Usage
; {:border-position (keyword)}
; {:border-position :top}
;
; @code Predefined values
; :all,
; :bottom, :left, :right, :top,
; :horizontal, :vertical
;
;
;
; @title :border-radius property
;
; @code Usage
; {:border-radius (map) {:all, :tl, :tr, :br, :bl (keyword, px or string)}}
; {:border-radius {:all :xs}}
; {:border-radius {:all :xs :tr :xxl}}
; {:border-radius {:all 10}}
; {:border-radius {:all "10px"}}
; {:border-radius {:all "5%"}}
;
; @code Predefined values
; :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title :border-width property
;
; @code Usage
; {:border-width (keyword, px or string)}
; {:border-width :xs}
; {:border-width 10}
; {:border-width "10px"}
; {:border-width "5%"}
;
; @code Predefined values
; :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Line properties
;
; @title :line-color property
;
; @note
; Using predefined color values requires the presence of a set theme on the element / any ancestor element.
;
; @code Usage
; {:line-color (keyword or string)}
; {:line-color :primary}
; {:line-color "#888"}
;
; @code Predefined values
; :transparent,
; :default, :highlight, :invert, :muted, :primary, :secondary, :tertiary, :success, :warning
;
;
;
; @title :line-orientation property
;
; @code Usage
; {:line-orientation (keyword)}
; {:line-orientation :horizontal}
;
; @code Predefined values
; :horizontal, :vertical
;
;
;
; @title :line-strength property
;
; @code Usage
; {:line-strength (keyword, px or string)}
; {:line-strength :xs}
; {:line-strength 10}
; {:line-strength "10px"}
; {:line-strength "5%"}
;
; @code Predefined values
; :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Shadow properties
;
; @title :shadow-color property
;
; @note
; Using predefined color values requires the presence of a set theme on the element / any ancestor element.
;
; @code Usage
; {:shadow-color (keyword or string)}
; {:shadow-color :primary}
; {:shadow-color "#888"}
;
; @code Predefined values
; :transparent,
; :default, :highlight, :invert, :muted, :primary, :secondary, :tertiary, :success, :warning

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Theme properties
;
; @title :theme property
;
; @code Usage
; {:theme (keyword)}
; {:theme :my-theme}
;
; @code Predefined values
; :hard-light, :soft-light, :hard-dark, :soft-dark

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Visibility properties
;
; @title :opacity property
;
; @code Usage
; {:opacity (keyword or number)}
; {:opacity :soft}
; {:opacity 0.5}
;
; @code Predefined values
; :soft, :medium, :hard, :full
