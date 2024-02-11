
(ns pretty-attributes.api
    (:require [pretty-attributes.appearance.attributes  :as appearance.attributes]
              [pretty-attributes.appearance.utils       :as appearance.utils]
              [pretty-attributes.basic.attributes       :as basic.attributes]
              [pretty-attributes.content.adaptive       :as content.adaptive]
              [pretty-attributes.content.attributes     :as content.attributes]
              [pretty-attributes.control.attributes     :as control.attributes]
              [pretty-attributes.input.attributes       :as input.attributes]
              [pretty-attributes.layout.attributes      :as layout.attributes]
              [pretty-attributes.live.attributes        :as live.attributes]
              [pretty-attributes.svg.attributes         :as svg.attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (pretty-attributes.appearance.attributes/*)
(def background-color-attributes appearance.attributes/background-color-attributes)
(def background-image-attributes appearance.attributes/background-image-attributes)
(def border-radius-attributes    appearance.attributes/border-radius-attributes)
(def border-attributes           appearance.attributes/border-attributes)
(def adaptive-border-attributes  appearance.attributes/adaptive-border-attributes)
(def line-attributes             appearance.attributes/line-attributes)
(def shadow-attributes           appearance.attributes/shadow-attributes)
(def theme-attributes            appearance.attributes/theme-attributes)
(def visibility-attributes       appearance.attributes/visibility-attributes)

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
(def mouse-event-attributes     control.attributes/mouse-event-attributes)

; @redirect (pretty-attributes.input.attributes/*)
(def input-autofill-attributes input.attributes/input-autofill-attributes)
(def input-field-attributes    input.attributes/input-field-attributes)
(def input-state-attributes    input.attributes/input-state-attributes)

; @redirect (pretty-attributes.layout.attributes/*)
(def flex-attributes         layout.attributes/flex-attributes)
(def grid-attributes         layout.attributes/grid-attributes)
(def indent-attributes       layout.attributes/indent-attributes)
(def outdent-attributes      layout.attributes/outdent-attributes)
(def position-attributes     layout.attributes/position-attributes)
(def size-attributes         layout.attributes/size-attributes)
(def canvas-size-attributes  layout.attributes/canvas-size-attributes)
(def wrapper-size-attributes layout.attributes/wrapper-size-attributes)

; @redirect (pretty-attributes.live.attributes/*)
(def animation-attributes live.attributes/animation-attributes)
(def effect-attributes    live.attributes/effect-attributes)
(def progress-attributes  live.attributes/progress-attributes)
(def transform-attributes live.attributes/transform-attributes)

; @redirect (pretty-attributes.svg.attributes/*)
(def svg-circle-attributes svg.attributes/svg-circle-attributes)
(def svg-stroke-attributes svg.attributes/svg-stroke-attributes)