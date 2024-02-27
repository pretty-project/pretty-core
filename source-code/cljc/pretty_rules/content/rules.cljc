
(ns pretty-rules.content.rules
    (:require [fruits.map.api :as map]
              [fruits.string.api :as string]
              [metamorphic-content.api :as metamorphic-content]
              [pretty-attributes.api :as pretty-attributes]))

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
  ; for the ':icon-color' and ':icon-size' properties; in case the ':icon-name' property is provided.
  ;
  ; @param (map) props
  ; {:font-size (keyword, px or string)(opt)
  ;  :icon-name (keyword)(opt)
  ;  :text-color (keyword or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (inherit-icon-props {:icon-name :my_icon :text-color :primary ...})
  ; =>
  ; {:icon-color :primary
  ;  :icon-name  :my_icon
  ;  :text-color :primary
  ;  ...}
  ;
  ; @return (map)
  ; {:icon-color (keyword or string)
  ;  :icon-size (keyword, px or string)
  ;  ...}
  [{:keys [font-size icon-name text-color] :as props}]
  (if icon-name (-> props (map/use-default-values {:icon-color text-color :icon-size font-size}))
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

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn auto-count-content-lines
  ; @description
  ; Counts newlines in the value of ':content' property and associates the result as ':line-count' property.
  ;
  ; @param (map) props
  ; {:content (metamorphic-content)(opt)
  ;  ...}
  ;
  ; @usage
  ; (auto-count-content-lines {:content "My line #1\nMy line #2" ...})
  ; =>
  ; {:content    "My line #1\nMy line #2"
  ;  :line-count 2
  ;  ...}
  ;
  ; @return (map)
  ; {:line-count (integer)
  ;  ...}
  [{:keys [content] :as props}]
  (-> props (assoc :line-count (string/line-count content))))

(defn auto-limit-multiline-count
  ; @description
  ; Limits the value of ':line-count' property based on the ':max-lines' and ':min-lines' properties.
  ;
  ; @param (map) props
  ; {:line-count (integer)(opt)
  ;  :max-lines (integer)(opt)
  ;  :min-lines (integer)(opt)
  ;  ...}
  ;
  ; @usage
  ; (auto-limit-multiline-count {:line-count 20 :max-lines 15 ...})
  ; =>
  ; {:line-count 15
  ;  :max-lines  15
  ;  ...}
  ;
  ; @return (map)
  ; {:line-count (integer)
  ;  ...}
  [{:keys [line-count max-lines min-lines] :as props}]
  (if line-count (cond-> props (-> min-lines) (update :line-count max min-lines)
                               (-> max-lines) (update :line-count min max-lines))
                 (-> props)))

(defn auto-set-multiline-height
  ; @description
  ; Sets the value of height property based on the ':font-size', ':line-count' and ':line-height' properties.
  ;
  ; @param (map)(opt)
  ; {:font-size (keyword, px or string)
  ;  :line-count (integer)
  ;  :line-height (keyword, px or string)
  ;  ...}
  ;
  ; @usage
  ; (auto-set-multiline-height {:font-size :s :line-count 5 :line-height :auto ...})
  ; =>
  ; {:content-height "calc(var(--line-height-s) * 5)"
  ;  :font-size      :s
  ;  :line-count     5
  ;  :line-height    :auto
  ;  ...}
  ;
  ; @param (map)
  ; {:content-height (keyword, px or string)
  ;  ...}
  [{:keys [font-size line-count line-height] :as props}]
  (let [multiline-height (pretty-attributes/adaptive-text-height font-size line-height line-count)]
       (-> props (assoc :content-height multiline-height))))
