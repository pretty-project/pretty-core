
(ns pretty-properties.layout.props
    (:require [fruits.map.api :as map]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-expandable-props
  ; @description
  ; Applies the given default expandable properties on the given property map.
  ;
  ; @param (map) props
  ; {:expandable? (boolean)(opt)
  ;  :expanded? (boolean)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-expandable-props {...} {:expanded? true})
  ; =>
  ; {:expanded? true
  ;  ...}
  ;
  ; @return (map)
  ; {:expandable? (boolean)
  ;  :expanded? (boolean)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-flex-props
  ; @description
  ; Applies the given default flex properties on the given property map.
  ;
  ; @param (map) props
  ; {:gap (keyword, px or string)(opt)
  ;  :grow (integer)(opt)
  ;  :horizontal-align (keyword)(opt)
  ;  :orientation (keyword)(opt)
  ;  :overflow (keyword)(opt)
  ;  :shrink (integer)(opt)
  ;  :vertical-align (keyword)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-flex-props {...} {:gap :s})
  ; =>
  ; {:gap :s
  ;  ...}
  ;
  ; @return (map)
  ; {:gap (keyword, px or string)
  ;  :grow (integer)
  ;  :horizontal-align (keyword)
  ;  :orientation (keyword)
  ;  :overflow (keyword)
  ;  :shrink (integer)
  ;  :vertical-align (keyword)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

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

(defn default-fullscreen-props
  ; @description
  ; Applies the given default fullscreen properties on the given property map.
  ;
  ; @param (map) props
  ; {:lock-scroll? (boolean)(opt)
  ;  :stretch-orientation (keyword)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-fullscreen-props {...} {:stretch-orientation :horizontal})
  ; =>
  ; {:stretch-orientation :horizontal
  ;  ...}
  ;
  ; @return (map)
  ; {:lock-scroll? (boolean)
  ;  :stretch-orientation (keyword)
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
  ; Applies the given default shape properties on the given property map.
  ;
  ; @param (map) props
  ; {:strength (percentage)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-shape-props {...} {:strength 100})
  ; =>
  ; {:strength 100
  ;  ...}
  ;
  ; @return (map)
  ; {:strength (percentage)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

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

(defn default-body-size-props
  ; @description
  ; Applies the given default body size properties on the given property map.
  ;
  ; @param (map) props
  ; {:body-height (keyword, px or string)(opt)
  ;  :body-width (keyword, px or string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-body-size-props {...} {:body-height :parent :body-width :parent})
  ; =>
  ; {:body-height :parent
  ;  :body-width  :parent
  ;  ...}
  ;
  ; @return (map)
  ; {:body-height (keyword, px or string)
  ;  :body-width (keyword, px or string)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

(defn default-content-size-props
  ; @description
  ; Applies the given default content size properties on the given property map.
  ;
  ; @param (map) props
  ; {:content-height (keyword, px or string)(opt)
  ;  :content-width (keyword, px or string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-content-size-props {...} {:content-height :parent :content-width :parent})
  ; =>
  ; {:content-height :parent
  ;  :content-width  :parent
  ;  ...}
  ;
  ; @return (map)
  ; {:content-height (keyword, px or string)
  ;  :content-width (keyword, px or string)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

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
