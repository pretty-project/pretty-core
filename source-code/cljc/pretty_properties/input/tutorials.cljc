
(ns pretty-properties.input.tutorials)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Input autofill properties
;
; @title autofill-name property
;
; @--- Accepted types
; {:autofill-name (keyword)}
;
; @--- Examples
; {:autofill-name :password}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Input field properties
;
; @title date-from property
;
; @--- Accepted types
; {:date-from (string)}
;
; @--- Examples
; {:date-from "2020-04-20"}
;
;
;
; @title date-to property
;
; @--- Accepted types
; {:date-to (string)}
;
; @--- Examples
; {:date-to "2020-05-01"}
;
;
;
; @title field-from property
;
; @--- Accepted types
; {:field-from (number)}
;
; @--- Examples
; {:field-from 16}
;
;
;
; @title field-to property
;
; @--- Accepted types
; {:field-to (number)}
;
; @--- Examples
; {:field-to 32}
;
;
;
; @title field-type property
;
; @--- Accepted types
; {:field-type (keyword)}
;
; @--- Examples
; {:field-type :password}
;
;
;
; @title max-length property
;
; @--- Accepted types
; {:max-length (integer)}
;
; @--- Examples
; {:max-length 69}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Input guide properties
;
; @links
; Check out the [cljc-metamorphic-content](https://mt-app-kit.github.io/cljc-metamorphic-content) library.
;
; @title error-text property
;
; @--- Accepted types
; {:error-text (metamorphic-content)}
;
; @--- Examples
; {:error-text "My error text"}
; {:error-text :my-dictionary-term}
; {:error-text [:div "My error text"]}
; {:error-text [my-error-text-component]}
; {:error-text 123456}
;
;
;
; @title helper-text property
;
; @--- Accepted types
; {:helper-text (metamorphic-content)}
;
; @--- Examples
; {:helper-text "My helper text"}
; {:helper-text :my-dictionary-term}
; {:helper-text [:div "My helper text"]}
; {:helper-text [my-helper-text-component]}
; {:helper-text 123456}
;
;
;
; @title info-text property
;
; @--- Accepted types
; {:info-text (metamorphic-content)}
;
; @--- Examples
; {:info-text "My info text"}
; {:info-text :my-dictionary-term}
; {:info-text [:div "My info text"]}
; {:info-text [my-info-text-component]}
; {:info-text 123456}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Input option properties
;
; @title get-options-f property
;
; @--- Accepted types
; {:get-options-f (function)}
;
; @--- Examples
; {:get-options-f (fn [] ...)}
;
;
;
; @title option-color-f property
;
; @--- Accepted types
; {:option-color-f (function)}
;
; @--- Examples
; {:option-color-f (fn [option] ...)}
; {:option-color-f :color}
;
;
;
; @title option-helper-f property
;
; @--- Accepted types
; {:option-helper-f (function)}
;
; @--- Examples
; {:option-helper-f (fn [option] ...)}
; {:option-helper-f :helper}
;
;
;
; @title option-label-f property
;
; @--- Accepted types
; {:option-label-f (function)}
;
; @--- Examples
; {:option-label-f (fn [option] ...)}
; {:option-label-f :label}
;
;
;
; @title option-value-f property
;
; @--- Accepted types
; {:option-value-f (function)}
;
; @--- Examples
; {:option-value-f (fn [option] ...)}
; {:option-value-f :value}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Input state properties
;
; @title disabled? property
;
; @--- Accepted types
; {:disabled? (boolean)}
;
; @--- Examples
; {:disabled? true}
