
(ns pretty-themes.api
    (:require [pretty-themes.views :as views]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Pretty Themes
;
; ...

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Sample themes
;
; [soft-dark.css](https://github.com/pretty-project/pretty-core/tree/release/resources/public/pretty-themes/soft-dark.css)
; [soft-light.css](https://github.com/pretty-project/pretty-core/tree/release/resources/public/pretty-themes/soft-light.css)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Using themes
;
; @usage
; ;; Setting a theme via data attribute:
; [:div {:data-theme :my-theme}
;       "My content"]
;
; ;; Setting a theme via component property:
; [my-button {:content "My content"
;             :theme   :my-theme}]

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial CSS dependencies
;
; [pretty-themes.min.css](https://github.com/pretty-project/pretty-core/tree/release/resources/public/pretty-themes.min.css)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (pretty-themes.views/*)
(def text-color  views/text-color)
(def text-colors views/text-colors)
(def color-box   views/color-box)
(def color-boxes views/color-boxes)
