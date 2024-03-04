
(ns pretty-properties.input.tutorials)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Input event properties
;
; @title on-changed-f property
;
; @--- Accepted types
; {:on-changed-f (function)}
;
; @--- Examples
; {:on-changed-f (fn [value] ...)}
;
;
;
; @title on-empty-f property
;
; @--- Accepted types
; {:on-empty-f (function)}
;
; @--- Examples
; {:on-empty-f (fn [value] ...)}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Input field properties
;
; @links
; Check out the [cljc-multitype-content](https://mt-app-kit.github.io/cljc-multitype-content) library.
;
; @title autofill-name property
;
; @--- Accepted types
; {:autofill-name (keyword)}
;
; @--- Examples
; {:autofill-name :password}
;
;
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
; @title field-placeholder property
;
; @--- Accepted types
; {:field-placeholder (multitype-content)}
;
; @--- Examples
; {:field-placeholder "My field placeholder"}
; {:field-placeholder :my-dictionary-term}
; {:field-placeholder [:div "My field placeholder"]}
; {:field-placeholder [my-field-placeholder-component]}
; {:field-placeholder 123456}
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

; @tutorial Input option properties
;
; @title max-selection property
;
; @--- Accepted types
; {:max-selection (integer)}
;
; @--- Examples
; {:max-selection 1}
;
;
;
; @title on-selected-f property
;
; @--- Accepted types
; {:on-selected-f (function)}
;
; @--- Examples
; {:on-selected-f (fn [selected-options] ...)}
;
;
;
; @title on-unselected-f property
;
; @--- Accepted types
; {:on-unselected-f (function)}
;
; @--- Examples
; {:on-unselected-f (fn [selected-options] ...)}
;
;
;
; @title option-highlighted property
;
; @--- Accepted types
; {:option-highlighted (map)}
;
; @--- Examples
; {:option-highlighted {:fill-color :highlight}}
;
;
;
; @title option-selected property
;
; @--- Accepted types
; {:option-selected (map)}
;
; @--- Examples
; {:option-selected {:fill-color :highlight}}
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

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Input validation properties
;
; @links
; Check out the [cljc-multitype-content](https://mt-app-kit.github.io/cljc-multitype-content) library.
;
; @title on-invalid-f property
;
; @--- Accepted types
; {:on-invalid-f (function)}
;
; @--- Examples
; {:on-invalid-f (fn [value error-text])}
;
;
;
; @title on-valid-f property
;
; @--- Accepted types
; {:on-valid-f (function)}
;
; @--- Examples
; {:on-valid-f (fn [value])}
;
;
;
; @title validate-when-change? property
;
; @--- Accepted types
; {:validate-when-change? (boolean)}
;
; @--- Examples
; {:validate-when-change? true}
;
;
;
; @title validate-when-leave? property
;
; @--- Accepted types
; {:validate-when-leave? (boolean)}
;
; @--- Examples
; {:validate-when-leave? true}
;
;
;
; @title validators property
;
; @--- Accepted types
; {:validators (maps in vector)
;   [(map) validator
;     {:error-text (multitype-content)
;      :test-f (function)}]}
;
; @--- Examples
; {:validators [{:error-text "Please fill out this field!" :test-f #(-> % empty? not)}]}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Input value properties
;
; @title get-value-f property
;
; @--- Accepted types
; {:get-value-f (function)}
;
; @--- Examples
; {:get-value-f (fn [] ...)}
;
;
;
; @title initial-value property
;
; @--- Accepted types
; {:initial-value (*)}
;
; @--- Examples
; {:initial-value "My initial value"}
;
;
;
; @title modify-value-f property
;
; @--- Accepted types
; {:modify-value-f (function)}
;
; @--- Examples
; {:modify-value-f (fn [value] ...)}
;
;
;
; @title projected-value property
;
; @--- Accepted types
; {:projected-value (*)}
;
; @--- Examples
; {:projected-value "My projected value"}
;
;
;
; @title set-value-f property
;
; @--- Accepted types
; {:set-value-f (function)}
;
; @--- Examples
; {:set-value-f (fn [value] ...)}
