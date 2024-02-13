
(ns pretty-properties.basic.tutorials)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Class properties
;
; @title class property
;
; @--- Accepted types
; {:class (keywords, or keywords in vector)}
;
; @--- Examples
; {:class :my-class}
; {:class [:another-class :my-class]}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Lifecycle properties
;
; @title on-mount-f property
;
; @--- Accepted types
; {:on-mount-f (function)}
;
; @--- Examples
; {:on-mount-f (fn [_] ...)}
;
;
;
; @title on-unmount-f property
;
; @--- Accepted types
; {:on-unmount-f (function)}
;
; @--- Examples
; {:on-unmount-f (fn [_] ...)}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Preset properties
;
; @links
; Check out the [pretty-presets](https://mt-app-kit.github.io/pretty-ui/cljs/pretty-presets/api.html) library.
;
; @title preset property
;
; @--- Accepted types
; {:preset (keyword)}
;
; @--- Examples
; {:preset :my-preset}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial React properties
;
; @title set-reference-f property
;
; @--- Accepted types
; {:set-reference-f (function)}
;
; @--- Examples
; {:set-reference-f (fn [ref] ...)}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial State properties
;
; @title disabled? property
;
; @--- Accepted types
; {:disabled? (boolean)}
;
; @--- Examples
; {:disabled? true}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Style properties
;
; @title style property
;
; @--- Accepted types
; {:style (map)}
;
; @--- Examples
; {:style {:font-size :12px}}
