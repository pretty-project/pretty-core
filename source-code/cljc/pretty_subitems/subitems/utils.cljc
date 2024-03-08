
(ns pretty-subitems.subitems.utils
    (:require [fruits.keyword.api :as keyword]
              [fruits.map.api     :as map]
              [fruits.random.api  :as random]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn subitem-id
  ; @description
  ; Returns the subitem ID derived from the given ID and subitem key.
  ;
  ; @param (keyword)(opt) id
  ; @param (keyword) subitem-key
  ;
  ; @usage
  ; (subitem-id :my-element :my-subitem)
  ; =>
  ; :my-element--my-subitem
  ;
  ; @return (keyword)
  ([subitem-key]
   (subitem-id (random/generate-keyword) subitem-key))

  ([id subitem-key]
   (keyword/append id subitem-key "--")))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn ensure-subitem
  ; @description
  ; Ensures that a specific subitem is present in the given property map, by associating an empty map under the key of the subitem (if NIL).
  ;
  ; @param (map) props
  ; @param (keyword) subitem-key
  ;
  ; @usage
  ; (ensure-subitem {...} :my-subitem)
  ; =>
  ; {:my-subitem {} ...}
  ;
  ; @return (map)
  [props subitem-key]
  (map/use-default-values props {subitem-key {}}))

(defn ensure-subitems
  ; @description
  ; Ensures that specific subitems are present in the given property map, by associating empty maps under the keys of subitems (if NIL).
  ;
  ; @param (map) props
  ; @param (list of keywords)(opt) subitem-keys
  ;
  ; @usage
  ; (ensure-subitems {...} :my-subitem :another-subitem)
  ; =>
  ; {:my-subitem {} :another-subitem {} ...}
  ;
  ; @return (map)
  [props & subitem-keys]
  (reduce ensure-subitem props subitem-keys))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn apply-subitem-longhand
  ; @note
  ; Elements must convert their subitem maps to longhand forms before applying prototype functions on them.
  ;
  ; @description
  ; Converts a specific subitem in the given property map to longhand from in case it is provided in shorthand form.
  ;
  ; @param (map) props
  ; @param (keyword) subitem-key
  ; @param (keyword) shorthand-key
  ;
  ; @usage
  ; (apply-subitem-longhand {:my-subitem {:content "My content"}} :my-subitem :content)
  ; =>
  ; {:my-subitem {:content "My content"}}
  ;
  ; @usage
  ; (apply-subitem-longhand {:my-subitem "My content"} :my-subitem :content)
  ; =>
  ; {:my-subitem {:content "My content"}}
  ;
  ; @return (map)
  [props subitem-key shorthand-key]
  (letfn [(f0 [%] (map/to-longhand % shorthand-key))]
         (update props subitem-key f0)))

(defn apply-subitem-prototype
  ; @description
  ; Applies the given prototype function on a specific subitem property map within the given property map,
  ; only in case it contained the subitem key.
  ;
  ; @param (map) props
  ; @param (keyword) subitem-key
  ; @param (function) prototype-f
  ;
  ; @usage
  ; (apply-subitem-prototype {:my-subitem {...} ...}
  ;                          :my-subitem
  ;                          (fn [subitem-props] ...))
  ; =>
  ; {:my-subitem {...} ...}
  ;
  ; @return (map)
  [props subitem-key prototype-f]
  (map/update-some props subitem-key prototype-f))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn subitem<-disabled-state
  ; @description
  ; Inherits the ':disabled?' property (if any) to a specific subitem in the given property map.
  ;
  ; @param (map) props
  ; {:disabled? (boolean)(opt)
  ;  ...}
  ; @param (keyword) subitem-key
  ;
  ; @usage
  ; (subitem<-disabled-state {:disabled? true :my-subitem {...} ...}
  ;                          :my-subitem)
  ; =>
  ; {:disabled?  true
  ;  :my-subitem {:disabled? true ...}
  ;  ...}
  ;
  ; @return (map)
  [{:keys [disabled?] :as props} subitem-key]
  (cond (-> disabled? nil?)         (-> props)
        (-> props subitem-key nil?) (-> props)
        :else (-> props (assoc-in [subitem-key :disabled?] disabled?))))

(defn subitems<-disabled-state
  ; @description
  ; Inherits the ':disabled?' property (if any) to specific subitems in the given property map.
  ;
  ; @param (map) props
  ; {:disabled? (boolean)(opt)
  ;  ...}
  ; @param (list of keywords) subitem-keys
  ;
  ; @usage
  ; (subitems<-disabled-state {:disabled? true :my-subitem {...} :another-subitem {...} ...}
  ;                           :my-subitem :another-subitem)
  ; =>
  ; {:disabled?       true
  ;  :my-subitem      {:disabled? true ...}
  ;  :another-subitem {:disabled? true ...}
  ;  ...}
  ;
  ; @return (map)
  [props & subitem-keys]
  (reduce subitem<-disabled-state props subitem-keys))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn leave-disabled-state
  ; @description
  ; Dissociates the ':disabled?' property from the given property map,
  ; in case it contains any of the given subitem keys or no subitem key is provided.
  ;
  ; @param (map) props
  ; @param (list of keywords)(opt) subitem-keys
  ;
  ; @usage
  ; (leave-disabled-state {:disabled? true :my-subitem {...} ...}
  ;                       :my-subitem :another-subitem)
  ; =>
  ; {:disabled?  nil
  ;  :my-subitem {...}
  ;  ...}
  ;
  ; @return (map)
  [props & subitem-keys]
  (cond (-> subitem-keys empty?)                        (-> props (dissoc :disabled?))
        (-> props (map/contains-any-key? subitem-keys)) (-> props (dissoc :disabled?))
        :return props))
