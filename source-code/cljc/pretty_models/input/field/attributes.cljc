
(ns pretty-models.input.field.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn field-input-content-attributes
  [attributes props]
  (-> attributes (pretty-attributes/focus-event-attributes props)
                 (pretty-attributes/input-field-attributes props)
                 (pretty-attributes/react-attributes       props)))

(defn field-input-inner-attributes
  [attributes _]
  (-> attributes))

(defn field-input-outer-attributes
  [attributes _]
  (-> attributes))
