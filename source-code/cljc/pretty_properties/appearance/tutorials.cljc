
(ns pretty-properties.appearance.tutorials)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Background color properties
;
; @note
; Using predefined color values requires the presence of a set theme on the element / any ancestor element.
;
; @title fill-color property
;
; @--- Accepted types
; {:fill-color (keyword or string)}
;
; @--- Examples
; {:fill-color :primary}
; {:fill-color "#888"}
;
; @--- Predefined values
; :transparent,
; :default, :highlight, :invert, :muted, :primary, :secondary, :tertiary, :success, :warning
;
;
;
; @title fill-pattern property
;
; @--- Accepted types
; {:fill-pattern (keyword)}
;
; @--- Examples
; {:fill-pattern :striped}
;
; @--- Predefined values
; :cover, :striped

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Background image properties
;
; @title background-position property
;
; @--- Accepted types
; {:background-position (keyword)}
;
; @--- Examples
; {:background-position :center}
;
; @--- Predefined values
; :top, :right, :bottom, :left, :center
;
;
;
; @title background-size property
;
; @--- Accepted types
; {:background-size (keyword)}
;
; @--- Examples
; {:background-size :cover}
;
; @--- Predefined values
; :cover, :contain
;
;
;
; @title background-uri property
;
; @--- Accepted types
; {:background-uri (string)}
;
; @--- Examples
; {:background-uri "/my-image.png"}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Border properties
;
; @note
; Using predefined color values requires the presence of a set theme on the element / any ancestor element.
;
; @title border-color property
;
; @--- Accepted types
; {:border-color (keyword or string)}
;
; @--- Examples
; {:border-color :primary}
; {:border-color "#888"}
;
; @--- Predefined values
; :transparent,
; :default, :highlight, :invert, :muted, :primary, :secondary, :tertiary, :success, :warning
;
;
;
; @title border-crop property
;
; @note
; Border cropping is hiding overflow content of an element to force descendant elements to use
; the same border radius as the element (without inheriting the 'border-radius' css property).
;
; @note
; The '{:border-crop :auto}' setting ensures that the cropping is only applied when the ':border-radius' property is also provided.
;
; @--- Accepted types
; {:border-crop (keyword)}
;
; @--- Examples
; {:border-crop :auto}
;
; @--- Predefined values
; :auto, :crop
;
;
;
; @title border-position property
;
; @--- Accepted types
; {:border-position (keyword)}
;
; @--- Examples
; {:border-position :top}
;
; @--- Predefined values
; :all,
; :bottom, :left, :right, :top,
; :horizontal, :vertical
;
;
;
; @title border-radius property
;
; @--- Accepted types
; {:border-radius (map) {:all, :tl, :tr, :br, :bl (keyword, px or string)}}
;
; @--- Examples
; {:border-radius {:all :xs}}
; {:border-radius {:all :xs :tr :xxl}}
; {:border-radius {:all 10}}
; {:border-radius {:all "10px"}}
; {:border-radius {:all "5%"}}
;
; @--- Predefined values
; :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title border-width property
;
; @--- Accepted types
; {:border-width (keyword, px or string)}
;
; @--- Examples
; {:border-width :xs}
; {:border-width 10}
; {:border-width "10px"}
; {:border-width "5%"}
;
; @--- Predefined values
; :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Line properties
;
; @note
; Using predefined color values requires the presence of a set theme on the element / any ancestor element.
;
; @title line-color property
;
; @--- Accepted types
; {:line-color (keyword or string)}
;
; @--- Examples
; {:line-color :primary}
; {:line-color "#888"}
;
; @--- Predefined values
; :transparent,
; :default, :highlight, :invert, :muted, :primary, :secondary, :tertiary, :success, :warning
;
;
;
; @title line-orientation property
;
; @--- Accepted types
; {:line-orientation (keyword)}
;
; @--- Examples
; {:line-orientation :horizontal}
;
; @--- Predefined values
; :horizontal, :vertical
;
;
;
; @title line-size property
;
; @--- Accepted types
; {:line-size (keyword, px or string)}
;
; @--- Examples
; {:line-size :auto}
; {:line-size 10}
; {:line-size "10px"}
; {:line-size "5%"}
;
; @--- Predefined values
; :auto, :parent, :grow
;
;
;
; @title line-size property
;
; @--- Accepted types
; {:line-strength (keyword, px or string)}
;
; @--- Examples
; {:line-strength :xs}
; {:line-strength 10}
; {:line-strength "10px"}
; {:line-strength "5%"}
;
; @--- Predefined values
; :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Shadow properties
;
; @note
; Using predefined color values requires the presence of a set theme on the element / any ancestor element.
;
; @title shadow-color property
;
; @--- Accepted types
; {:shadow-color (keyword or string)}
;
; @--- Examples
; {:shadow-color :primary}
; {:shadow-color "#888"}
;
; @--- Predefined values
; :transparent,
; :default, :highlight, :invert, :muted, :primary, :secondary, :tertiary, :success, :warning

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Theme properties
;
; @title theme property
;
; @--- Accepted types
; {:theme (keyword)}
;
; @--- Examples
; {:theme :my-theme}
;
; @--- Predefined values
; :hard-light, :soft-light, :hard-dark, :soft-dark

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Visibility properties
;
; @title opacity property
;
; @--- Accepted types
; {:opacity (keyword or number)}
;
; @--- Examples
; {:opacity :soft}
; {:opacity 0.5}
;
; @--- Predefined values
; :soft, :medium, :hard, :full
