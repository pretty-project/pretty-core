
(ns pretty-models.content.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn content-model-inner-attributes
  [props]
  (-> props (pretty-attributes/animation-attributes        props)
            (pretty-attributes/background-color-attributes props)
            (pretty-attributes/border-attributes           props)
            (pretty-attributes/flex-attributes             props)
            (pretty-attributes/inner-size-attributes       props)
            (pretty-attributes/inner-space-attributes      props)
            (pretty-attributes/mouse-event-attributes      props)
            (pretty-attributes/state-attributes            props)
            (pretty-attributes/style-attributes            props)))

(defn content-model-outer-attributes
  [props]
  (-> props (pretty-attributes/class-attributes          props)
            (pretty-attributes/inner-position-attributes props)
            (pretty-attributes/outer-position-attributes props)
            (pretty-attributes/outer-size-attributes     props)
            (pretty-attributes/outer-space-attributes    props)
            (pretty-attributes/theme-attributes          props)
            (pretty-attributes/transformation-attributes props)
            (pretty-attributes/visibility-attributes     props)))
