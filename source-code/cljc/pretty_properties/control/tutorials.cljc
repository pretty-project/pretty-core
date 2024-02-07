
(ns pretty-properties.control.tutorials)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Anchor properties
;
; @title :href-target property
;
; @code Usage
; {:href-target (keyword)}
; {:href-target :blank}
;
; @code Predefined values
; :blank, :self
;
;
;
; @title :href-uri property
;
; @code Usage
; {:href-uri (string)}
; {:href-uri "/my-uri"}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Clickable state properties
;
; @title :disabled? property
;
; @code Usage
; {:disabled? (boolean)}
; {:disabled? true}
;
;
;
; @title :tab-disabled? property
;
; @code Usage
; {:tab-disabled? (boolean)}
; {:tab-disabled? true}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Focus properties
;
; @title :focus-id property
;
; @note
; Associating focus ID to elements or subitems make them focusable by side effect functions.
;
; @code Usage
; {:focus-id (keyword)}
; {:focus-id :my-target-element}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Mouse event properties
;
; @title :on-click-f property
;
; @code Usage
; {...} {:on-click-f (function)}
; {...} {:on-click-f (fn [_] ...)}
;
;
;
; @title :on-mouse-down-f property
;
; @code Usage
; {...} {:on-mouse-down-f (function)}
; {...} {:on-mouse-down-f (fn [_] ...)}
;
;
;
; @title :on-mouse-over-f property
;
; @code Usage
; {...} {:on-mouse-over-f (function)}
; {...} {:on-mouse-over-f (fn [_] ...)}
;
;
;
; @title :on-mouse-up-f property
;
; @code Usage
; {...} {:on-mouse-up-f (function)}
; {...} {:on-mouse-up-f (fn [_] ...)}
;
;
;
; @title :on-right-click-f property
;
; @code Usage
; {...} {:on-right-click-f (function)}
; {...} {:on-right-click-f (fn [_] ...)}
