
(ns pretty-samples)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial xxx
;
; @--- xxx
; (ns my-namespace
;     (:require [pretty-properties.api :as pretty-properties]))
;
; (defn my-button-props-prototype
;   [props]
;   (-> props (pretty-properties/default-background-props props))
;
; @--- xxx
; (ns my-namespace
;     (:require [pretty-attributes.api :as pretty-attributes]))
;
; (defn my-button-attributes
;   [props]
;   (-> {:class :my-button}
;       (pretty-attributes/background-attributes props))
;
; @--- xxx
; (defn my-button
;   [props]
;   (let [props (my-button-props-prototype props)]
;        [:button (my-button-attributes props)
;                 (:label props)]))
;
; @--- xxx
; (my-button {:fill-color :highlight :label "My button"})
; =>
; [:button {:data-fill-color :highlight} "My button"]
