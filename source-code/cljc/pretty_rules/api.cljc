
(ns pretty-rules.api
    (:require [pretty-rules.appearance.rules :as appearance.rules]
              [pretty-rules.basic.rules      :as basic.rules]
              [pretty-rules.content.rules    :as content.rules]
              [pretty-rules.control.rules    :as control.rules]
              [pretty-rules.input.rules      :as input.rules]
              [pretty-rules.layout.rules     :as layout.rules]
              [pretty-rules.live.rules       :as live.rules]
              [pretty-rules.svg.rules        :as svg.rules]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Pretty rules
; ...

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (pretty-rules.appearance.rules/*)
(def auto-disable-hover-color     appearance.rules/auto-disable-hover-color)
(def auto-disable-highlight-color appearance.rules/auto-disable-highlight-color)
(def apply-auto-border-crop       appearance.rules/apply-auto-border-crop)

; @redirect (pretty-rules.basic.rules/*)
(def auto-set-mounted basic.rules/auto-set-mounted)

; @redirect (pretty-rules.content.rules/*)
(def auto-disable-cursor        content.rules/auto-disable-cursor)
(def inherit-icon-props         content.rules/inherit-icon-props)
(def compose-content            content.rules/compose-content)
(def compose-label              content.rules/compose-label)
(def auto-count-content-lines   content.rules/auto-count-content-lines)
(def auto-limit-multiline-count content.rules/auto-limit-multiline-count)
(def auto-set-multiline-height  content.rules/auto-set-multiline-height)

; @redirect (pretty-rules.control.rules/*)
(def auto-disable-mouse-events control.rules/auto-disable-mouse-events)
(def auto-blur-click-events    control.rules/auto-blur-click-events)

; @redirect (pretty-rules.input.rules/*)
(def auto-disable-input-autofill  input.rules/auto-disable-input-autofill)
(def generate-input-autofill      input.rules/generate-input-autofill)
(def auto-disable-input-events    input.rules/auto-disable-input-events)
(def assoc-field-value-as-content input.rules/assoc-field-value-as-content)

; @redirect (pretty-rules.layout.rules/*)
(def auto-align-scrollable-flex layout.rules/auto-align-scrollable-flex)

; @redirect (pretty-rules.live.rules/*)
(def auto-disable-effects  live.rules/auto-disable-effects)
(def auto-set-click-effect live.rules/auto-set-click-effect)
