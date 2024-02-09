
(ns pretty-properties.content.tutorials)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Cursor properties
;
; @title :cursor property
;
; @code Usage
; {:cursor (keyword or string)}
; {:cursor :pointer}
; {:cursor "my-cursor"}
;
; @code Predefined values
; :default, :disabled, :grab, :grabbing, :move, :pointer, :progress

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Font properties
;
; @note
; - Set the 'font-size' CSS property on the HTML element to set up the REM value of the page.
; - Pretty font attributes use the page REM value to scale font profiles.
; - Changing the REM value scales up/down font sizes and other corresponding values.
;
; @code
; html { font-size: 10px }
;
; @title :font-size property
;
; @code Usage
; {:font-size (keyword, px or string)}
; {:font-size :xs}
; {:font-size 10}
; {:font-size "10px"}
; {:font-size "0.5rem"}
;
; @code Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title :font-weight property
;
; @code Usage
; {:font-weight (keyword)}
; {:font-weight :medium}
;
; @code Predefined values
; :thin, :extra-light, :light, :normal , :medium, :semi-bold, :bold, :extra-bold, :black, :extra-black
;
;
;
; @title :letter-spacing property
;
; @code Usage
; {:letter-spacing (keyword, px or string)}
; {:letter-spacing :xs}
; {:letter-spacing 1}
; {:letter-spacing "1px"}
; {:letter-spacing "0.1rem"}
;
; @code Predefined values
; :auto,
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title :line-height property
;
; @code Usage
; {:line-height (keyword, px or string)}
; {:line-height :xs}
; {:line-height 20}
; {:line-height "20px"}
; {:line-height "2rem"}
;
; @code Predefined values
; :auto, :text-block,
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Icon properties
;
; @title :icon-color property
;
; @note
; Using predefined color values requires the presence of a set theme on the element / any ancestor element.
;
; @code Usage
; {:icon-color (keyword or string)}
; {:icon-color :primary}
; {:icon-color "#888"}
;
; @code Predefined values
; :default, :highlight, :invert, :muted, :primary, :secondary, :tertiary, :success, :warning
;
;
;
; @title :icon-family property
;
; @code Usage
; {:icon-family (keyword)}
; {:icon-family :material-symbols-outlined}
;
; @code Predefined values
; :material-icons-filled, :material-icons-outlined, :material-symbols-filled, :material-symbols-outlined
;
;
;
; @title :icon-size property
;
; @code Usage
; {:icon-size (keyword, px or string)}
; {:icon-size :xs}
; {:icon-size 20}
; {:icon-size "20px"}
; {:icon-size "2rem"}
;
; @code Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Image properties
;
; @title :image-alt property
;
; @code Usage
; {:image-alt (string)}
; {:image-alt "My image"}
;
;
;
; @title :image-uri property
;
; @code Usage
; {:image-uri (string)}
; {:image-uri "/my-image.png"}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Text properties
;
; @title :text-align property
;
; @code Usage
; {:text-align (keyword)}
; {:text-align :left}
;
; @code Predefined values
; :left, :center, :right
;
;
;
; @title :text-caret property
;
; @code Usage
; {:text-caret (keyword)}
; {:text-caret :hidden}
;
; @code Predefined values
; :default, :hidden
;
;
;
; @title :text-color property
;
; @note
; Using predefined color values requires the presence of a set theme on the element / any ancestor element.
;
; @code Usage
; {:text-color (keyword or string)}
; {:text-color :primary}
; {:text-color "#888"}
;
; @code Predefined values
; :default, :highlight, :invert, :muted, :primary, :secondary, :tertiary, :success, :warning
;
;
;
; @title :text-direction property
;
; @code Usage
; {:text-direction (keyword)}
; {:text-direction :xs}
;
; @code Predefined values
; :normal, :reversed
;
;
;
; @title :text-overflow property
;
; @code Usage
; {:text-overflow (keyword)}
; {:text-overflow :ellipsis}
;
; @code Predefined values
; :ellipsis, :hidden, :visible, :wrap
;
;
;
; @title :text-selectable? property
;
; @code Usage
; {:text-selectable? (boolean)}
; {:text-selectable? true}
;
;
;
; @title :text-transform property
;
; @code Usage
; {:text-transform (keyword)}
; {:text-transform :uppercase}
;
; @code Predefined values
; :capitalize, :lowercase, :uppercase

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Content properties
;
; @title :content property
;
; @note
; Check out the [cljc-metamorphic-content](https://mt-app-kit.github.io/cljc-metamorphic-content) library.
;
; @code Usage
; {:content (metamorphic-content)}
; {:content "My content"}
; {:content :my-dictionary-term}
; {:content [:div "My content"]}
; {:content [my-content-component]}
; {:content 123456}
;
;
;
; @title :content-placeholder property
;
; @note
; The ':content-placeholder' property is the fallback value of the ':content' property in case it has no value.
;
; @code Usage
; {:content-placeholder (metamorphic-content)}
; {:content-placeholder "My content placeholder"}
; {:content-placeholder :my-dictionary-term}
; {:content-placeholder [:div "My content placeholder"]}
; {:content-placeholder [my-content-placeholder-component]}
; {:content-placeholder 123456}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Label properties
;
; @title :label property
;
; @note
; Check out the [cljc-metamorphic-content](https://mt-app-kit.github.io/cljc-metamorphic-content) library.
;
; @code Usage
; {:label (metamorphic-content)}
; {:label "My label"}
; {:label :my-dictionary-term}
; {:label [:div "My label"]}
; {:label [my-label-component]}
; {:label 123456}
;
;
;
; @title :label-placeholder property
;
; @note
; The ':label-placeholder' property is the fallback value of the ':label' property in case it has no value.
;
; @code Usage
; {:label-placeholder (metamorphic-label)}
; {:label-placeholder "My label placeholder"}
; {:label-placeholder :my-dictionary-term}
; {:label-placeholder [:div "My label placeholder"]}
; {:label-placeholder [my-label-placeholder-component]}
; {:label-placeholder 123456}
