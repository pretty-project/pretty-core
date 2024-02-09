
(ns pretty-properties.input.tutorials)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Input autofill properties
;
; @title :autofill-name property
;
; @code Usage
; {:autofill-name (keyword)}
; {:autofill-name :password}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Input field properties
;
; @title :date-from property
;
; @code Usage
; {:date-from (string)}
; {:date-from "2020-04-20"}
;
;
;
; @title :date-to property
;
; @code Usage
; {:date-to (string)}
; {:date-to "2020-05-01"}
;
;
;
; @title :field-from property
;
; @code Usage
; {:field-from (number)}
; {:field-from 16}
;
;
;
; @title :field-to property
;
; @code Usage
; {:field-to (number)}
; {:field-to 32}
;
;
;
; @title :field-type property
;
; @code Usage
; {:field-type (keyword)}
; {:field-type :password}
;
;
;
; @title :max-length property
;
; @code Usage
; {:max-length (integer)}
; {:max-length 69}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Input guide properties
;
; @title :error-text property
;
; @note
; Check out the [cljc-metamorphic-content](https://mt-app-kit.github.io/cljc-metamorphic-content) library.
;
; @code Usage
; {:error-text (metamorphic-content)}
; {:error-text "My error text"}
; {:error-text :my-dictionary-term}
; {:error-text [:div "My error text"]}
; {:error-text [my-error-text-component]}
; {:error-text 123456}
;
;
;
; @title :helper-text property
;
; @code Usage
; {:helper-text (metamorphic-content)}
; {:helper-text "My helper text"}
; {:helper-text :my-dictionary-term}
; {:helper-text [:div "My helper text"]}
; {:helper-text [my-helper-text-component]}
; {:helper-text 123456}
;
;
;
; @title :info-text property
;
; @code Usage
; {:info-text (metamorphic-content)}
; {:info-text "My info text"}
; {:info-text :my-dictionary-term}
; {:info-text [:div "My info text"]}
; {:info-text [my-info-text-component]}
; {:info-text 123456}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Input option properties
;
; @title :get-options-f property
;
; @code Usage
; {:get-options-f (function)}
; {:get-options-f (fn [] ...)}
;
;
;
; @title :option-color-f property
;
; @code Usage
; {:option-color-f (function)}
; {:option-color-f (fn [option] ...)}
; {:option-color-f :color}
;
;
;
; @title :option-helper-f property
;
; @code Usage
; {:option-helper-f (function)}
; {:option-helper-f (fn [option] ...)}
; {:option-helper-f :helper}
;
;
;
; @title :option-label-f property
;
; @code Usage
; {:option-label-f (function)}
; {:option-label-f (fn [option] ...)}
; {:option-label-f :label}
;
;
;
; @title :option-value-f property
;
; @code Usage
; {:option-value-f (function)}
; {:option-value-f (fn [option] ...)}
; {:option-value-f :value}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Input state properties
;
; @title :disabled? property
;
; @code Usage
; {:disabled? (boolean)}
; {:disabled? true}
