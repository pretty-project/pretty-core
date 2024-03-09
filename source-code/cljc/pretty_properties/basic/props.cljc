
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

(defn default-lifecycle-props
  ; @description
  ; Applies the given default CSS lifecycle properties on the given property map.
  ;
  ; @param (map) props
  ; {:mounted? (boolean)(opt)
  ;  :on-mount-f (function)(opt)
  ;  :on-unmount-f (function)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-lifecycle-props {...} {:on-mount-f (fn [_] ...)})
  ; =>
  ; {:on-mount-f (fn [_] ...)
  ;  ...}
  ;
  ; @return (map)
  ; {:mounted? (boolean)
  ;  :on-mount-f (function)
  ;  :on-unmount-f (function)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-preset-props
  ; @description
  ; Applies the given default preset properties on the given property map.
  ;
  ; @param (map) props
  ; {:preset (keyword)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-preset-props {...} {:preset :my-preset})
  ; =>
  ; {:preset :my-preset
  ;  ...}
  ;
  ; @return (map)
  ; {:preset (keyword)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-react-props
  ; @description
  ; Applies the given default React properties on the given property map.
  ;
  ; @param (map) props
  ; {:set-reference-f (function)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-react-props {...} {:set-reference-f (fn [_] ...)})
  ; =>
  ; {:set-reference-f (fn [_] ...)
  ;  ...}
  ;
  ; @return (map)
  ; {:set-reference-f (function)
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
  ; {:active (map)(opt)
  ;  :active? (boolean)(opt)
  ;  :disabled (map)(opt)
  ;  :disabled? (boolean)(opt)
  ;  :highlighted (map)(opt)
  ;  :highlighted? (boolean)(opt)
  ;  :hovered (map)(opt)
  ;  :hovered? (boolean)(opt)
  ;  :tab-disabled? (boolean)(opt)
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
  ; {:active (map)
  ;  :active? (boolean)
  ;  :disabled (map)
  ;  :disabled? (boolean)
  ;  :highlighted (map)
  ;  :highlighted? (boolean)
  ;  :hovered (map)
  ;  :hovered? (boolean)
  ;  :tab-disabled? (boolean)
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
