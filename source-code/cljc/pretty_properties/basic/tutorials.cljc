
(ns pretty-properties.basic.tutorials)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Class properties
;
; @title :class property
;
; @code Usage
; {:class (keywords, or keywords in vector)}
; {:class :my-class}
; {:class [:another-class :my-class]}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Lifecycle properties
;
; @title :on-mount-f property
;
; @code Usage
; {:on-mount-f (function)}
; {:on-mount-f (fn [_] ...)}
;
;
;
; @title :on-unmount-f property
;
; @code Usage
; {:on-unmount-f (function)}
; {:on-unmount-f (fn [_] ...)}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Preset properties
;
; @title :preset property
;
; @note
; Check out the [pretty-presets](https://mt-app-kit.github.io/pretty-ui/cljs/pretty-presets/api.html) library.
;
; @code Usage
; {:preset (keyword)}
; {:preset :my-preset}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial React properties
;
; @title :set-reference-f property
;
; @code Usage
; {:set-reference-f (function)}
; {:set-reference-f (fn [ref] ...)}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial State properties
;
; @title :disabled? property
;
; @code Usage
; {:disabled? (boolean)}
; {:disabled? true}
;
;
;
; @title :highlighted? property
;
; @code Usage
; {:highlighted? (boolean)}
; {:highlighted? true}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Style properties
;
; @title :style property
;
; @code Usage
; {:style (map)}
; {:style {:font-size :12px}}
