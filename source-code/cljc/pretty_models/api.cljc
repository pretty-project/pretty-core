
(ns pretty-models.api
    (:require [pretty-models.clickable.tags       :as clickable.tags]
              [pretty-models.clickable.attributes :as clickable.attributes]
              [pretty-models.clickable.rules      :as clickable.rules]
              [pretty-models.clickable.standards  :as clickable.standards]
              [pretty-models.container.attributes :as container.attributes]
              [pretty-models.container.rules      :as container.rules]
              [pretty-models.container.standards  :as container.standards]
              [pretty-models.content.attributes   :as content.attributes]
              [pretty-models.content.rules        :as content.rules]
              [pretty-models.content.standards    :as content.standards]
              [pretty-models.field.tags           :as field.tags]
              [pretty-models.icon.attributes      :as icon.attributes]
              [pretty-models.icon.rules           :as icon.rules]
              [pretty-models.icon.standards       :as icon.standards]
              [pretty-models.image.attributes      :as image.attributes]
              [pretty-models.image.rules           :as image.rules]
              [pretty-models.image.standards       :as image.standards]
              [pretty-models.line.attributes     :as line.attributes]
              [pretty-models.line.rules          :as line.rules]
              [pretty-models.line.standards      :as line.standards]
              [pretty-models.multiline.attributes :as multiline.attributes]
              [pretty-models.multiline.rules      :as multiline.rules]
              [pretty-models.multiline.standards  :as multiline.standards]
              [pretty-models.plain.attributes     :as plain.attributes]
              [pretty-models.plain.rules          :as plain.rules]
              [pretty-models.plain.standards      :as plain.standards]
              [pretty-models.shape.attributes     :as shape.attributes]
              [pretty-models.shape.rules          :as shape.rules]
              [pretty-models.shape.standards      :as shape.standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Pretty models
; ...

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (pretty-models.clickable.attributes/*)
(def clickable-model-content-attributes clickable.attributes/clickable-model-content-attributes)
(def clickable-model-inner-attributes   clickable.attributes/clickable-model-inner-attributes)
(def clickable-model-outer-attributes   clickable.attributes/clickable-model-outer-attributes)

; @redirect (pretty-models.clickable.rules/*)
(def clickable-model-rules clickable.rules/clickable-model-rules)

; @redirect (pretty-models.clickable.standards/*)
(def clickable-model-standard-props clickable.standards/clickable-model-standard-props)

; @redirect (pretty-models.clickable.tags/*)
(def clickable-model-auto-tag clickable.tags/clickable-model-auto-tag)

; @redirect (pretty-models.container.attributes/*)
(def container-model-content-attributes container.attributes/container-model-content-attributes)
(def container-model-inner-attributes   container.attributes/container-model-inner-attributes)
(def container-model-outer-attributes   container.attributes/container-model-outer-attributes)

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
(def icon-model-inner-attributes   icon.attributes/icon-model-inner-attributes)
(def icon-model-outer-attributes   icon.attributes/icon-model-outer-attributes)

; @redirect (pretty-models.icon.rules/*)
(def icon-model-rules icon.rules/icon-model-rules)

; @redirect (pretty-models.icon.standards/*)
(def icon-model-standard-props icon.standards/icon-model-standard-props)

; @redirect (pretty-models.image.attributes/*)
(def image-model-content-attributes image.attributes/image-model-content-attributes)
(def image-model-inner-attributes   image.attributes/image-model-inner-attributes)
(def image-model-outer-attributes   image.attributes/image-model-outer-attributes)

; @redirect (pretty-models.image.rules/*)
(def image-model-rules image.rules/image-model-rules)

; @redirect (pretty-models.image.standards/*)
(def image-model-standard-props image.standards/image-model-standard-props)

; @redirect (pretty-models.line.attributes/*)
(def line-model-content-attributes line.attributes/line-model-content-attributes)
(def line-model-inner-attributes   line.attributes/line-model-inner-attributes)
(def line-model-outer-attributes   line.attributes/line-model-outer-attributes)

; @redirect (pretty-models.line.rules/*)
(def line-model-rules line.rules/line-model-rules)

; @redirect (pretty-models.line.standards/*)
(def line-model-standard-props line.standards/line-model-standard-props)

; @redirect (pretty-models.multiline.attributes/*)
(def multiline-model-content-attributes multiline.attributes/multiline-model-content-attributes)
(def multiline-model-inner-attributes   multiline.attributes/multiline-model-inner-attributes)
(def multiline-model-outer-attributes   multiline.attributes/multiline-model-outer-attributes)

; @redirect (pretty-models.multiline.rules/*)
(def multiline-model-rules multiline.rules/multiline-model-rules)

; @redirect (pretty-models.multiline.standards/*)
(def multiline-model-standard-props multiline.standards/multiline-model-standard-props)

; @redirect (pretty-models.plain.attributes/*)
(def plain-model-content-attributes plain.attributes/plain-model-content-attributes)
(def plain-model-inner-attributes   plain.attributes/plain-model-inner-attributes)
(def plain-model-outer-attributes   plain.attributes/plain-model-outer-attributes)

; @redirect (pretty-models.plain.rules/*)
(def plain-model-rules plain.rules/plain-model-rules)

; @redirect (pretty-models.plain.standards/*)
(def plain-model-standard-props plain.standards/plain-model-standard-props)

; @redirect (pretty-models.shape.attributes/*)
(def shape-model-content-attributes shape.attributes/shape-model-content-attributes)
(def shape-model-inner-attributes   shape.attributes/shape-model-inner-attributes)
(def shape-model-outer-attributes   shape.attributes/shape-model-outer-attributes)

; @redirect (pretty-models.shape.rules/*)
(def shape-model-rules shape.rules/shape-model-rules)

; @redirect (pretty-models.shape.standards/*)
(def shape-model-standard-props shape.standards/shape-model-standard-props)
