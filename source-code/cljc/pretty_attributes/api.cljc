
(ns pretty-attributes.api
    (:require [pretty-attributes.appearance.attributes :as appearance.attributes]
              [pretty-attributes.appearance.utils      :as appearance.utils]
              [pretty-attributes.basic.attributes      :as basic.attributes]
              [pretty-attributes.content.adaptive      :as content.adaptive]
              [pretty-attributes.content.attributes    :as content.attributes]
              [pretty-attributes.control.attributes    :as control.attributes]
              [pretty-attributes.input.attributes      :as input.attributes]
              [pretty-attributes.layout.attributes     :as layout.attributes]
              [pretty-attributes.live.attributes       :as live.attributes]
              [pretty-attributes.svg.attributes        :as svg.attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Pretty attributes
; ...

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (pretty-attributes.appearance.attributes/*)
(def background-action-attributes appearance.attributes/background-action-attributes)
(def background-color-attributes  appearance.attributes/background-color-attributes)
(def background-image-attributes  appearance.attributes/background-image-attributes)
(def border-radius-attributes     appearance.attributes/border-radius-attributes)
(def border-attributes            appearance.attributes/border-attributes)
(def adaptive-border-attributes   appearance.attributes/adaptive-border-attributes)
(def line-attributes              appearance.attributes/line-attributes)
(def shadow-attributes            appearance.attributes/shadow-attributes)
(def theme-attributes             appearance.attributes/theme-attributes)
(def visibility-attributes        appearance.attributes/visibility-attributes)

; @redirect (pretty-attributes.appearance.utils/*)
(def adaptive-border-radius appearance.utils/adaptive-border-radius)

; @redirect (pretty-attributes.basic.attributes/*)
(def class-attributes basic.attributes/class-attributes)
(def react-attributes basic.attributes/react-attributes)
(def state-attributes basic.attributes/state-attributes)
(def style-attributes basic.attributes/style-attributes)

; @redirect (pretty-attributes.content.adaptive/*)
(def adaptive-text-height content.adaptive/adaptive-text-height)

; @redirect (pretty-attributes.content.attributes/*)
(def cursor-attributes content.attributes/cursor-attributes)
(def font-attributes   content.attributes/font-attributes)
(def icon-attributes   content.attributes/icon-attributes)
(def image-attributes  content.attributes/image-attributes)
(def text-attributes   content.attributes/text-attributes)

; @redirect (pretty-attributes.control.attributes/*)
(def anchor-attributes          control.attributes/anchor-attributes)
(def clickable-state-attributes control.attributes/clickable-state-attributes)
(def focus-event-attributes     control.attributes/focus-event-attributes)
(def mouse-event-attributes     control.attributes/mouse-event-attributes)

; @redirect (pretty-attributes.input.attributes/*)
(def input-event-attributes input.attributes/input-event-attributes)
(def input-field-attributes input.attributes/input-field-attributes)
(def input-state-attributes input.attributes/input-state-attributes)

; @redirect (pretty-attributes.layout.attributes/*)
(def flex-attributes           layout.attributes/flex-attributes)
(def grid-attributes           layout.attributes/grid-attributes)
(def overflow-attributes       layout.attributes/overflow-attributes)
(def inner-position-attributes layout.attributes/inner-position-attributes)
(def outer-position-attributes layout.attributes/outer-position-attributes)
(def inner-size-attributes     layout.attributes/inner-size-attributes)
(def outer-size-attributes     layout.attributes/outer-size-attributes)
(def inner-space-attributes    layout.attributes/inner-space-attributes)
(def outer-space-attributes    layout.attributes/outer-space-attributes)
(def content-size-attributes   layout.attributes/content-size-attributes)

; @redirect (pretty-attributes.live.attributes/*)
(def animation-attributes live.attributes/animation-attributes)
(def effect-attributes    live.attributes/effect-attributes)
(def progress-attributes  live.attributes/progress-attributes)
(def transform-attributes live.attributes/transform-attributes)

; @redirect (pretty-attributes.svg.attributes/*)
(def svg-circle-attributes svg.attributes/svg-circle-attributes)
(def svg-stroke-attributes svg.attributes/svg-stroke-attributes)
