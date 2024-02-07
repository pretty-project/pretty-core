
(ns pretty-properties.accessories.tutorials)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Badge properties
;
; @title :badge-color property
;
; @note
; Using predefined color values requires the presence of a set theme on the element / any ancestor element.
;
; @code Usage
; {:badge-color (keyword or string)}
; {:badge-color :primary}
; {:badge-color "#888"}
;
; @code Predefined values
; :transparent,
; :default, :highlight, :invert, :muted, :primary, :secondary, :tertiary, :success, :warning
;
;
;
; @title :badge-content property
;
; @note
; Check out the [cljc-metamorphic-content](https://mt-app-kit.github.io/cljc-metamorphic-content) library.
;
; @code Usage
; {:badge-content (metamorphic-content)}
; {:badge-content "My badge"}
; {:badge-content :my-badge-content}
;
;
;
; @title :badge-position property
;
; @code Usage
; {:badge-position (keyword)}
; {:badge-position :tr}
;
; @code Predefined values
; :left, :right, :bottom, :top,
; :tl, :tr, :br, :bl

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Bullet properties
;
; @title :bullet-color property
;
; @note
; Using predefined color values requires the presence of a set theme on the element / any ancestor element.
;
; @code Usage
; {:bullet-color (keyword or string)}
; {:bullet-color :primary}
; {:bullet-color "#888"}
;
; @code Predefined values
; :default, :highlight, :invert, :muted, :primary, :secondary, :tertiary, :success, :warning
;
;
;
; @title :bullet-position property
;
; @code Usage
; {:bullet-position (keyword)}
; {:bullet-position :tr}
;
; @code Predefined values
; :left, :right, :bottom, :top, :center

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Marker properties
;
; @title :marker-color property
;
; @note
; Using predefined color values requires the presence of a set theme on the element / any ancestor element.
;
; @code Usage
; {:marker-color (keyword or string)}
; {:marker-color :primary}
; {:marker-color "#888"}
;
; @code Predefined values
; :default, :highlight, :invert, :muted, :primary, :secondary, :tertiary, :success, :warning
;
;
;
; @title :marker-position property
;
; @code Usage
; {:marker-position (keyword)}
; {:marker-position :tr}
;
; @code Predefined values
; :left, :right, :bottom, :top,
; :tl, :tr, :br, :bl

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Tooltip properties
;
; @title :tooltip-content property
;
; @note
; Check out the [cljc-metamorphic-content](https://mt-app-kit.github.io/cljc-metamorphic-content) library.
;
; @code Usage
; {:tooltip-content (metamorphic-content)}
; {:tooltip-content "My tooltip"}
; {:tooltip-content :my-tooltip}
;
;
;
; @title :tooltip-position property
;
; @code Usage
; {:tooltip-position (keyword)}
; {:tooltip-position :left}
;
; @code Predefined values
; :left, :right
