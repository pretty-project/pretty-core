
(ns pretty-rules.content.rules
    (:require [fruits.map.api :as map]
              [metamorphic-content.api :as metamorphic-content]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn auto-disable-cursor
  ; @description
  ; Applies the default cursor on disabled elements unless a specific cursor value is provided.
  ;
  ; @param (map) props
  ; {:disabled? (boolean)(opt)
  ;  ...}
  ;
  ; @usage
  ; (auto-disable-cursor {:disabled? true ...})
  ; =>
  ; {:cursor    :default
  ;  :disabled? true
  ;  ...}
  ;
  ; @return (map)
  ; {:cursor (keyword)
  ;  ...}
  [{:keys [disabled?] :as props}]
  (if disabled? (-> props (map/use-default-values props {:cursor :default}))
                (-> props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn inherit-icon-props
  ; @note
  ; Inheriting font/text related values (as default values for icon related properties)
  ; is recommended for icons that are attached to labels.
  ;
  ; @description
  ; Uses the ':text-color' and ':font-size' properties (if any) as default values
  ; for the ':icon-color' and ':icon-size' properties; in case the ':icon' property is provided.
  ;
  ; @param (map) props
  ; {:font-size (keyword, px or string)(opt)
  ;  :icon (keyword)(opt)
  ;  :text-color (keyword or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (inherit-icon-props {:icon :my_icon :text-color :primary ...})
  ; =>
  ; {:icon       :my_icon
  ;  :icon-color :primary
  ;  :text-color :primary
  ;  ...}
  ;
  ; @return (map)
  ; {:icon-color (keyword or string)
  ;  :icon-size (keyword, px or string)
  ;  ...}
  [{:keys [font-size icon text-color] :as props}]
  (if icon (-> props (map/use-default-values {:icon-color text-color :icon-size font-size}))
           (-> props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn compose-content
  ; @description
  ; Composes the ':content' or the ':content-placeholder' metamorphic content value (if any);
  ; and associates the composed result as ':content' property to the given property map.
  ;
  ; @param (map) props
  ; {:content (metamorphic-content)(opt)
  ;  :content-placeholder (metamorphic-content)(opt)
  ;  ...}
  ;
  ; @usage
  ; (compose-content {:content nil :content-placeholder "My placeholder" ...})
  ; =>
  ; {:content "My placeholder"
  ;  ...}
  ;
  ; @return (map)
  ; {:content (metamorphic-content)
  ;  ...}
  [{:keys [content content-placeholder] :as props}]
  (-> props (map/assoc-some :content (metamorphic-content/compose content content-placeholder))))

(defn compose-label
  ; @description
  ; Composes the ':label' or the ':label-placeholder' metamorphic content value (if any);
  ; and associates the composed result as ':label' property to the given property map.
  ;
  ; @param (map) props
  ; {:label (metamorphic-content)(opt)
  ;  :label-placeholder (metamorphic-content)(opt)
  ;  ...}
  ;
  ; @usage
  ; (compose-label {:label nil :label-placeholder "My placeholder" ...})
  ; =>
  ; {:label "My placeholder"
  ;  ...}
  ;
  ; @return (map)
  ; {:label (metamorphic-content)
  ;  ...}
  [{:keys [label label-placeholder] :as props}]
  (-> props (map/assoc-some :label (metamorphic-content/compose label label-placeholder))))
