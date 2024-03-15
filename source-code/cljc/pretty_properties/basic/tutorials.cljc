
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
; @title mounted? property
;
; @--- Accepted types
; {:mounted? (boolean)}
;
; @--- Examples
; {:mounted? true}
;
;
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
; [pretty-presets](https://pretty-project.github.io/pretty-ui/cljs/pretty-presets/api.html)
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
; @title active property
;
; @--- Accepted types
; {:active (map)}
;
; @--- Examples
; {:active {:opacity :medium}}
;
;
;
; @title active? property
;
; @--- Accepted types
; {:active? (boolean)}
;
; @--- Examples
; {:active? true}
;
;
;
; @title disabled property
;
; @--- Accepted types
; {:disabled (map)}
;
; @--- Examples
; {:disabled {:opacity :medium}}
;
;
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
; @title highlighted property
;
; @--- Accepted types
; {:highlighted (map)}
;
; @--- Examples
; {:highlighted {:opacity :medium}}
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
; @title hovered property
;
; @--- Accepted types
; {:hovered (map)}
;
; @--- Examples
; {:hovered {:opacity :medium}}
;
;
;
; @title hovered? property
;
; The ':hovered?' property is applied automaticaly.
;
; @--- Accepted types
; {:hovered? (boolean)}
;
; @--- Examples
; {:hovered? true}
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

; @tutorial Style properties
;
; @title style property
;
; @--- Accepted types
; {:style (map)}
;
; @--- Examples
; {:style {:font-size :12px}}
