
(ns pretty-models.control.click.standards
    (:require [pretty-standards.api :as pretty-standards]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn click-control-standard-props
  [props]
  (-> props (pretty-standards/standard-anchor-props)
            (pretty-standards/standard-progress-props)))
