
(ns pretty-rules.layout.rules
    (:require [fruits.map.api :as map]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn auto-align-scrollable-flex
  ; @description
  ; In case the ':overflow' property is provided as ':scroll' ...
  ; ... and the ':orientation' property is provided as ':horizontal' ...
  ;     ... it replaces ':center' or NIL ':horizontal-align' values with ':left'.
  ; ... and the ':orientation' property is provided as ':vertical' ...
  ;     ... it replaces ':center' or NIL ':vertical-align' values with ':top'.
  ;
  ; @param (map) props
  ; {:horizontal-align (keyword)(opt)
  ;  :orientation (keyword)(opt)
  ;  :overflow (keyword)(opt)
  ;  :vertical-align (keyword)(opt)
  ;  ...}
  ;
  ; @usage
  ; (auto-align-scrollable-flex {:orientation :horizontal :overflow :scroll ...})
  ; =>
  ; {:horizontal-align :left
  ;  :orientation      :horizontal
  ;  :overflow         :scroll
  ;  ...}
  ;
  ; @return (map)
  ; {:horizontal-align (keyword)
  ;  :vertical-align (keyword)
  ;  ...}
  [{:keys [horizontal-align orientation overflow vertical-align] :as props}]
  (or (case overflow :scroll (case orientation :horizontal (-> props (assoc :horizontal-align (case horizontal-align :center :left nil :left horizontal-align)))
                                               :vertical   (-> props (assoc :vertical-align   (case vertical-align   :center :top  nil :top  vertical-align)))))
      (-> props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn auto-adapt-wrapper-size
  ; @description
  ; If the ':height' or ':width' properties are provided as ':auto' or ':parent',
  ; it uses ':auto' or ':parent' as default value for the ':wrapper-height' and ':wrapper-width' properties,
  ; to make the wrapper element let its inner element expand.
  ; Otherwise, it uses
  ;
  ; @param (map) props
  ; {:height (keyword, px or string)(opt)
  ;  :width (keyword, px or string)(opt)
  ;  :wrapper-height (keyword, px or string)(opt)
  ;  :wrapper-width (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (auto-adapt-wrapper-size {:height :parent :width :parent ...})
  ; =>
  ; {:height         :parent
  ;  :width          :parent
  ;  :wrapper-height :parent
  ;  :wrapper-width  :parent
  ;  ...}
  ;
  ; @return (map)
  ; {:wrapper-height (keyword, px or string)
  ;  :wrapper-width (keyword, px or string)
  ;  ...}
  [{:keys [height width] :as props}]
  (-> props (map/merge-some {:wrapper-height (case height :auto :auto :parent :parent)
                             :wrapper-width  (case width  :auto :auto :parent :parent)})))
