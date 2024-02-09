
(ns pretty-properties.content.props
    (:require [fruits.map.api                   :as map]
              [metamorphic-content.api          :as metamorphic-content]
              [pretty-properties.content.config :as content.config]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-cursor-props
  ; @description
  ; Applies the given default cursor properties on the given property map.
  ;
  ; @param (map) props
  ; {:cursor (keyword or string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-cursor-props {...} {:cursor :pointer})
  ; =>
  ; {:cursor :pointer
  ;  ...}
  ;
  ; @return (map)
  ; {:cursor (keyword or string)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-font-props
  ; @description
  ; - Applies the given default font properties on the given property map.
  ; - Applies the standard font properties on the given property map;
  ;   in case of any font related value is provided.
  ; - The presence of any of the following values in the given property map
  ;   or in the given default property map also triggers the application
  ;   of the standard font properties:
  ;   ':content', ':content-placeholder', ':label', ':label-placeholder'
  ;
  ; @param (map) props
  ; {:content (metamorphic-content)(opt)
  ;  :content-placeholder (metamorphic-content)(opt)
  ;  :font-size (keyword, px or string)(opt)
  ;  :font-weight (keyword)(opt)
  ;  :label (metamorphic-content)(opt)
  ;  :label-placeholder (metamorphic-content)(opt)
  ;  :letter-spacing (keyword, px or string)(opt)
  ;  :line-height (keyword, px or string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-font-props {...} {:label "My label"})
  ; =>
  ; {:font-size      :s
  ;  :font-weight    :normal
  ;  :label          "My label"
  ;  :letter-spacing :auto
  ;  :line-height    :text-block
  ;  ...}
  ;
  ; @return (map)
  ; {:font-size (keyword, px or string)
  ;  :font-weight (keyword)
  ;  :letter-spacing (keyword, px or string)
  ;  :line-height (keyword, px or string)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)
            (map/use-default-value-group content.config/STANDARD-FONT-PROPERTIES
                                         {:content nil :content-placeholder nil :label nil :label-placeholder nil})))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn inherit-icon-props
  ; @note
  ; Inheriting font/text related values as default values for icon related properties
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
  (if (-> icon nil?)
      (-> props)
      (-> props (map/use-default-values {:icon-color text-color
                                         :icon-size  font-size}))))

(defn default-icon-props
  ; @description
  ; - Applies the given default icon properties on the given property map.
  ; - Applies the standard icon properties on the given property map;
  ;   in case of any icon related value is provided.
  ;
  ; @param (map) props
  ; {:icon (keyword)(opt)
  ;  :icon-color (keyword or string)(opt)
  ;  :icon-family (keyword)(opt)
  ;  :icon-size (keyword, px or string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-icon-props {...} {:icon :my_icon})
  ; =>
  ; {:icon        :my_icon
  ;  :icon-color  :default
  ;  :icon-family :material-symbols-outlined
  ;  :icon-size   :s
  ;  ...}
  ;
  ; @return (map)
  ; {:icon (keyword)
  ;  :icon-color (keyword or string)
  ;  :icon-family (keyword)
  ;  :icon-size (keyword, px or string)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)
            (map/use-default-value-group content.config/STANDARD-ICON-PROPERTIES)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-image-props
  ; @description
  ; Applies the given default image properties on the given property map.
  ;
  ; @param (map) props
  ; {:image-alt (string)(opt)
  ;  :image-uri (string)(opt)
  ;  :on-error-f (function)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-image-props {...} {:image-alt "My image" :image-uri "/my-image-png"})
  ; =>
  ; {:image-alt "My image"
  ;  :image-uri "/my-image-png"
  ;  ...}
  ;
  ; @return (map)
  ; {:image-alt (string)
  ;  :image-uri (string)
  ;  :on-error-f (function)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-text-props
  ; @description
  ; - Applies the given default text properties on the given property map.
  ; - Applies the standard text properties on the given property map;
  ;   in case of any text related value is provided.
  ; - The presence of any of the following values in the given property map
  ;   or in the given default property map also triggers the application
  ;   of the standard text properties:
  ;   ':content', ':content-placeholder', ':label', ':label-placeholder'
  ;
  ; @param (map) props
  ; {:content (metamorphic-content)(opt)
  ;  :content-placeholder (metamorphic-content)(opt)
  ;  :label (metamorphic-content)(opt)
  ;  :label-placeholder (metamorphic-content)(opt)
  ;  :text-align (keyword)(opt)
  ;  :text-caret (keyword)(opt)
  ;  :text-color (keyword or string)(opt)
  ;  :text-direction (keyword)(opt)
  ;  :text-overflow (keyword)(opt)
  ;  :text-selectable? (boolean)(opt)
  ;  :text-transform (keyword)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-text-props {...} {:label "My label"})
  ; =>
  ; {:label         "My label"
  ;  :text-color    :default
  ;  :text-overflow :visible
  ;  ...}
  ;
  ; @return (map)
  ; {:text-align (keyword)
  ;  :text-caret (keyword)
  ;  :text-color (keyword or string)
  ;  :text-direction (keyword)
  ;  :text-overflow (keyword)
  ;  :text-selectable? (boolean)
  ;  :text-transform (keyword)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)
            (map/use-default-value-group content.config/STANDARD-TEXT-PROPERTIES
                                         {:content nil :content-placeholder nil :label nil :label-placeholder nil})))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-content-props
  ; @description
  ; - Applies the given default content properties on the given property map.
  ; - Composes the ':content' or the ':content-placeholder' metamorphic content value (if any);
  ;   and associates the composed result as ':content' property to the given property map.
  ;
  ; @param (map) props
  ; {:content (metamorphic-content)(opt)
  ;  :content-placeholder (metamorphic-content)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-content-props {...} {:content nil :content-placeholder "My placeholder"})
  ; =>
  ; {:content "My placeholder"
  ;  ...}
  ;
  ; @return (map)
  ; {:content (metamorphic-content)
  ;  ...}
  [{:keys [content content-placeholder] :as props} & [default-props]]
  ; @note (#4445)
  ; Destructuring the 'props' argument requires merging the 'default-props' and 'props' maps,
  ; to make the default properties available in the destructured 'props' map!
  (if (-> default-props (map?))
      (-> props (map/use-default-values default-props) default-content-props)
      (-> props (map/assoc-some :content (metamorphic-content/compose content content-placeholder)))))

(defn default-label-props
  ; @description
  ; - Applies the given default label properties on the given property map.
  ; - Composes the ':label' or the ':label-placeholder' metamorphic content value (if any);
  ;   and associates the composed result as ':label' property to the given property map.
  ;
  ; @param (map) props
  ; {:label (metamorphic-content)(opt)
  ;  :label-placeholder (metamorphic-content)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-label-props {...} {:label nil :label-placeholder "My placeholder"})
  ; =>
  ; {:label "My placeholder"
  ;  ...}
  ;
  ; @return (map)
  ; {:label (metamorphic-content)
  ;  ...}
  [{:keys [label label-placeholder] :as props} & [default-props]]
  ; @note (#4445)
  (if (-> default-props (map?))
      (-> props (map/use-default-values default-props) default-label-props)
      (-> props (map/assoc-some :label (metamorphic-content/compose label label-placeholder)))))
