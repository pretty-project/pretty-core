
(ns pretty-icons.api
    (:require [pretty-icons.views :as views]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Pretty Icons
;
; A simple data attribute based implementation of Material Icons and Material Symbols.

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial CSS dependencies
;
; [pretty-icons.min.css](https://github.com/pretty-project/pretty-core/tree/release/resources/public/pretty-icons.min.css)
;
; [fonts.googleapis.com/icon?family=Material+Icons](https://fonts.googleapis.com/icon?family=Material+Icons)
; [fonts.googleapis.com/icon?family=Material+Icons+Outlined](https://fonts.googleapis.com/icon?family=Material+Icons+Outlined)
; [fonts.googleapis.com/css2?family=Material+Symbols+Outlined...](https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (pretty-icons.views/*)
(def icon views/icon)
