
(ns pretty-attributes.input.attributes
    (:require [fruits.hiccup.api       :as hiccup]
              [fruits.map.api          :as map]
              [pretty-attributes.utils :as utils]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn input-autofill-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @note
  ; Automatically ignores the autofill attributes of disabled elements.
  ;
  ; @description
  ; Applies the input autofill related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:autofill-name (keyword)(opt)
  ;  :disabled? (boolean)(opt)
  ;  ...}
  ;
  ; @usage
  ; (input-autofill-attributes {...} {:autofill-name :phone-number})
  ; =>
  ; {:auto-complete :phone-number
  ;  :name          :phone-number
  ;  ...}
  ;
  ; @return (map)
  ; {:auto-complete (keyword)
  ;  :name (keyword)
  ;  ...}
  [attributes {:keys [autofill-name disabled?]}]
  (if disabled? (map/merge-some attributes {})
                (map/merge-some attributes {:auto-complete autofill-name
                                            :name          autofill-name})))

(defn input-field-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the input field related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:date-from (string)(opt)
  ;  :date-to (string)(opt)
  ;  :field-from (number)(opt)
  ;  :field-to (number)(opt)
  ;  :field-type (keyword)(opt)
  ;  :max-length (integer)(opt)
  ;  ...}
  ;
  ; @usage
  ; (input-field-attributes {...} {:field-type :password :max-length 8})
  ; =>
  ; {:max-length 8
  ;  :type :password
  ;  ...}
  ;
  ; @usage
  ; (input-field-attributes {...} {:field-from 16 :field-to 32 :field-type :number})
  ; =>
  ; {:max 32
  ;  :min 16
  ;  :type :number
  ;  ...}
  ;
  ; @usage
  ; (input-field-attributes {...} {:date-from "2020-04-20" :date-to "2020-04-20" :field-type :date})
  ; =>
  ; {:max  "2020-04-20"
  ;  :min  "2020-04-20"
  ;  :type :date
  ;  ...}
  ;
  ; @return (map)
  ; {:max (number or string)
  ;  :max-length (integer)
  ;  :min (number or string)
  ;  :type (keyword)
  ;  ...}
  [props {:keys [date-from date-to field-from field-to field-type max-length]}]
  ; The range of '{:type :date}' fields is controlled by the ':min' and ':max' properties.
  (map/merge-some props {:max-length (-> max-length)
                         :min        (or date-from field-from)
                         :max        (or date-to   field-to)
                         :type       (-> field-type)}))

(defn input-state-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; - Applies the input state related values on the given attribute map.
  ; - Applies the disabled state via the 'disabled' attribute (supported by form controls).
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:disabled? (boolean)(opt)
  ;  ...}
  ;
  ; @usage
  ; (input-state-attributes {...} {:disabled? true})
  ; =>
  ; {:disabled true
  ;  ...}
  ;
  ; @return (map)
  ; {:disabled (boolean)
  ;  ...}
  [attributes {:keys [disabled?]}]
  (map/merge-some attributes {:disabled disabled?}))
