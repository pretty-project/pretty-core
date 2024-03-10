
(ns pretty-models.control.click.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn click-control-content-attributes
  [attributes _]
  (-> attributes))

(defn click-control-inner-attributes
  [attributes props]
  (-> attributes (pretty-attributes/anchor-attributes   props)
                 (pretty-attributes/progress-attributes props)
                 (pretty-attributes/react-attributes    props)))

(defn click-control-outer-attributes
  [attributes _]
  (-> attributes))
