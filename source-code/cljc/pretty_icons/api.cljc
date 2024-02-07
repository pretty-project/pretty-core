
(ns pretty-icons.api
    (:require [pretty-icons.views :as views]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial How to use Material Icons and Material Symbols?
;
; You can display Material icons and symbols ...
;
; ... by applying the ':data-icon-family' attribute on the element and using the icon name as its content.
; ... by using the ['material-icon'](#material-icon) and ['material-symbol'](#material-symbol) functions.
;
; @usage
; [:i {:data-icon-family :material-icons-filled}     :nature_people]
; [:i {:data-icon-family :material-icons-outlined}   :nature_people]
; [:i {:data-icon-family :material-symbols-filled}   :nature_people]
; [:i {:data-icon-family :material-symbols-outlined} :nature_people]
;
; @usage
; (ns my-namespace
;   (:require [pretty-icons.api :refer [material-icon material-symbol]]))
;
; (material-icon   :nature_people :filled)
; (material-icon   :nature_people :outlined)
; (material-symbol :nature_people :filled)
; (material-symbol :nature_people :outlined)
; @---

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (pretty-icons.views/*)
(def material-icon   views/material-icon)
(def material-symbol views/material-symbol)
