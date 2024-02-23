
(ns pretty-properties.accessories.tutorials)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Overlay properties
;
; @note
; Using predefined color values requires the presence of a set theme on the element / any ancestor element.
;
; @title overlay property
;
; @--- Accepted types
; {:overlay (keyword or string)}
;
; @--- Examples
; {:overlay :primary}
; {:overlay "#888"}
;
; @--- Predefined values
; :cover, :none
;
;
;
; @title overlay-color property
;
; @--- Accepted types
; {:overlay-color (keyword or string)}
;
; @--- Examples
; {:overlay-color :primary}
; {:overlay-color "#888"}
;
; @--- Predefined values
; :transparent,
; :default, :highlight, :invert, :muted, :primary, :secondary, :tertiary, :success, :warning
;
;
;
; @title overlay-opacity property
;
; @--- Accepted types
; {:overlay-opacity (keyword or number)}
;
; @--- Examples
; {:overlay-opacity :soft}
; {:overlay-opacity 0.5}
;
; @--- Predefined values
; :soft, :medium, :hard, :full
