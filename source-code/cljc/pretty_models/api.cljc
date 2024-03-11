
(ns pretty-models.api
    (:require [pretty-models.canvas.icon.attributes :as canvas.icon.attributes]
              [pretty-models.canvas.icon.rules :as canvas.icon.rules]
              [pretty-models.canvas.icon.standards :as canvas.icon.standards]
              [pretty-models.canvas.image.attributes :as canvas.image.attributes]
              [pretty-models.canvas.image.rules :as canvas.image.rules]
              [pretty-models.canvas.image.standards :as canvas.image.standards]
              [pretty-models.canvas.line.attributes :as canvas.line.attributes]
              [pretty-models.canvas.line.rules :as canvas.line.rules]
              [pretty-models.canvas.line.standards :as canvas.line.standards]
              [pretty-models.canvas.shape.attributes :as canvas.shape.attributes]
              [pretty-models.canvas.shape.rules :as canvas.shape.rules]
              [pretty-models.canvas.shape.standards :as canvas.shape.standards]
              [pretty-models.control.click.attributes :as control.click.attributes]
              [pretty-models.control.click.rules :as control.click.rules]
              [pretty-models.control.click.standards :as control.click.standards]
              [pretty-models.control.click.tags :as control.click.tags]
              [pretty-models.container.flex.attributes :as container.flex.attributes]
              [pretty-models.container.flex.rules :as container.flex.rules]
              [pretty-models.container.flex.standards :as container.flex.standards]
              [pretty-models.container.grid.attributes :as container.grid.attributes]
              [pretty-models.container.grid.rules :as container.grid.rules]
              [pretty-models.container.grid.standards :as container.grid.standards]
              [pretty-models.container.plain.attributes :as container.plain.attributes]
              [pretty-models.container.plain.rules :as container.plain.rules]
              [pretty-models.container.plain.standards :as container.plain.standards]
              [pretty-models.content.flex.attributes :as content.flex.attributes]
              [pretty-models.content.flex.rules :as content.flex.rules]
              [pretty-models.content.flex.standards :as content.flex.standards]
              [pretty-models.content.grid.attributes :as content.grid.attributes]
              [pretty-models.content.grid.rules :as content.grid.rules]
              [pretty-models.content.grid.standards :as content.grid.standards]
              [pretty-models.content.multiline.attributes :as content.multiline.attributes]
              [pretty-models.content.multiline.rules :as content.multiline.rules]
              [pretty-models.content.multiline.standards :as content.multiline.standards]
              [pretty-models.content.plain.attributes :as content.plain.attributes]
              [pretty-models.content.plain.rules :as content.plain.rules]
              [pretty-models.content.plain.standards :as content.plain.standards]
              [pretty-models.input.field.attributes :as input.field.attributes]
              [pretty-models.input.field.rules :as input.field.rules]
              [pretty-models.input.field.standards :as input.field.standards]
              [pretty-models.input.field.tags :as input.field.tags]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Pretty models
; ...
;
; (defn my-element
;   [id props]
;   (let [props (flex-container-standard-props)
;         props (flex-container-rules props)]
;        [:div (flex-container-outer-attributes {:class :my-element-outer} props)
;              [:div (flex-container-inner-attributes {:class :my-element-inner} props)
;                    [:div (flex-container-content-attributes {:class :my-element-content} props)
;                          "My element"]]]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Icon canvas model
; @redirect (pretty-models.canvas.icon.tutorials/icon-canvas-model)

; @tutorial Image canvas model
; @redirect (pretty-models.canvas.image.tutorials/image-canvas-model)

; @tutorial Line canvas model
; @redirect (pretty-models.canvas.line.tutorials/line-canvas-model)

; @tutorial Shape canvas model
; @redirect (pretty-models.canvas.shape.tutorials/shape-canvas-model)

; @redirect (pretty-models.canvas.icon.attributes/*)
(def icon-canvas-content-attributes canvas.icon.attributes/icon-canvas-content-attributes)
(def icon-canvas-inner-attributes   canvas.icon.attributes/icon-canvas-inner-attributes)
(def icon-canvas-outer-attributes   canvas.icon.attributes/icon-canvas-outer-attributes)

; @redirect (pretty-models.canvas.icon.rules/*)
(def icon-canvas-rules canvas.icon.rules/icon-canvas-rules)

; @redirect (pretty-models.canvas.icon.standards/*)
(def icon-canvas-standard-props canvas.icon.standards/icon-canvas-standard-props)

; @redirect (pretty-models.canvas.image.attributes/*)
(def image-canvas-content-attributes canvas.image.attributes/image-canvas-content-attributes)
(def image-canvas-inner-attributes   canvas.image.attributes/image-canvas-inner-attributes)
(def image-canvas-outer-attributes   canvas.image.attributes/image-canvas-outer-attributes)

; @redirect (pretty-models.canvas.image.rules/*)
(def image-canvas-rules canvas.image.rules/image-canvas-rules)

; @redirect (pretty-models.canvas.image.standards/*)
(def image-canvas-standard-props canvas.image.standards/image-canvas-standard-props)

; @redirect (pretty-models.canvas.line.attributes/*)
(def line-canvas-content-attributes canvas.line.attributes/line-canvas-content-attributes)
(def line-canvas-inner-attributes   canvas.line.attributes/line-canvas-inner-attributes)
(def line-canvas-outer-attributes   canvas.line.attributes/line-canvas-outer-attributes)

; @redirect (pretty-models.canvas.line.rules/*)
(def line-canvas-rules canvas.line.rules/line-canvas-rules)

; @redirect (pretty-models.canvas.line.standards/*)
(def line-canvas-standard-props canvas.line.standards/line-canvas-standard-props)

; @redirect (pretty-models.canvas.shape.attributes/*)
(def shape-canvas-content-attributes canvas.shape.attributes/shape-canvas-content-attributes)
(def shape-canvas-inner-attributes   canvas.shape.attributes/shape-canvas-inner-attributes)
(def shape-canvas-outer-attributes   canvas.shape.attributes/shape-canvas-outer-attributes)

; @redirect (pretty-models.canvas.shape.rules/*)
(def shape-canvas-rules canvas.shape.rules/shape-canvas-rules)

; @redirect (pretty-models.canvas.shape.standards/*)
(def shape-canvas-standard-props canvas.shape.standards/shape-canvas-standard-props)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Flex container model
; @redirect (pretty-models.container.flex.tutorials/flex-container-model)

; @tutorial Grid container model
; @redirect (pretty-models.container.grid.tutorials/grid-container-model)

; @tutorial Plain container model
; @redirect (pretty-models.container.plain.tutorials/plain-container-model)

; @redirect (pretty-models.container.flex.attributes/*)
(def flex-container-content-attributes container.flex.attributes/flex-container-content-attributes)
(def flex-container-inner-attributes   container.flex.attributes/flex-container-inner-attributes)
(def flex-container-outer-attributes   container.flex.attributes/flex-container-outer-attributes)

; @redirect (pretty-models.container.flex.rules/*)
(def flex-container-rules container.flex.rules/flex-container-rules)

; @redirect (pretty-models.container.flex.standards/*)
(def flex-container-standard-props container.flex.standards/flex-container-standard-props)

; @redirect (pretty-models.container.grid.attributes/*)
(def grid-container-content-attributes container.grid.attributes/grid-container-content-attributes)
(def grid-container-inner-attributes   container.grid.attributes/grid-container-inner-attributes)
(def grid-container-outer-attributes   container.grid.attributes/grid-container-outer-attributes)

; @redirect (pretty-models.container.grid.rules/*)
(def grid-container-rules container.grid.rules/grid-container-rules)

; @redirect (pretty-models.container.grid.standards/*)
(def grid-container-standard-props container.grid.standards/grid-container-standard-props)

; @redirect (pretty-models.container.plain.attributes/*)
(def plain-container-content-attributes container.plain.attributes/plain-container-content-attributes)
(def plain-container-inner-attributes   container.plain.attributes/plain-container-inner-attributes)
(def plain-container-outer-attributes   container.plain.attributes/plain-container-outer-attributes)

; @redirect (pretty-models.container.plain.rules/*)
(def plain-container-rules container.plain.rules/plain-container-rules)

; @redirect (pretty-models.container.plain.standards/*)
(def plain-container-standard-props container.plain.standards/plain-container-standard-props)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Flex content model
; @redirect (pretty-models.content.flex.tutorials/flex-content-model)

; @tutorial Grid content model
; @redirect (pretty-models.content.grid.tutorials/grid-content-model)

; @tutorial Multiline content model
; @redirect (pretty-models.content.multiline.tutorials/multiline-content-model)

; @tutorial Plain content model
; @redirect (pretty-models.content.plain.tutorials/plain-content-model)

; @redirect (pretty-models.content.flex.attributes/*)
(def flex-content-content-attributes content.flex.attributes/flex-content-content-attributes)
(def flex-content-inner-attributes   content.flex.attributes/flex-content-inner-attributes)
(def flex-content-outer-attributes   content.flex.attributes/flex-content-outer-attributes)

; @redirect (pretty-models.content.flex.rules/*)
(def flex-content-rules content.flex.rules/flex-content-rules)

; @redirect (pretty-models.content.flex.standards/*)
(def flex-content-standard-props content.flex.standards/flex-content-standard-props)

; @redirect (pretty-models.content.grid.attributes/*)
(def grid-content-content-attributes content.grid.attributes/grid-content-content-attributes)
(def grid-content-inner-attributes   content.grid.attributes/grid-content-inner-attributes)
(def grid-content-outer-attributes   content.grid.attributes/grid-content-outer-attributes)

; @redirect (pretty-models.content.grid.rules/*)
(def grid-content-rules content.grid.rules/grid-content-rules)

; @redirect (pretty-models.content.grid.standards/*)
(def grid-content-standard-props content.grid.standards/grid-content-standard-props)

; @redirect (pretty-models.content.multiline.attributes/*)
(def multiline-content-content-attributes content.multiline.attributes/multiline-content-content-attributes)
(def multiline-content-inner-attributes   content.multiline.attributes/multiline-content-inner-attributes)
(def multiline-content-outer-attributes   content.multiline.attributes/multiline-content-outer-attributes)

; @redirect (pretty-models.content.multiline.rules/*)
(def multiline-content-rules content.multiline.rules/multiline-content-rules)

; @redirect (pretty-models.content.multiline.standards/*)
(def multiline-content-standard-props content.multiline.standards/multiline-content-standard-props)

; @redirect (pretty-models.content.plain.attributes/*)
(def plain-content-content-attributes content.plain.attributes/plain-content-content-attributes)
(def plain-content-inner-attributes   content.plain.attributes/plain-content-inner-attributes)
(def plain-content-outer-attributes   content.plain.attributes/plain-content-outer-attributes)

; @redirect (pretty-models.content.plain.rules/*)
(def plain-content-rules content.plain.rules/plain-content-rules)

; @redirect (pretty-models.content.plain.standards/*)
(def plain-content-standard-props content.plain.standards/plain-content-standard-props)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Click control model
; @redirect (pretty-models.control.click.tutorials/click-control-model)

; @redirect (pretty-models.control.click.attributes/*)
(def click-control-content-attributes control.click.attributes/click-control-content-attributes)
(def click-control-inner-attributes   control.click.attributes/click-control-inner-attributes)
(def click-control-outer-attributes   control.click.attributes/click-control-outer-attributes)

; @redirect (pretty-models.control.click.rules/*)
(def click-control-rules control.click.rules/click-control-rules)

; @redirect (pretty-models.control.click.standards/*)
(def click-control-standard-props control.click.standards/click-control-standard-props)

; @redirect (pretty-models.control.click.tags/*)
(def click-control-auto-tag control.click.tags/click-control-auto-tag)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Field input model
; @redirect (pretty-models.input.field.tutorials/field-input-model)

; @redirect (pretty-models.input.field.attributes/*)
(def field-input-content-attributes input.field.attributes/field-input-content-attributes)
(def field-input-inner-attributes   input.field.attributes/field-input-inner-attributes)
(def field-input-outer-attributes   input.field.attributes/field-input-outer-attributes)

; @redirect (pretty-models.input.field.rules/*)
(def field-input-rules input.field.rules/field-input-rules)

; @redirect (pretty-models.input.field.standards/*)
(def field-input-standard-props input.field.standards/field-input-standard-props)

; @redirect (pretty-models.input.field.tags/*)
(def field-input-auto-tag input.field.tags/field-input-auto-tag)
