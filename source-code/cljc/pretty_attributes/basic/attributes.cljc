
(ns pretty-attributes.basic.attributes
    (:require [fruits.map.api    :as map]
              [fruits.mixed.api  :as mixed]
              [fruits.vector.api :as vector]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn class-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @note
  ; In case the attribute map already contained any CSS class value, it merges the contained and the applied value.
  ;
  ; @description
  ; Applies the given CSS class value on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:class (keyword or keywords in vector)(opt)
  ;  ...}
  ;
  ; @usage
  ; (class-attributes {...} {:class :my-class})
  ; =>
  ; {:class :my-class
  ;  ...}
  ;
  ; @usage
  ; (class-attributes {...} {:class [:my-class]})
  ; =>
  ; {:class [:my-class]
  ;  ...}
  ;
  ; @usage
  ; (class-attributes {:class :my-class ...} {:class :another-class})
  ; =>
  ; {:class [:my-class :another-class]
  ;  ...}
  ;
  ; @return (map)
  ; {:class (keywords in vector)
  ;  ...}
  [attributes {:keys [class] :as props}]
  (letfn [(f0 [] (vector/concat-items (-> attributes :class mixed/to-vector)
                                      (-> props      :class mixed/to-vector)))]
         (if class (-> attributes (assoc :class (f0)))
                   (-> attributes))))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn react-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the given React related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:set-reference-f (function)(opt)
  ;  ...}
  ;
  ; @usage
  ; (react-attributes {...} {:set-reference-f (fn [_] ...)})
  ; =>
  ; {:ref (fn [_] ...)
  ;  ...}
  ;
  ; @return (map)
  ; {:ref (function)
  ;  ...}
  [attributes {:keys [set-reference-f]}]
  (-> attributes (map/merge-some {:ref set-reference-f})))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn state-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the state related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:disabled? (boolean)(opt)
  ;  ...}
  ;
  ; @usage
  ; (state-attributes {...} {:disabled? true})
  ; =>
  ; {:data-disabled true
  ;  ...}
  ;
  ; @return (map)
  ; {:data-disabled (boolean)
  ;  :data-highlighted (boolean)
  ;  ...}
  [attributes {:keys [disabled?]}]
  (-> attributes (map/merge-some {:data-disabled disabled?})))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn style-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @note
  ; In case the attribute map already contained any inline style value, it merges the contained and the applied value.
  ;
  ; @description
  ; Applies the given inline style value on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:style (map)(opt)
  ;  ...}
  ;
  ; @usage
  ; (style-attributes {...} {:style {...}})
  ; =>
  ; {:style {...}
  ;  ...}
  ;
  ; @usage
  ; (style-attributes {:style {:color :red  :font-size :12px} ...}
  ;                   {:style {:color :blue :font-size :24px :font-weight :500}})
  ; =>
  ; {:style {:color       :red
  ;          :font-size   :12px
  ;          :font-weight :500}
  ;  ...}
  ;
  ; @return (map)
  ; {:style (map)
  ;  ...}
  [attributes {:keys [style]}]
  ; Uses reversed merge ...
  ; ... to take the style map from the attribute map as primary source,
  ; ... to take the style map from the property map as secondary source.
  (if style (-> attributes (update :style map/reversed-merge style))
            (-> attributes)))
