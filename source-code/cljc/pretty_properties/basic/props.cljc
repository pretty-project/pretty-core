
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
  ; @links
  ; [cljs-component-states](https://mt-app-kit.github.io/cljs-component-states)
  ;
  ; @description
  ; Applies the given default state properties on the given property map.
  ;
  ; @param (map) props
  ; {:active (map)(opt)
  ;  :active? (boolean)(opt)
  ;  :disabled (map)(opt)
  ;  :disabled? (boolean)(opt)
  ;  :failured (map)(opt)
  ;  :failured? (boolean)(opt)
  ;  :focused (map)(opt)
  ;  :focused? (boolean)(opt)
  ;  :highlighted (map)(opt)
  ;  :highlighted? (boolean)(opt)
  ;  :hovered (map)(opt)
  ;  :hovered? (boolean)(opt)
  ;  :pressed (map)(opt)
  ;  :pressed? (boolean)(opt)
  ;  :selected (map)(opt)
  ;  :selected? (boolean)(opt)
  ;  :succeeded (map)(opt)
  ;  :succeeded? (boolean)(opt)
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
  ;  :failured (map)
  ;  :failured? (boolean)
  ;  :focused (map)
  ;  :focused? (boolean)
  ;  :highlighted (map)
  ;  :highlighted? (boolean)
  ;  :hovered (map)
  ;  :hovered? (boolean)
  ;  :pressed (map)
  ;  :pressed? (boolean)
  ;  :selected (map)
  ;  :selected? (boolean)
  ;  :succeeded (map)
  ;  :succeeded? (boolean)
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
