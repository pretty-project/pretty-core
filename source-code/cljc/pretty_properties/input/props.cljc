
(ns pretty-properties.input.props
    (:require [fruits.map.api          :as map]
              [fruits.random.api       :as random]
              [metamorphic-content.api :as metamorphic-content]
              [pretty-properties.input.config :as input.config]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-input-autofill-props
  ; @description
  ; - Applies the given default input autofill properties on the given property map.
  ; - Uses a generated random value as autofill name (if not provided).
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:autofill-name (keyword)(opt)
  ;  ...}
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
  ; @bug (#6782)
  ; - https://stackoverflow.com/questions/12374442/chrome-ignores-autocomplete-off
  ; - The "ignore autocomplete='off' (Autofill)" flag is set to enabled by default in chrome.
  ;   chrome://flags/#ignore-autocomplete-off-autofill
  ; - The Chrome browser ...
  ;   ... ignores the {:autocomplete "off"} setting,
  ;   ... ignores the {:autocomplete "new-*"} setting,
  ;   ... acknowledges the {:name ...} value.
  ; - By using randomly generated ':auto-complete' and ':name' values, the browser cannot suggest values to the field.
  ; - If you want the browser to suggest values for a field, pass an understandable value for the ':autofill-name' property!
  ;   E.g., {:autofill-name :phone-number}
  (-> props (map/use-default-values {:autofill-name (random/generate-keyword)}
                                    (-> default-props))))

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

(defn default-input-guide-props
  ; @description
  ; - Applies the given default input guide properties on the given property map.
  ; - Composes the ':error-text', the ':helper-text' and the ':info-text' metamorphic
  ;   content values (if any) in the given property map.
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
  ; @note (pretty-properties.content.props#4445)
  (if (-> default-props (map?))
      (-> props (map/use-default-values default-props) default-input-guide-props)
      (-> props (map/update-some :error-text  metamorphic-content/compose)
                (map/update-some :helper-text metamorphic-content/compose)
                (map/update-some :info-text   metamorphic-content/compose))))

(defn default-input-option-props
  ; @description
  ; - Applies the given default input option properties on the given property map.
  ; - Applies the standard input option properties on the given property map;
  ;   in case of any input option related value is provided.
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
  ; {:get-options-f    (fn [_] ...)
  ;  :option-color-f fruits.noop.api/none
  ;  :option-helper-f fruits.noop.api/none
  ;  :option-label-f fruits.noop.api/none
  ;  :option-value-f fruits.noop.api/return
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
  (-> props (map/use-default-values default-props)
            (map/use-default-value-group input.config/STANDARD-INPUT-OPTION-PROPERTIES)))

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
