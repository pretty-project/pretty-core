
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
  (case overflow :scroll (case orientation :horizontal (-> props (assoc :horizontal-align (case horizontal-align :center :left nil :left horizontal-align)))
                                           :vertical   (-> props (assoc :vertical-align   (case vertical-align   :center :top  nil :top  vertical-align)))
                                                       (-> props))
                         (-> props)))
