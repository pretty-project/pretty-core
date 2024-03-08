
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
; @title tab-disabled? property
;
; @--- Accepted types
; {:tab-disabled? (boolean)}
;
; @--- Examples
; {:tab-disabled? true}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Focus event properties
;
; @title autofocus? property
;
; @note
; The ':autofocus?' property is not necessarily supported by elements that implement the focus event properties!
;
; @--- Accepted types
; {:autofocus? (boolean)}
;
; @--- Examples
; {:autofocus? true}
;
;
;
; @title on-blur-f property
;
; @--- Accepted types
; {:on-blur-f (function)}
;
; @--- Examples
; {:on-blur-f (fn [_] ...)}
;
;
;
; @title on-focus-f property
;
; @--- Accepted types
; {:on-focus-f (function)}
;
; @--- Examples
; {:on-focus-f (fn [_] ...)}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Keypress control properties
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

; @tutorial Keypress event properties
;
; @title on-arrow-down-f property
;
; @--- Accepted types
; {:on-arrow-down-f (function)}
;
; @--- Examples
; {:on-arrow-down-f (fn [_] ...)}
;
;
;
; @title on-arrow-left-f property
;
; @--- Accepted types
; {:on-arrow-left-f (function)}
;
; @--- Examples
; {:on-arrow-left-f (fn [_] ...)}
;
;
;
; @title on-arrow-right-f property
;
; @--- Accepted types
; {:on-arrow-right-f (function)}
;
; @--- Examples
; {:on-arrow-right-f (fn [_] ...)}
;
;
;
; @title on-arrow-up-f property
;
; @--- Accepted types
; {:on-arrow-up-f (function)}
;
; @--- Examples
; {:on-arrow-up-f (fn [_] ...)}
;
;
;
; @title on-enter-f property
;
; @--- Accepted types
; {:on-enter-f (function)}
;
; @--- Examples
; {:on-enter-f (fn [_] ...)}
;
;
;
; @title on-escape-f property
;
; @--- Accepted types
; {:on-escape-f (function)}
;
; @--- Examples
; {:on-escape-f (fn [_] ...)}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Mouse event properties
;
; @title on-click-f property
;
; @--- Accepted types
; {:on-click-f (function)}
;
; @--- Examples
; {:on-click-f (fn [_] ...)}
;
;
;
; @title on-click-timeout property
;
; @note
; The ':on-click-timeout' property is not necessarily supported by elements that implement the mouse event properties!
;
; @--- Accepted types
; {:on-click-timeout (ms)}
;
; @--- Examples
; {:on-click-timeout 5000}
;
;
;
; @title on-mouse-down-f property
;
; @--- Accepted types
; {:on-mouse-down-f (function)}
;
; @--- Examples
; {:on-mouse-down-f (fn [_] ...)}
;
;
;
; @title on-mouse-over-f property
;
; @--- Accepted types
; {:on-mouse-over-f (function)}
;
; @--- Examples
; {:on-mouse-over-f (fn [_] ...)}
;
;
;
; @title on-mouse-up-f property
;
; @--- Accepted types
; {:on-mouse-up-f (function)}
;
; @--- Examples
; {:on-mouse-up-f (fn [_] ...)}
;
;
;
; @title on-right-click-f property
;
; @--- Accepted types
; {:on-right-click-f (function)}
;
; @--- Examples
; {:on-right-click-f (fn [_] ...)}
