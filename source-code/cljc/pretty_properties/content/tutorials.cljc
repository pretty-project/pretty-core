
(ns pretty-properties.content.tutorials)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Cursor properties
;
; @title cursor property
;
; @--- Accepted types
; {:cursor (keyword or string)}
;
; @--- Examples
; {:cursor :pointer}
; {:cursor "my-cursor"}
;
; @--- Predefined values
; :default, :disabled, :grab, :grabbing, :move, :pointer, :progress

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Dropdown properties
;
; @links
; Check out the [cljc-multitype-content](https://mt-app-kit.github.io/cljc-multitype-content) library.
;
; @title dropdown-content property
;
; @--- Accepted types
; {:dropdown-content (multitype-content)}
;
; @--- Examples
; {:dropdown-content "My dropdown content"}
; {:dropdown-content :my-dictionary-term}
; {:dropdown-content [:div "My dropdown content"]}
; {:dropdown-content [my-dropdown-content-component]}
; {:dropdown-content 123456}
;
;
;
; @title dropdown-menu-id property
;
; @--- Accepted types
; {:dropdown-menu-id (keyword)}
;
; @--- Examples
; {:dropdown-menu-id :my-dropdown-menu}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Font properties
;
; @note
; - Set the 'font-size' CSS property on the HTML element to set up the REM value of the page.
; - Pretty font attributes use the page REM value to scale font profiles.
; - Changing the REM value scales up/down font sizes and other corresponding values.
;
; @---
; html { font-size: 10px }
;
; @title font-size property
;
; @--- Accepted types
; {:font-size (keyword, px or string)}
;
; @--- Examples
; {:font-size :xs}
; {:font-size 10}
; {:font-size "10px"}
; {:font-size "0.5rem"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title font-weight property
;
; @--- Accepted types
; {:font-weight (keyword)}
;
; @--- Examples
; {:font-weight :medium}
;
; @--- Predefined values
; :thin, :extra-light, :light, :normal , :medium, :semi-bold, :bold, :extra-bold, :black, :extra-black
;
;
;
; @title letter-spacing property
;
; @--- Accepted types
; {:letter-spacing (keyword, px or string)}
;
; @--- Examples
; {:letter-spacing :xs}
; {:letter-spacing 1}
; {:letter-spacing "1px"}
; {:letter-spacing "0.1rem"}
;
; @--- Predefined values
; :auto,
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title line-height property
;
; @--- Accepted types
; {:line-height (keyword, px or string)}
;
; @--- Examples
; {:line-height :xs}
; {:line-height 20}
; {:line-height "20px"}
; {:line-height "2rem"}
;
; @--- Predefined values
; :auto, :text-block,
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Icon properties
;
; @links
; [fonts.google.com/icons](https://fonts.google.com/icons)
;
; @note
; Using predefined color values requires the presence of a set theme on the element / any ancestor element.
;
; @title icon-color property
;
; @--- Accepted types
; {:icon-color (keyword or string)}
;
; @--- Examples
; {:icon-color :primary}
; {:icon-color "#888"}
;
; @--- Predefined values
; :default, :highlight, :invert, :muted, :primary, :secondary, :tertiary, :success, :warning
;
;
;
; @title icon-family property
;
; @--- Accepted types
; {:icon-family (keyword)}
;
; @--- Examples
; {:icon-family :material-symbols-outlined}
;
; @--- Predefined values
; :material-icons-filled, :material-icons-outlined, :material-symbols-filled, :material-symbols-outlined
;
;
;
; @title icon-name property
;
; @--- Accepted types
; {:icon-name (keyword)}
;
; @--- Examples
; {:icon-name :material_icon_name}
; {:icon-name :material_symbol_name}
;
;
;
; @title icon-position property
;
; Works only for icons attached to labels.
;
; @--- Accepted types
; {:icon-position (keyword)}
;
; @--- Examples
; {:icon-position :left}
;
; @--- Predefined values
; :left, :right
;
;
;
; @title icon-size property
;
; @--- Accepted types
; {:icon-size (keyword, px or string)}
;
; @--- Examples
; {:icon-size :xs}
; {:icon-size 20}
; {:icon-size "20px"}
; {:icon-size "2rem"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Image properties
;
; @title image-alt property
;
; @--- Accepted types
; {:image-alt (string)}
;
; @--- Examples
; {:image-alt "My image"}
;
;
;
; @title image-uri property
;
; @--- Accepted types
; {:image-uri (string)}
;
; @--- Examples
; {:image-uri "/my-image.png"}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Multiline properties
;
; @title line-count property
;
; @--- Accepted types
; {:line-count (integer)}
;
; @--- Examples
; {:line-count 10}
;
;
;
; @title max-lines property
;
; @--- Accepted types
; {:max-lines (integer)}
;
; @--- Examples
; {:max-lines 15}
;
;
;
; @title min-lines property
;
; @--- Accepted types
; {:min-lines (integer)}
;
; @--- Examples
; {:min-lines 5}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Text properties
;
; @note
; Using predefined color values requires the presence of a set theme on the element / any ancestor element.
;
; @title text-align property
;
; @--- Accepted types
; {:text-align (keyword)}
;
; @--- Examples
; {:text-align :left}
;
; @--- Predefined values
; :left, :center, :right
;
;
;
; @title text-caret property
;
; @--- Accepted types
; {:text-caret (keyword)}
;
; @--- Examples
; {:text-caret :hidden}
;
; @--- Predefined values
; :default, :hidden
;
;
;
; @title text-color property
;
; @--- Accepted types
; {:text-color (keyword or string)}
;
; @--- Examples
; {:text-color :primary}
; {:text-color "#888"}
;
; @--- Predefined values
; :default, :highlight, :invert, :muted, :primary, :secondary, :tertiary, :success, :warning
;
;
;
; @title text-direction property
;
; @--- Accepted types
; {:text-direction (keyword)}
;
; @--- Examples
; {:text-direction :xs}
;
; @--- Predefined values
; :normal, :reversed
;
;
;
; @title text-overflow property
;
; @--- Accepted types
; {:text-overflow (keyword)}
;
; @--- Examples
; {:text-overflow :ellipsis}
;
; @--- Predefined values
; :ellipsis, :hidden, :visible, :wrap
;
;
;
; @title text-selectable? property
;
; @--- Accepted types
; {:text-selectable? (boolean)}
;
; @--- Examples
; {:text-selectable? true}
;
;
;
; @title text-transform property
;
; @--- Accepted types
; {:text-transform (keyword)}
;
; @--- Examples
; {:text-transform :uppercase}
;
; @--- Predefined values
; :capitalize, :lowercase, :uppercase

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Content properties
;
; @links
; Check out the [cljc-multitype-content](https://mt-app-kit.github.io/cljc-multitype-content) library.
;
; @note
; The ':content-placeholder' property provides fallback value for the ':content' property in case it has no value.
;
; @title content property
;
; @--- Accepted types
; {:content (multitype-content)}
;
; @--- Examples
; {:content "My content"}
; {:content :my-dictionary-term}
; {:content [:div "My content"]}
; {:content [my-content-component]}
; {:content 123456}
;
;
;
; @title content-placeholder property
;
; @--- Accepted types
; {:content-placeholder (multitype-content)}
;
; @--- Examples
; {:content-placeholder "My content placeholder"}
; {:content-placeholder :my-dictionary-term}
; {:content-placeholder [:div "My content placeholder"]}
; {:content-placeholder [my-content-placeholder-component]}
; {:content-placeholder 123456}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Label properties
;
; @links
; Check out the [cljc-multitype-content](https://mt-app-kit.github.io/cljc-multitype-content) library.
;
; @note
; The ':label-placeholder' property provides fallback value for the ':label' property in case it has no value.
;
; @title label property
;
; @--- Accepted types
; {:label (multitype-content)}
;
; @--- Examples
; {:label "My label"}
; {:label :my-dictionary-term}
; {:label [:div "My label"]}
; {:label [my-label-component]}
; {:label 123456}
;
;
;
; @title label-placeholder property
;
; @--- Accepted types
; {:label-placeholder (metamorphic-label)}
;
; @--- Examples
; {:label-placeholder "My label placeholder"}
; {:label-placeholder :my-dictionary-term}
; {:label-placeholder [:div "My label placeholder"]}
; {:label-placeholder [my-label-placeholder-component]}
; {:label-placeholder 123456}
