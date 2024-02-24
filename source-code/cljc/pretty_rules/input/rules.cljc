
(ns pretty-rules.input.rules
    (:require [metamorphic-content.api :as metamorphic-content]
              [fruits.map.api :as map]
              [fruits.random.api :as random]))

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
  ; Provides a randomly generated value as default ':autofill-name' value in the given property map;
  ; only in case the element is not disabled.
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

(defn compose-input-guides
  ; @description
  ; Composes the ':error-text', the ':helper-text' and the ':info-text' metamorphic content values (if any) in the given property map.
  ;
  ; @param (map) props
  ; {:error-text (metamorphic-content)(opt)
  ;  :helper-text (metamorphic-content)(opt)
  ;  :info-text (metamorphic-content)(opt)
  ;  ...}
  ;
  ; @usage
  ; (compose-input-guides {:error-text "My error text" ...})
  ; =>
  ; {:error-text "My error text"
  ;  ...}
  ;
  ; @return (map)
  ; {:error-text (metamorphic-content)
  ;  :helper-text (metamorphic-content)
  ;  :info-text (metamorphic-content)
  ;  ...}
  [props]
  (-> props (map/update-some :error-text  metamorphic-content/compose)
            (map/update-some :helper-text metamorphic-content/compose)
            (map/update-some :info-text   metamorphic-content/compose)))