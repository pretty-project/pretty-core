
(ns pretty-rules.basic.rules
    (:require [fruits.map.api :as map]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn auto-disable-tab
  ; @description
  ; Sets the default value of ':tab-disabled?' property to FALSE on disabled elements.
  ;
  ; @param (map) props
  ;
  ; @usage
  ; (auto-disable-tab {:disabled? true ...})
  ; =>
  ; {:disabled? true
  ;  :tab-disabled? true
  ;  ...}
  ;
  ; @return (map)
  [{:keys [disabled?] :as props}]
  (if disabled? (-> props (map/use-default-values {:tab-disabled? true}))
                (-> props)))

(defn auto-set-mounted
  ; @description
  ; Sets the default value of ':mounted?' property as TRUE.
  ;
  ; @param (map) props
  ;
  ; @usage
  ; (auto-set-mounted {...})
  ; =>
  ; {:mounted? true
  ;  ...}
  ;
  ; @return (map)
  [props]
  (-> props (map/use-default-values {:mounted? true})))
