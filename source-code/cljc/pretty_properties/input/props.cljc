
(ns pretty-properties.input.props
    (:require [fruits.map.api          :as map]
              [fruits.random.api       :as random]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-input-autofill-props
  ; @description
  ; Applies the given default input autofill properties on the given property map.
  ;
  ; @param (map) props
  ; {:autofill-name (keyword)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-input-autofill-props {...} {:autofill-name :phone-number})
  ; =>
  ; {:autofill-name :phone-number
  ;  ...}
  ;
  ; @return (map)
  ; {:autofill-name (keyword)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-input-event-props
  ; @description
  ; Applies the given default input event properties on the given property map.
  ;
  ; @param (map) props
  ; {:on-changed-f (function)(opt)
  ;  :on-empty-f (function)(opt)
  ;  :on-selected-f (function)(opt)
  ;  :on-unselected-f (function)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-input-event-props {...} {:on-empty-f (fn [_] ...)})
  ; =>
  ; {:on-empty-f (fn [_] ...)
  ;  ...}
  ;
  ; @return (map)
  ; {:on-changed-f (function)
  ;  :on-empty-f (function)
  ;  :on-selected-f (function)
  ;  :on-unselected-f (function)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-input-field-props
  ; @description
  ; Applies the given default input field properties on the given property map.
  ;
  ; @param (map) props
  ; {:date-from (string)(opt)
  ;  :date-to (string)(opt)
  ;  :field-from (number)(opt)
  ;  :field-to (number)(opt)
  ;  :field-type (keyword)(opt)
  ;  :max-length (integer)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-input-field-props {...} {:field-type :password :max-length 8})
  ; =>
  ; {:field-type :password
  ;  :max-length 8
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
  ; {:date-from (string)
  ;  :date-to (string)
  ;  :field-from (number)
  ;  :field-to (number)
  ;  :field-type (keyword)
  ;  :max-length (integer)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-input-guide-props
  ; @description
  ; Applies the given default input guide properties on the given property map.
  ;
  ; @param (map) props
  ; {:error-text (metamorphic-content)(opt)
  ;  :helper-text (metamorphic-content)(opt)
  ;  :info-text (metamorphic-content)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-input-guide-props {...} {:error-text "My error text"})
  ; =>
  ; {:error-text "My error text"
  ;  ...}
  ;
  ; @return (map)
  ; {:error-text (metamorphic-content)
  ;  :helper-text (metamorphic-content)
  ;  :info-text (metamorphic-content)
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
  ; {:get-options-f (function)(opt)
  ;  :option-color-f (function)(opt)
  ;  :option-helper-f (function)(opt)
  ;  :option-label-f (function)(opt)
  ;  :option-value-f (function)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-input-option-props {...} {:get-options-f (fn [_] ...)})
  ; =>
  ; {:get-options-f (fn [_] ...)
  ;  ...}
  ;
  ; @return (map)
  ; {:get-options-f (function)
  ;  :option-color-f (function)
  ;  :option-helper-f (function)
  ;  :option-label-f (function)
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
  ; {:on-invalid-f (function)(opt)
  ;  :on-valid-f (function)(opt)
  ;  :validate-when-change? (boolean)(opt)
  ;  :validate-when-leave? (boolean)(opt)
  ;  :validators (maps in vector)(opt)
  ;   [(map) validator
  ;     {:error-text (metamorphic-content)(opt)
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
  ; {:on-invalid-f (function)
  ;  :on-valid-f (function)
  ;  :validate-when-change? (boolean)
  ;  :validate-when-leave? (boolean)
  ;  :validators (maps in vector)
  ;   [(map) validator
  ;     {:error-text (metamorphic-content)
  ;      :f (function)}]
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))
