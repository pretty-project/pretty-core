
(ns pretty-models.content.flex.attributes
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn flex-content-content-attributes
  ; @description
  ; Associates the content element attributes of the flex content model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes props]
  (-> attributes (pretty-attributes/content-size-attributes props)
                 (pretty-attributes/flex-attributes         props)
                 (pretty-attributes/font-attributes         props)
                 (pretty-attributes/overflow-attributes     props)
                 (pretty-attributes/text-attributes         props)))

(defn flex-content-inner-attributes
  ; @description
  ; Associates the inner element attributes of the flex content model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes _]
  (-> attributes))

(defn flex-content-outer-attributes
  ; @description
  ; Associates the outer element attributes of the flex content model to the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ;
  ; @return (map)
  [attributes _]
  (-> attributes))
