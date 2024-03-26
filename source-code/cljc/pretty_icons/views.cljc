
(ns pretty-icons.views
    (:require [pretty-attributes.api :as pretty-attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn icon
  ; @description
  ; A sample icon component using icon properties to implement icon attributes.
  ;
  ; @param (map) props
  ; {:icon-color (keyword or string)(opt)
  ;  :icon-family (keyword)(opt)
  ;  :icon-size (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (icon {:icon-family :material-icons-outlined
  ;        :icon-name   :nature_people})
  ; =>
  ; [:i {:data-icon-family :material-icons-outlined} :nature_people]
  ;
  ; @return (hiccup)
  [{:keys [icon-name] :as props}]
  [:i (pretty-attributes/icon-attributes {} props) icon-name])
