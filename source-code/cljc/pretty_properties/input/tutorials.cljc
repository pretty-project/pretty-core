
(ns pretty-properties.input.tutorials)


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
; @title field-modifier-f property
;
; @--- Accepted types
; {:field-modifier-f (function)}
;
; @--- Examples
; {:field-modifier-f clojure.string/upper-case}
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
; @--- Predefined values
; :color, :date, :datetime-local, :email, :file, :hidden, :month,
; :number, :password, :range, :reset, :search, :tel, :text, :time, :url, :week
;
;
;
; @title field-value property
;
; @--- Accepted types
; {:field-value (*)}
;
; @--- Examples
; {:field-value "My field value"}
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
;
;
;
; @title multiline? property
;
; @--- Accepted types
; {:multiline? (boolean)}
;
; @--- Examples
; {:multiline? true}
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
;
;
;
; @title on-input-f property
;
; @--- Accepted types
; {:on-input-f (function)}
;
; @--- Examples
; {:on-input-f (fn [value] ...)}
;
;
;
; @title on-type-ended-f property
;
; @--- Accepted types
; {:on-type-ended-f (function)}
;
; @--- Examples
; {:on-type-ended-f (fn [value] ...)}

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
; @title option-filter-f property
;
; @--- Accepted types
; {:option-filter-f (function)}
;
; @--- Examples
; {:option-filter-f (fn [option] ...)}
; {:option-filter-f :value}
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
;
;
; @title form-id property
;
; @--- Accepted types
; {:form-id (keyword)}
;
; @--- Examples
; {:form-id :my-form}
;
;
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
