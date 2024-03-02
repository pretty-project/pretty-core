
(ns pretty-properties.input.props
    (:require [fruits.map.api :as map]
              [fruits.random.api :as random]))

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
  ; {:autofill-name (keyword)(opt)
  ;  :date-from (string)(opt)
  ;  :date-to (string)(opt)
  ;  :field-from (number)(opt)
  ;  :field-placeholder (multitype-content)(opt)
  ;  :field-to (number)(opt)
  ;  :field-type (keyword)(opt)
  ;  :max-length (integer)(opt)
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
  ;  :field-placeholder (multitype-content)
  ;  :field-to (number)
  ;  :field-type (keyword)
  ;  :max-length (integer)
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
  ; {:on-invalid-f (function)
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
  ;  :modify-value-f (function)(opt)
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
  ;  :modify-value-f (function)
  ;  :projected-value (*)
  ;  :set-value-f (function)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))
