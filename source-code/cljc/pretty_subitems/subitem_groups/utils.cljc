
(ns pretty-subitems.subitem-groups.utils
    (:require [fruits.map.api     :as map]
              [fruits.vector.api  :as vector]
              [fruits.string.api  :as string]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn subitem-default-key
  ; @description
  ; Returns the key of the default property map of subitem group items derived from the given subitem group key.
  ;
  ; @param (keyword) subitem-group-key
  ;
  ; @usage
  ; (subitem-default-key :my-subitems)
  ; =>
  ; :my-subitem-default
  ;
  ; @return (keyword)
  [subitem-group-key]
  (-> subitem-group-key name string/remove-last-character (str "-default") keyword))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn apply-group-item-prototype
  ; @description
  ; Applies the given prototype function on each item of a specific subitem group within the given property map.
  ;
  ; @param (map) props
  ; @param (keyword) subitem-group-key
  ; @param (function) prototype-f
  ;
  ; @usage
  ; (apply-group-item-prototype {:my-subitems [{...}] ...}
  ;                             :my-subitems
  ;                             (fn [subitem-dex subitem-props] ...))
  ; =>
  ; {:my-subitems [{...}] ...}
  ;
  ; @return (map)
  [props subitem-group-key prototype-f]
  (letfn [(f0 [group]     (vector/->items group f1 {:provide-dex? true}))
          (f1 [dex props] (prototype-f dex props))]
         (-> props (update subitem-group-key f0))))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn subitem-group<-disabled-state
  ; @description
  ; Inherits the ':disabled?' property (if any) to a specific subitem group in the given property map.
  ;
  ; @param (map) props
  ; {:disabled? (boolean)(opt)
  ;  ...}
  ; @param (keyword) subitem-group-key
  ;
  ; @usage
  ; (subitem-group<-disabled-state {:disabled? true :my-subitem-group [{...} {...}] ...}
  ;                                :my-subitem-group)
  ; =>
  ; {:disabled?        true
  ;  :my-subitem-group [{:disabled? true ...} {:disabled? true ...}]
  ;  ...}
  ;
  ; @return (map)
  [{:keys [disabled?] :as props} subitem-group-key]
  (if (-> disabled? nil?)
      (-> props)
      (-> props (update subitem-group-key vector/update-all-item assoc :disabled? disabled?))))

(defn subitem-groups<-disabled-state
  ; @description
  ; Inherits the ':disabled?' property (if any) to specific subitem groups in the given property map.
  ;
  ; @param (map) props
  ; {:disabled? (boolean)(opt)
  ;  ...}
  ; @param (list of keywords) subitem-group-keys
  ;
  ; @usage
  ; (subitem-groups<-disabled-state {:disabled? true :my-subitem-group [{...} {...}] :another-subitem-group [{...} {...}] ...}
  ;                                 :my-subitem-group :another-subitem-group)
  ; =>
  ; {:disabled?             true
  ;  :my-subitem-group      [{:disabled? true ...} {:disabled? true ...}]
  ;  :another-subitem-group [{:disabled? true ...} {:disabled? true ...}]
  ;  ...}
  ;
  ; @return (map)
  [props & subitem-group-keys]
  (reduce subitem-group<-disabled-state props subitem-group-keys))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn subitem-group<-subitem-default
  ; @description
  ; Merges the default property map of items of a specific subitem group, beneath each group item property map within the given property map.
  ;
  ; @param (map) props
  ; @param (keyword) subitem-group-key
  ;
  ; @usage
  ; (subitem-group<-subitem-default {:my-subitem-default {:font-size :xs} :my-subitems [{...} {...}] ...}
  ;                                 :my-subitems)
  ; =>
  ; {:my-subitem-default {:font-size :xs}
  ;  :my-subitems        [{:font-size :xs ...} {:font-size :xs ...}]
  ;  ...}
  ;
  ; @return (map)
  [props subitem-group-key]
  (let [subitem-default-key (subitem-default-key subitem-group-key)]
       (if-let [subitem-default (get props subitem-default-key)]
               (-> props (update subitem-group-key vector/update-all-item map/reversed-deep-merge subitem-default))
               (-> props))))

(defn subitem-groups<-subitem-default
  ; @description
  ; Merges the default property maps of items of specific subitem groups, beneath each group item property map within the given property map.
  ;
  ; @param (map) props
  ; @param (list of keywords) subitem-group-keys
  ;
  ; @usage
  ; (subitem-groups<-subitem-default {:my-subitem-default      {:font-size :xs}       :my-subitems      [{...} {...}]
  ;                                   :another-subitem-default {:text-color :default} :another-subitems [{...} {...}] ...}
  ;                                  :my-subitems :another-subitems)
  ; =>
  ; {:my-subitem-default      {:font-size :xs}
  ;  :another-subitem-default {:text-color :default}
  ;  :my-subitems             [{:font-size :xs ...} {:font-size :xs ...}]
  ;  :another-subitems        [{:text-color :default ...} {:text-color :default ...}]
  ;  ...}
  ;
  ; @return (map)
  [props & subitem-group-keys]
  (reduce subitem-group<-subitem-default props subitem-group-keys))
