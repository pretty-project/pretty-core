
(ns pretty-standards.api
    (:require [pretty-standards.appearance.standards :as appearance.standards]
              [pretty-standards.basic.standards      :as basic.standards]
              [pretty-standards.content.standards    :as content.standards]
              [pretty-standards.control.standards    :as control.standards]
              [pretty-standards.input.standards      :as input.standards]
              [pretty-standards.layout.standards     :as layout.standards]
              [pretty-standards.live.standards       :as live.standards]
              [pretty-standards.svg.standards        :as svg.standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Pretty standards
; ...

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (pretty-properties.appearance.standards/*)
(def standard-background-image-props appearance.standards/standard-background-image-props)
(def standard-border-props           appearance.standards/standard-border-props)
(def standard-line-props             appearance.standards/standard-line-props)

; @redirect (pretty-properties.content.standards/*)
(def standard-font-props      content.standards/standard-font-props)
(def standard-icon-props      content.standards/standard-icon-props)
(def standard-multiline-props content.standards/standard-multiline-props)
(def standard-text-props      content.standards/standard-text-props)

; @redirect (pretty-properties.control.standards/*)
(def standard-anchor-props control.standards/standard-anchor-props)

; @redirect (pretty-properties.input.standards/*)
(def standard-input-autofill-props input.standards/standard-input-autofill-props)
(def standard-input-option-props   input.standards/standard-input-option-props)

; @redirect (pretty-properties.layout.standards/*)
(def standard-flex-props           layout.standards/standard-flex-props)
(def standard-inner-position-props layout.standards/standard-inner-position-props)
(def standard-outer-position-props layout.standards/standard-outer-position-props)
(def standard-shape-props          layout.standards/standard-shape-props)
(def standard-content-size-props   layout.standards/standard-content-size-props)
(def standard-inner-size-props     layout.standards/standard-inner-size-props)
(def standard-outer-size-props     layout.standards/standard-outer-size-props)

; @redirect (pretty-properties.live.standards/*)
(def standard-animation-props live.standards/standard-animation-props)
(def standard-progress-props  live.standards/standard-progress-props)

; @redirect (pretty-properties.svg.standards/*)
(def standard-svg-stroke-props svg.standards/standard-svg-stroke-props)
