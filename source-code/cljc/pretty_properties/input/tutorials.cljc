
(ns pretty-properties.input.tutorials)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Input autofill properties
;
; @title autofill-name property
;
; - Guides the browser on suggested values.
; - Leave empty to disable autosuggestions.
;
; @--- Accepted types
; {:autofill-name (keyword)}
;
; @--- Examples
; {:autofill-name :password}
;
;
;
; @title autofill-style property
;
; @--- Accepted types
; {:autofill-style (keyword)}
;
; @--- Examples
; {:autofill-style :none}
;
; @--- Predefined values
; :none, :normalized

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Input field properties
;
; @links
; [cljc-multitype-content](https://mt-app-kit.github.io/cljc-multitype-content)
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
; @title on-change-f property
;
; @--- Accepted types
; {:on-change-f (function)}
;
; @--- Examples
; {:on-change-f (fn [value] ...)}
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
;
;
;
; @title type-ended-after property
;
; How much time has to elapse after the last key is pressed to consider the typing as ended.
;
; @--- Accepted types
; {:type-ended-after (ms)}
;
; @--- Examples
; {:type-ended-after 450}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Input numeric properties
;
; @title max-value property
;
; @--- Accepted types
; {:max-value (integer)}
;
; @--- Examples
; {:max-value 1}
;
;
;
; @title min-value property
;
; @--- Accepted types
; {:min-value (integer)}
;
; @--- Examples
; {:min-value 1}
;
;
;
; @title on-decreased-f property
;
; @--- Accepted types
; {:on-decreased-f (function)}
;
; @--- Examples
; {:on-decreased-f (fn [value] ...)}
;
;
;
; @title on-increased-f property
;
; @--- Accepted types
; {:on-decreased-f (function)}
;
; @--- Examples
; {:on-decreased-f (fn [value] ...)}

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

; @tutorial Input validation properties
;
; @links
; [cljc-form-validator](https://mt-app-kit.github.io/cljc-form-validator)
; [cljc-multitype-content](https://mt-app-kit.github.io/cljc-multitype-content)
;
; @title form-id property
;
; Allows inputs to be validated in groups based on their form ID.
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
; {:on-invalid-f (fn [value error])}
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
;     {:error (multitype-content)
;      :test-f (function)}]}
;
; @--- Examples
; {:validators [{:error "Please fill out this field!" :test-f (fn [value] (-> value empty? not))}]}

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
