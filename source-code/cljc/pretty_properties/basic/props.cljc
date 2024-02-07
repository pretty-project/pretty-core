
(ns pretty-properties.basic.props
    (:require [fruits.map.api :as map]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-class-props
  ; @description
  ; Applies the given default CSS class properties on the given property map.
  ;
  ; @param (map) props
  ; {:class (keyword or keywords in vector)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-class-props {...} {:class :my-class})
  ; =>
  ; {:class :my-class
  ;  ...}
  ;
  ; @return (map)
  ; {:class (keyword or keywords in vector)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-state-props
  ; @description
  ; Applies the given default state properties on the given property map.
  ;
  ; @param (map) props
  ; {:covered? (boolean)(opt)
  ;  :disabled? (boolean)(opt)
  ;  :highlighted? (boolean)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-state-props {...} {:disabled? true})
  ; =>
  ; {:disabled? true
  ;  ...}
  ;
  ; @return (map)
  ; {:covered? (boolean)
  ;  :disabled? (boolean)
  ;  :highlighted? (boolean)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-style-props
  ; @description
  ; Applies the given default inline style properties on the given property map.
  ;
  ; @param (map) props
  ; {:style (map)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-style-props {...} {:style {:font-size :12px}})
  ; =>
  ; {:style {:font-size :12px}
  ;  ...}
  ;
  ; @return (map)
  ; {:style (map)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))
