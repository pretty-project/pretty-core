
(ns pretty-models.container.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn container-model-content-attributes
  [attributes _]
  (-> attributes))

(defn container-model-inner-attributes
  [attributes props]
  (-> attributes (pretty-attributes/animation-attributes        props)
                 (pretty-attributes/background-color-attributes props)
                 (pretty-attributes/border-attributes           props)
                 (pretty-attributes/cursor-attributes           props)
                 (pretty-attributes/flex-attributes             props)
                 (pretty-attributes/grid-attributes             props)
                 (pretty-attributes/inner-size-attributes       props)
                 (pretty-attributes/inner-space-attributes      props)
                 (pretty-attributes/mouse-event-attributes      props)
                 (pretty-attributes/state-attributes            props)
                 (pretty-attributes/style-attributes            props)))

(defn container-model-outer-attributes
  [attributes props]
  (-> attributes (pretty-attributes/class-attributes          props)
                 (pretty-attributes/inner-position-attributes props)
                 (pretty-attributes/outer-position-attributes props)
                 (pretty-attributes/outer-size-attributes     props)
                 (pretty-attributes/outer-space-attributes    props)
                 (pretty-attributes/theme-attributes          props)
                 (pretty-attributes/transformation-attributes props)
                 (pretty-attributes/visibility-attributes     props)))
