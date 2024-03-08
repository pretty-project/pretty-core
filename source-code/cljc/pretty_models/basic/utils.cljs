
(ns pretty-models.basic.utils
    (:require [fruits.map.api :as map]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn use-longhand
  ; @description
  ; Converts the given property map to longhand from in case it is provided in shorthand form.
  ;
  ; @param (keyword) id
  ; @param (* or map) props
  ; @param (keyword) shorthand-key
  ;
  ; @usage
  ; (use-longhand :my-element {:content "My content"} :content)
  ; =>
  ; {:content "My content"}
  ;
  ; @usage
  ; (use-longhand :my-element "My content" :content)
  ; =>
  ; {:content "My content"}
  ;
  ; @return (map)
  [_ props shorthand-key]
  (map/to-longhand props shorthand-key))
