
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

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (pretty-attributes.basic.attributes/*)
(def class-attributes attributes/class-attributes)
(def state-attributes attributes/state-attributes)
(def style-attributes attributes/style-attributes)
