
(ns pretty-palettes.api
    (:require [pretty-palettes.views :as views]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Pretty Palettes
;
; CSS color palettes for composing Pretty Themes.

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial CSS dependencies
;
; [pretty-palettes.min.css](https://github.com/pretty-project/pretty-core/tree/release/resources/public/pretty-palettes.min.css)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (pretty-palettes.views/*)
(def full-palette views/full-palette)
(def palettes     views/palettes)
