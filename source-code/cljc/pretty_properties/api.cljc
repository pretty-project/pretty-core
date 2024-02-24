
(ns pretty-properties.api
    (:require [pretty-properties.appearance.props  :as appearance.props]
              [pretty-properties.basic.props       :as basic.props]
              [pretty-properties.content.props     :as content.props]
              [pretty-properties.control.props     :as control.props]
              [pretty-properties.data.props        :as data.props]
              [pretty-properties.input.props :as input.props]
              [pretty-properties.layout.props      :as layout.props]
              [pretty-properties.live.props        :as live.props]
              [pretty-properties.svg.props         :as svg.props]
              [pretty-properties.accessories.props :as accessories.props]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Pretty properties
; ...

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Overlay properties
; @redirect (pretty-properties.accessories.tutorials/overlay-properties)

; @redirect (pretty-properties.accessories.props/*)
(def default-overlay-props accessories.props/default-overlay-props)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Background color properties
; @redirect (pretty-properties.appearance.tutorials/background-color-properties)

; @tutorial Background image properties
; @redirect (pretty-properties.appearance.tutorials/background-image-properties)

; @tutorial Border properties
; @redirect (pretty-properties.appearance.tutorials/border-properties)

; @tutorial Line properties
; @redirect (pretty-properties.appearance.tutorials/line-properties)

; @tutorial Shadow properties
; @redirect (pretty-properties.appearance.tutorials/shadow-properties)

; @tutorial Theme properties
; @redirect (pretty-properties.appearance.tutorials/theme-properties)

; @redirect (pretty-properties.appearance.props/*)
(def default-background-color-props appearance.props/default-background-color-props)
(def default-background-image-props appearance.props/default-background-image-props)
(def default-border-props           appearance.props/default-border-props)
(def default-line-props             appearance.props/default-line-props)
(def default-shadow-props           appearance.props/default-shadow-props)
(def default-theme-props            appearance.props/default-theme-props)
(def default-visibility-props       appearance.props/default-visibility-props)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Class properties
; @redirect (pretty-properties.basic.tutorials/class-properties)

; @tutorial Lifecycle properties
; @redirect (pretty-properties.basic.tutorials/lifecycle-properties)

; @tutorial Preset properties
; @redirect (pretty-properties.basic.tutorials/preset-properties)

; @tutorial React properties
; @redirect (pretty-properties.basic.tutorials/react-properties)

; @tutorial State properties
; @redirect (pretty-properties.basic.tutorials/state-properties)

; @tutorial Style properties
; @redirect (pretty-properties.basic.tutorials/style-properties)

; @redirect (pretty-properties.basic.props/*)
(def default-class-props     basic.props/default-class-props)
(def default-lifecycle-props basic.props/default-lifecycle-props)
(def default-preset-props    basic.props/default-preset-props)
(def default-react-props     basic.props/default-react-props)
(def default-state-props     basic.props/default-state-props)
(def default-style-props     basic.props/default-style-props)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Cursor properties
; @redirect (pretty-properties.content.tutorials/cursor-properties)

; @tutorial Font properties
; @redirect (pretty-properties.content.tutorials/font-properties)

; @tutorial Icon properties
; @redirect (pretty-properties.content.tutorials/icon-properties)

; @tutorial Image properties
; @redirect (pretty-properties.content.tutorials/image-properties)

; @tutorial Multiline properties
; @redirect (pretty-properties.content.tutorials/multiline-properties)

; @tutorial Text properties
; @redirect (pretty-properties.content.tutorials/text-properties)

; @tutorial Content properties
; @redirect (pretty-properties.content.tutorials/content-properties)

; @tutorial Label properties
; @redirect (pretty-properties.content.tutorials/label-properties)

; @redirect (pretty-properties.content.props/*)
(def default-cursor-props    content.props/default-cursor-props)
(def default-font-props      content.props/default-font-props)
(def default-icon-props      content.props/default-icon-props)
(def default-image-props     content.props/default-image-props)
(def default-multiline-props content.props/default-multiline-props)
(def default-text-props      content.props/default-text-props)
(def default-content-props   content.props/default-content-props)
(def default-label-props     content.props/default-label-props)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Anchor properties
; @redirect (pretty-properties.control.tutorials/anchor-properties)

; @tutorial Clickable state properties
; @redirect (pretty-properties.control.tutorials/clickable-state-properties)

; @tutorial Keypress properties
; @redirect (pretty-properties.control.tutorials/keypress-properties)

; @tutorial Mouse event properties
; @redirect (pretty-properties.control.tutorials/mouse-event-properties)

; @redirect (pretty-properties.control.props/*)
(def default-anchor-props          control.props/default-anchor-props)
(def default-clickable-state-props control.props/default-clickable-state-props)
(def default-keypress-props        control.props/default-keypress-props)
(def default-mouse-event-props     control.props/default-mouse-event-props)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Data properties
; @redirect (pretty-properties.data.tutorials/data-properties)

; @redirect (pretty-properties.data.props/*)
(def default-data-props data.props/default-data-props)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Input autofill properties
; @redirect (pretty-properties.input.tutorials/input-autofill-properties)

; @tutorial Input event properties
; @redirect (pretty-properties.input.tutorials/input-event-properties)

; @tutorial Input field properties
; @redirect (pretty-properties.input.tutorials/input-field-properties)

; @tutorial Input guide properties
; @redirect (pretty-properties.input.tutorials/input-guide-properties)

; @tutorial Input option properties
; @redirect (pretty-properties.input.tutorials/input-option-properties)

; @tutorial Input state properties
; @redirect (pretty-properties.input.tutorials/input-state-properties)

; @tutorial Input validation properties
; @redirect (pretty-properties.input.tutorials/input-validation-properties)

; @redirect (pretty-properties.input.props/*)
(def default-input-autofill-props   input.props/default-input-autofill-props)
(def default-input-event-props      input.props/default-input-event-props)
(def default-input-field-props      input.props/default-input-field-props)
(def default-input-guide-props      input.props/default-input-guide-props)
(def default-input-option-props     input.props/default-input-option-props)
(def default-input-state-props      input.props/default-input-state-props)
(def default-input-validation-props input.props/default-input-validation-props)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Expandable properties
; @redirect (pretty-properties.layout.tutorials/expandable-properties)

; @tutorial Flex properties
; @redirect (pretty-properties.layout.tutorials/flex-properties)

; @tutorial Grid properties
; @redirect (pretty-properties.layout.tutorials/grid-properties)

; @tutorial Fullscreen properties
; @redirect (pretty-properties.layout.tutorials/fullscreen-properties)

; @tutorial Overflow properties
; @redirect (pretty-properties.layout.tutorials/overflow-properties)

; @tutorial Inner position properties
; @redirect (pretty-properties.layout.tutorials/inner-position-properties)

; @tutorial Outer position properties
; @redirect (pretty-properties.layout.tutorials/outer-position-properties)

; @tutorial Shape properties
; @redirect (pretty-properties.layout.tutorials/shape-properties)

; @tutorial Content size properties
; @redirect (pretty-properties.layout.tutorials/content-size-properties)

; @tutorial Inner size properties
; @redirect (pretty-properties.layout.tutorials/inner-size-properties)

; @tutorial Outer size properties
; @redirect (pretty-properties.layout.tutorials/outer-size-properties)

; @tutorial Size unit systems
; @redirect (pretty-properties.layout.tutorials/size-unit-systems)

; @tutorial Space properties
; @redirect (pretty-properties.layout.tutorials/space-properties)

; @redirect (pretty-properties.layout.props/*)
(def default-expandable-props     layout.props/default-expandable-props)
(def default-flex-props           layout.props/default-flex-props)
(def default-grid-props           layout.props/default-grid-props)
(def default-fullscreen-props     layout.props/default-fullscreen-props)
(def default-overflow-props       layout.props/default-overflow-props)
(def default-inner-position-props layout.props/default-inner-position-props)
(def default-outer-position-props layout.props/default-outer-position-props)
(def default-shape-props          layout.props/default-shape-props)
(def default-content-size-props   layout.props/default-content-size-props)
(def default-inner-size-props     layout.props/default-inner-size-props)
(def default-outer-size-props     layout.props/default-outer-size-props)
(def default-space-props          layout.props/default-space-props)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Animation properties
; @redirect (pretty-properties.live.tutorials/animation-properties)

; @tutorial Effect properties
; @redirect (pretty-properties.live.tutorials/effect-properties)

; @tutorial Progress properties
; @redirect (pretty-properties.live.tutorials/progress-properties)

; @tutorial Transform properties
; @redirect (pretty-properties.live.tutorials/transform-properties)

; @redirect (pretty-properties.live.props/*)
(def default-animation-props live.props/default-animation-props)
(def default-effect-props    live.props/default-effect-props)
(def default-progress-props  live.props/default-progress-props)
(def default-transform-props live.props/default-transform-props)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial SVG circle properties
; @redirect (pretty-properties.svg.tutorials/svg-circle-properties)

; @tutorial SVG stroke properties
; @redirect (pretty-properties.svg.tutorials/svg-stroke-properties)

; @redirect (pretty-properties.svg.props/*)
(def default-svg-circle-props svg.props/default-svg-circle-props)
(def default-svg-stroke-props svg.props/default-svg-stroke-props)
