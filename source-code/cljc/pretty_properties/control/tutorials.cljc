
(ns pretty-properties.control.tutorials)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Anchor properties
;
; @title href-target property
;
; @--- Accepted types
; {:href-target (keyword)}
;
; @--- Examples
; {:href-target :blank}
;
; @--- Predefined values
; :blank, :self
;
;
;
; @title href-uri property
;
; @--- Accepted types
; {:href-uri (string)}
;
; @--- Examples
; {:href-uri "/my-uri"}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Clickable state properties
;
; @title disabled? property
;
; @--- Accepted types
; {:disabled? (boolean)}
;
; @--- Examples
; {:disabled? true}
;
;
;
; @title highlighted? property
;
; @--- Accepted types
; {:highlighted? (boolean)}
;
; @--- Examples
; {:highlighted? true}
;
;
;
; @title tab-disabled? property
;
; @--- Accepted types
; {:tab-disabled? (boolean)}
;
; @--- Examples
; {:tab-disabled? true}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Keypress properties
;
; @links
; Check out the [cljs-keypress-handler](https://mt-app-kit.github.io/cljs-keypress-handler) library.
;
; @title keypress property
;
; @--- Accepted types
; {:keypress (map)}
;
; @--- Examples
; {:keypress {:key-code 27}}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Mouse event properties
;
; @title on-click-f property
;
; @--- Accepted types
; {...} {:on-click-f (function)}
;
; @--- Examples
; {...} {:on-click-f (fn [_] ...)}
;
;
;
; @title on-click-timeout property
;
; @--- Accepted types
; {...} {:on-click-timeout (ms)}
;
; @--- Examples
; {...} {:on-click-timeout 5000}
;
;
;
; @title on-mouse-down-f property
;
; @--- Accepted types
; {...} {:on-mouse-down-f (function)}
;
; @--- Examples
; {...} {:on-mouse-down-f (fn [_] ...)}
;
;
;
; @title on-mouse-over-f property
;
; @--- Accepted types
; {...} {:on-mouse-over-f (function)}
;
; @--- Examples
; {...} {:on-mouse-over-f (fn [_] ...)}
;
;
;
; @title on-mouse-up-f property
;
; @--- Accepted types
; {...} {:on-mouse-up-f (function)}
;
; @--- Examples
; {...} {:on-mouse-up-f (fn [_] ...)}
;
;
;
; @title on-right-click-f property
;
; @--- Accepted types
; {...} {:on-right-click-f (function)}
;
; @--- Examples
; {...} {:on-right-click-f (fn [_] ...)}
