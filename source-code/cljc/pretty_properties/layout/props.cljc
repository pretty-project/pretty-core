
(ns pretty-properties.layout.props
    (:require [fruits.map.api                  :as map]
              [pretty-properties.layout.config :as layout.config]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn flex-scroll-auto-props
  ; @description
  ; The standard ':horizontal-align' and ':vertical-align' properties are not suitable for scrollable elements.
  ; Therefore; in case the ':overflow' property is provided as ':scroll' ...
  ; ... and the ':orientation' property is provided as ':horizontal' ...
  ;     ... uses ':left' as default value for the ':horizontal-align' property.
  ; ... and the ':orientation' property is provided as ':vertical' ...
  ;     ... uses ':top' as default value for the ':vertical-align' property.
  ;
  ; @param (map) props
  ; {:orientation (keyword)(opt)
  ;  :overflow (keyword)(opt)
  ;  ...}
  ;
  ; @usage
  ; (flex-scroll-auto-props {:overflow :visible ...})
  ; =>
  ; {:overflow :visible
  ;  ...}
  ;
  ; @usage
  ; (flex-scroll-auto-props {:orientation :horizontal :overflow :scroll ...})
  ; =>
  ; {:horizontal-align :left
  ;  :orientation      :horizontal
  ;  :overflow         :scroll
  ;  ...}
  ;
  ; @return (map)
  ; {:horizontal-align (keyword)
  ;  :vertical-align (keyword)
  ;  ...}
  [{:keys [orientation overflow] :as props}]
  (case overflow :scroll (case orientation :horizontal (-> props (map/use-default-values {:horizontal-align :left}))
                                           :vertical   (-> props (map/use-default-values {:vertical-align   :top}))
                                                       (-> props))
                         (-> props)))

(defn default-flex-props
  ; @description
  ; - Applies the given default flex properties on the given property map.
  ; - Applies the 'flex-scroll-auto-props' function on the given property map.
  ; - Applies the standard flex properties on the given property map;
  ;   in case of any flex related value is provided.
  ;
  ; @param (map) props
  ; {:gap (keyword, px or string)(opt)
  ;  :horizontal-align (keyword)(opt)
  ;  :orientation (keyword)(opt)
  ;  :overflow (keyword)(opt)
  ;  :vertical-align (keyword)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-flex-props {...} {:gap :s})
  ; =>
  ; {:gap              :s
  ;  :horizontal-align :center
  ;  :vertical-align   :center
  ;  ...}
  ;
  ; @return (map)
  ; {:gap (keyword, px or string)
  ;  :horizontal-align (keyword)
  ;  :orientation (keyword)
  ;  :overflow (keyword)
  ;  :vertical-align (keyword)
  ;  ...}
  [props & [default-props]]
  ; Applies the 'flex-scroll-auto-props' function ...
  ; ... after applying the given default flex properties; because the default properties
  ;     might contain the ':overflow' property.
  ; ... before applying the standard flex properties; because the standard properties
  ;     contain default align settings and the 'flex-scroll-auto-props' function
  ;     doesn't override any existing value in the given property map.
  (-> props (map/use-default-values default-props)
            (flex-scroll-auto-props)
            (map/use-default-value-group layout.config/STANDARD-FLEX-PROPERTIES)))

(defn default-grid-props
  ; @description
  ; Applies the given default grid properties on the given property map.
  ;
  ; @param (map) props
  ; {:column-count (integer)(opt)
  ;  :column-gap (keyword, px or string)(opt)
  ;  :column-template (keyword or string)(opt)
  ;  :row-count (integer)(opt)
  ;  :row-gap (keyword, px or string)(opt)
  ;  :row-template (keyword or string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-grid-props {...} {:column-gap :s})
  ; =>
  ; {:column-gap :s
  ;  ...}
  ;
  ; @return (map)
  ; {:column-count (integer)
  ;  :column-gap (keyword, px or string)
  ;  :column-template (keyword or string)
  ;  :row-count (integer)
  ;  :row-gap (keyword, px or string)
  ;  :row-template (keyword or string)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-position-props
  ; @description
  ; Applies the given default position properties on the given property map.
  ;
  ; @param (map) props
  ; {:layer (keyword or integer)(opt)
  ;  :position (keyword)(opt)
  ;  :position-base (keyword)(opt)
  ;  :position-method (keyword)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-position-props {...} {:layer :uppermost :position :tr :position-method :absolute})
  ; =>
  ; {:layer           :uppermost
  ;  :position        :tr
  ;  :position-method :absolute
  ;  ...}
  ;
  ; @return (map)
  ; {:layer (keyword or integer)
  ;  :position (keyword)
  ;  :position-base (keyword)
  ;  :position-method (keyword)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-shape-props
  ; @description
  ; - Applies the given default shape properties on the given property map.
  ; - Applies the standard shape properties on the given property map.
  ;
  ; @param (map) props
  ; {:strength (percentage)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-shape-props {...} {})
  ; =>
  ; {:strength 100
  ;  ...}
  ;
  ; @return (map)
  ; {:strength (percentage)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values layout.config/STANDARD-SHAPE-PROPERTIES default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-size-props
  ; @description
  ; Applies the given default size properties on the given property map.
  ;
  ; @param (map) props
  ; {:height (keyword, px or string)(opt)
  ;  :max-height (keyword, px or string)(opt)
  ;  :max-width (keyword, px or string)(opt)
  ;  :min-height (keyword, px or string)(opt)
  ;  :min-width (keyword, px or string)(opt)
  ;  :size-unit (keyword)(opt)
  ;  :width (keyword, px or string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-size-props {...} {:height :xl :size-unit :full-block :width :xl})
  ; =>
  ; {:height    :xl
  ;  :size-unit :full-block
  ;  :width     :xl
  ;  ...}
  ;
  ; @return (map)
  ; {:height (keyword, px or string)
  ;  :max-height (keyword, px or string)
  ;  :max-width (keyword, px or string)
  ;  :min-height (keyword, px or string)
  ;  :min-width (keyword, px or string)
  ;  :size-unit (keyword)
  ;  :width (keyword, px or string)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

(defn default-canvas-size-props
  ; @description
  ; Applies the given default canvas size properties on the given property map.
  ;
  ; @param (map) props
  ; {:canvas-height (keyword, px or string)(opt)
  ;  :canvas-width (keyword, px or string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-canvas-size-props {...} {:canvas-height :parent :canvas-width :parent})
  ; =>
  ; {:canvas-height :parent
  ;  :canvas-width  :parent
  ;  ...}
  ;
  ; @return (map)
  ; {:canvas-height (keyword, px or string)
  ;  :canvas-width (keyword, px or string)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

(defn default-wrapper-size-props
  ; @description
  ; - Applies the given default wrapper size properties on the given property map.
  ; - If the ':height' or ':width' properties are provided as ':auto' or ':parent',
  ;   it uses ':auto' or ':parent' as default value for the ':wrapper-height' and ':wrapper-width' properties,
  ;   to make the wrapper element let its inner element expand.
  ;
  ; @param (map) props
  ; {:wrapper-height (keyword, px or string)(opt)
  ;  :wrapper-width (keyword, px or string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-wrapper-size-props {...} {:wrapper-height :content :wrapper-width :content})
  ; =>
  ; {:wrapper-height :content
  ;  :wrapper-width  :content
  ;  ...}
  ;
  ; @return (map)
  ; {:wrapper-height (keyword, px or string)
  ;  :wrapper-width (keyword, px or string)
  ;  ...}
  [{:keys [height width] :as props} & [default-props]]
  ; @note (pretty-properties.content.props#4445)
  (if (-> default-props (map?))
      (-> props (map/use-default-values default-props) default-wrapper-size-props)
      (-> props (map/use-default-values {:wrapper-height (case height :auto :auto :parent :parent :content)
                                         :wrapper-width  (case width  :auto :auto :parent :parent :content)}))))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-space-props
  ; @description
  ; Applies the given default space properties (indent, outdent) on the given property map.
  ;
  ; @param (map) props
  ; {:indent (map)(opt)
  ;   {:bottom (keyword, px or string)(opt)
  ;    :left (keyword, px or string)(opt)
  ;    :right (keyword, px or string)(opt)
  ;    :top (keyword, px or string)(opt)
  ;    :horizontal (keyword, px or string)(opt)
  ;    :vertical (keyword, px or string)(opt)
  ;    :all (keyword, px or string)(opt)}
  ;  :outdent (map)(opt)
  ;   {:bottom (keyword, px or string)(opt)
  ;    :left (keyword, px or string)(opt)
  ;    :right (keyword, px or string)(opt)
  ;    :top (keyword, px or string)(opt)
  ;    :horizontal (keyword, px or string)(opt)
  ;    :vertical (keyword, px or string)(opt)
  ;    :all (keyword, px or string)(opt)}
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-space-props {...} {:indent {:all :s}})
  ; =>
  ; {:indent {:all :s}
  ;  ...}
  ;
  ; @return (map)
  ; {:indent (map)(opt)
  ;   {:bottom (keyword, px or string)
  ;    :left (keyword, px or string)
  ;    :right (keyword, px or string)
  ;    :top (keyword, px or string)
  ;    :horizontal (keyword, px or string)
  ;    :vertical (keyword, px or string)
  ;    :all (keyword, px or string)}
  ;  :outdent (map)
  ;   {:bottom (keyword, px or string)
  ;    :left (keyword, px or string)
  ;    :right (keyword, px or string)
  ;    :top (keyword, px or string)
  ;    :horizontal (keyword, px or string)
  ;    :vertical (keyword, px or string)
  ;    :all (keyword, px or string)}
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))
