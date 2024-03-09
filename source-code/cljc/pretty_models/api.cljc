
(ns pretty-models.api
    (:require [pretty-models.clickable.tags :as clickable.tags]
              [pretty-models.container.attributes :as container.attributes]
              [pretty-models.container.rules :as container.rules]
              [pretty-models.container.standards :as container.standards]
              [pretty-models.content.attributes :as content.attributes]
              [pretty-models.content.rules :as content.rules]
              [pretty-models.content.standards :as content.standards]
              [pretty-models.field.tags :as field.tags]
              [pretty-models.icon.attributes :as icon.attributes]
              [pretty-models.icon.rules :as icon.rules]
              [pretty-models.icon.standards :as icon.standards]
              [pretty-models.multiline.attributes :as multiline.attributes]
              [pretty-models.multiline.rules :as multiline.rules]
              [pretty-models.multiline.standards :as multiline.standards]
              [pretty-models.plain.attributes :as plain.attributes]
              [pretty-models.plain.rules :as plain.rules]
              [pretty-models.plain.standards :as plain.standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Pretty models
; ...

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (pretty-models.clickable.tags/*)
(def clickable-model-auto-tag clickable.tags/clickable-model-auto-tag)

; @redirect (pretty-models.container.attributes/*)
(def container-model-inner-attributes container.attributes/container-model-inner-attributes)
(def container-model-outer-attributes container.attributes/container-model-outer-attributes)

; @redirect (pretty-models.container.rules/*)
(def container-model-rules container.rules/container-model-rules)

; @redirect (pretty-models.container.standards/*)
(def container-model-standard-props container.standards/container-model-standard-props)

; @redirect (pretty-models.content.attributes/*)
(def content-model-content-attributes content.attributes/content-model-content-attributes)
(def content-model-inner-attributes   content.attributes/content-model-inner-attributes)
(def content-model-outer-attributes   content.attributes/content-model-outer-attributes)

; @redirect (pretty-models.content.rules/*)
(def content-model-rules content.rules/content-model-rules)

; @redirect (pretty-models.content.standards/*)
(def content-model-standard-props content.standards/content-model-standard-props)

; @redirect (pretty-models.field.tags/*)
(def field-model-auto-tag field.tags/field-model-auto-tag)

; @redirect (pretty-models.icon.attributes/*)
(def icon-model-content-attributes icon.attributes/icon-model-content-attributes)

; @redirect (pretty-models.icon.rules/*)
(def icon-model-rules icon.rules/icon-model-rules)

; @redirect (pretty-models.icon.standards/*)
(def icon-model-standard-props icon.standards/icon-model-standard-props)

; @redirect (pretty-models.multiline.attributes/*)
(def multiline-model-content-attributes multiline.attributes/multiline-model-content-attributes)

; @redirect (pretty-models.multiline.rules/*)
(def multiline-model-rules multiline.rules/multiline-model-rules)

; @redirect (pretty-models.multiline.standards/*)
(def multiline-model-standard-props multiline.standards/multiline-model-standard-props)

; @redirect (pretty-models.plain.attributes/*)
(def plain-model-inner-attributes plain.attributes/plain-model-inner-attributes)
(def plain-model-outer-attributes plain.attributes/plain-model-outer-attributes)

; @redirect (pretty-models.plain.rules/*)
(def plain-model-rules plain.rules/plain-model-rules)

; @redirect (pretty-models.plain.standards/*)
(def plain-model-standard-props plain.standards/plain-model-standard-props)
