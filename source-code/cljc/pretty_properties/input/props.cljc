
(ns pretty-properties.input.props
    (:require [fruits.map.api    :as map]
              [fruits.random.api :as random]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-input-field-props
  ; @description
  ; Applies the given default input field properties on the given property map.
  ;
  ; @param (map) props
  ; {:autofill-name (keyword)(opt)
  ;  :date-from (string)(opt)
  ;  :date-to (string)(opt)
  ;  :field-from (number)(opt)
  ;  :field-to (number)(opt)
  ;  :field-value-f (function)(opt)
  ;  :field-type (keyword)(opt)
  ;  :max-length (integer)(opt)
  ;  :multiline? (boolean)(opt)
  ;  :on-empty-f (function)(opt)
  ;  :on-input-f (function)(opt)
  ;  :on-type-ended-f (function)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-input-field-props {...} {:autofill-name :password :field-type :password :max-length 8})
  ; =>
  ; {:autofill-name :password
  ;  :field-type    :password
  ;  :max-length    8
  ;  ...}
  ;
  ; @usage
  ; (default-input-field-props {...} {:date-from "2020-04-20" :date-to "2020-04-20" :field-type :date})
  ; =>
  ; {:date-from  "2020-04-20"
  ;  :date-to    "2020-04-20"
  ;  :field-type :date
  ;  ...}
  ;
  ; @return (map)
  ; {:autofill-name (keyword)
  ;  :date-from (string)
  ;  :date-to (string)
  ;  :field-from (number)
  ;  :field-to (number)
  ;  :field-value-f (function)
  ;  :field-type (keyword)
  ;  :max-length (integer)
  ;  :multiline? (boolean)
  ;  :on-empty-f (function)
  ;  :on-input-f (function)
  ;  :on-type-ended-f (function)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-input-option-props
  ; @description
  ; Applies the given default input option properties on the given property map.
  ;
  ; @param (map) props
  ; {:max-selection (integer)(opt)
  ;  :on-selected-f (function)(opt)
  ;  :on-unselected-f (function)(opt)
  ;  :option-highlighted (map)(opt)
  ;  :option-selected (map)(opt)
  ;  :option-value-f (function)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-input-option-props {...} {:option-value-f :value})
  ; =>
  ; {:option-value-f :value
  ;  ...}
  ;
  ; @return (map)
  ; {:max-selection (integer)
  ;  :on-selected-f (function)
  ;  :on-unselected-f (function)
  ;  :option-highlighted (map)
  ;  :option-selected (map)
  ;  :option-value-f (function)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-input-state-props
  ; @description
  ; Applies the given default input state properties on the given property map.
  ;
  ; @param (map) props
  ; {:disabled? (keyword)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-input-state-props {...} {:disabled? true})
  ; =>
  ; {:disabled? true
  ;  ...}
  ;
  ; @return (map)
  ; {:disabled? (keyword)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-input-validation-props
  ; @description
  ; Applies the given default input validation properties on the given property map.
  ;
  ; @param (map) props
  ; {:form-id (keyword)(opt)
  ;  :on-invalid-f (function)(opt)
  ;  :on-valid-f (function)(opt)
  ;  :validate-when-change? (boolean)(opt)
  ;  :validate-when-leave? (boolean)(opt)
  ;  :validators (maps in vector)(opt)
  ;   [(map) validator
  ;     {:error-text (multitype-content)(opt)
  ;      :f (function)}]
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-input-validation-props {...} {:on-valid-f (fn [_] ...) :validators [{:f some? :error-text "Please fill out this field!"}]})
  ; =>
  ; {:on-valid-f (fn [_] ...)
  ;  :validators [{:f some? :error-text "Please fill out this field!"}]
  ;  ...}
  ;
  ; @return (map)
  ; {:form-id (keyword)
  ;  :on-invalid-f (function)
  ;  :on-valid-f (function)
  ;  :validate-when-change? (boolean)
  ;  :validate-when-leave? (boolean)
  ;  :validators (maps in vector)
  ;   [(map) validator
  ;     {:error-text (multitype-content)
  ;      :f (function)}]
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-input-value-props
  ; @description
  ; Applies the given default input value properties on the given property map.
  ;
  ; @param (map) props
  ; {:get-value-f (function)(opt)
  ;  :initial-value (*)(opt)
  ;  :projected-value (*)(opt)
  ;  :set-value-f (function)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-input-value-props {...} {:get-value-f (fn [_] ...)})
  ; =>
  ; {:get-value-f (fn [_] ...)
  ;  ...}
  ;
  ; @return (map)
  ; {:get-value-f (function)
  ;  :initial-value (*)
  ;  :projected-value (*)
  ;  :set-value-f (function)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))
