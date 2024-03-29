
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
  ; @description
  ; Applies the input autofill related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:autofill-name (keyword)(opt)
  ;  :autofill-style (keyword)(opt)
  ;  ...}
  ;
  ; @usage
  ; (input-autofill-attributes {...} {:autofill-style :none :autofill-name :password})
  ; =>
  ; {:auto-complete       :password
  ;  :data-autofill-style :normalized
  ;  :name                :password
  ;  ...}
  ;
  ; @return (map)
  ; {:auto-complete (keyword)
  ;  :data-autofill-style (keyword)
  ;  :name (keyword)
  ;  ...}
  [attributes {:keys [autofill-name autofill-style]}]
  (-> attributes (map/merge-some {:auto-complete       autofill-name
                                  :name                autofill-name
                                  :data-autofill-style autofill-style})))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

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
  ;  :field-value (*)(opt)
  ;  :max-length (integer)(opt)
  ;  :on-change-f (function)(opt)
  ;  :on-input-f (string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (input-field-attributes {...} {:field-type :password :field-value "..." :max-length 8})
  ; =>
  ; {:max-length 8
  ;  :type       :password
  ;  :value      "..."
  ;  ...}
  ;
  ; @usage
  ; (input-field-attributes {...} {:field-from 16 :field-to 32 :field-type :number :field-value "..."})
  ; =>
  ; {:max   32
  ;  :min   16
  ;  :type  :number
  ;  :value "..."
  ;  ...}
  ;
  ; @usage
  ; (input-field-attributes {...} {:date-from "2020-04-20" :date-to "2020-04-20" :field-type :date :field-value "..."})
  ; =>
  ; {:max   "2020-04-20"
  ;  :min   "2020-04-20"
  ;  :type  :date
  ;  :value "..."
  ;  ...}
  ;
  ; @return (map)
  ; {:max (number or string)
  ;  :max-length (integer)
  ;  :min (number or string)
  ;  :on-change (function)
  ;  :on-input (string)
  ;  :type (keyword)
  ;  :value (*)
  ;  ...}
  [attributes {:keys [date-from date-to field-from field-to field-type field-value max-length on-change-f on-input-f]}]
  ; The range of '{:type :date}' fields is controlled by the ':min' and ':max' properties.
  (-> attributes (map/merge-some {:max-length    (-> max-length)
                                  :min           (or date-from field-from)
                                  :max           (or date-to   field-to)
                                  :type          (-> field-type)
                                  :value         (-> field-value)
                                  :on-change     (-> on-change-f)
                                  :on-input      (-> on-input-f)})))
