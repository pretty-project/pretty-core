
(ns pretty-rules.input.rules
    (:require [fruits.map.api    :as map]
              [fruits.random.api :as random]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn auto-hide-input-caret
  ; @description
  ; Hides the text caret of disabled input fields.
  ;
  ; @param (map) props
  ; {:disabled? (boolean)(opt)
  ;  ...}
  ;
  ; @usage
  ; (auto-hide-input-caret {:disabled? true ...})
  ; =>
  ; {:disabled?  true
  ;  :text-caret :hidden
  ;  ...}
  ;
  ; @return (map)
  ; {:text-caret (keyword)
  ;  ...}
  [{:keys [disabled?] :as props}]
  (if disabled? (-> props (map/use-default-values {:text-caret :hidden}))
                (-> props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn auto-disable-input-autofill
  ; @description
  ; Dissociates the ':autofill-name' property of disabled elements.
  ;
  ; @param (map) props
  ; {:disabled? (boolean)(opt)
  ;  ...}
  ;
  ; @usage
  ; (auto-disable-input-autofill {:autofill-name :phone-number :disabled? true ...})
  ; =>
  ; {:disabled? true
  ;  ...}
  ;
  ; @return (map)
  [{:keys [disabled?] :as props}]
  (if disabled? (-> props (dissoc :autofill-name))
                (-> props)))

(defn generate-input-autofill
  ; @description
  ; Provides a randomly generated value as default value of the ':autofill-name' property for non-disabled elements.
  ;
  ; @param (map) props
  ; {:disabled? (boolean)(opt)
  ;  ...}
  ;
  ; @usage
  ; (generate-input-autofill {...})
  ; =>
  ; {:autofill-name :xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx
  ;  ...}
  ;
  ; @usage
  ; (generate-input-autofill {:disabled? true ...})
  ; =>
  ; {:disabled? true
  ;  ...}
  ;
  ; @return (map)
  [{:keys [disabled?] :as props}]
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
  (if-not disabled? (-> props (map/use-default-values {:autofill-name (random/generate-keyword)}))
                    (-> props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn assoc-blank-input-change-event
  ; @description
  ; Associates a blank ':on-change-f' event to the given property map to prevent React warning about uncontrolled input state.
  ;
  ; @param (map) props
  ;
  ; @usage
  ; (assoc-blank-input-change-event {...})
  ; =>
  ; {:on-change-f (fn [_])
  ;  ...}
  ;
  ; @return (map)
  ; {:on-change-f (function)}
  [props]
  (-> props (assoc :on-change-f (fn [_]))))

(defn auto-disable-input-events
  ; @description
  ; Dissociates the input event properties of disabled elements.
  ;
  ; @param (map) props
  ; {:disabled? (boolean)(opt)
  ;  ...}
  ;
  ; @usage
  ; (auto-disable-input-events {:disabled? true :on-input-f (fn [_] ...) ...})
  ; =>
  ; {:disabled? true
  ;  ...}
  ;
  ; @return (map)
  [{:keys [disabled?] :as props}]
  (if disabled? (-> props (dissoc :on-empty-f :on-input-f))
                (-> props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn assoc-field-value-as-content
  ; @description
  ; Duplicates the 'field-value' property as 'content' property to make it available for content related rule functions.
  ;
  ; @param (map) props
  ; {:field-value (*)(opt)
  ;  ...}
  ;
  ; @usage
  ; (assoc-field-value-as-content {:field-value "..." ...})
  ; =>
  ; {:content     "..."
  ;  :field-value "..."
  ;  ...}
  ;
  ; @return (map)
  ; {:content (*)
  ;  :field-value (*)
  ;  ...}
  [{:keys [field-value] :as props}]
  (-> props (assoc :content field-value)))
