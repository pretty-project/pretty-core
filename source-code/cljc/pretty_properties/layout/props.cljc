
(ns pretty-properties.layout.props
    (:require [fruits.map.api :as map]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-flex-props
  ; @description
  ; Applies the given default flex properties on the given property map.
  ;
  ; @param (map) props
  ; {:direction (keyword)(opt)
  ;  :gap (keyword, px or string)(opt)
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
  ; {:direction (keyword)
  ;  :gap (keyword, px or string)
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
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-fullscreen-props {...} {:lock-scroll? true})
  ; =>
  ; {:lock-scroll? true
  ;  ...}
  ;
  ; @return (map)
  ; {:lock-scroll? (boolean)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-overflow-props
  ; @description
  ; Applies the given default overflow properties on the given property map.
  ;
  ; @param (map) props
  ; {:horizontal-overflow (keyword)(opt)
  ;  :vertical-overflow (keyword)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-overflow-props {...} {:horizontal-overflow :scroll :vertical-overflow :hidden})
  ; =>
  ; {:horizontal-overflow :scroll
  ;  :vertical-overflow :hidden
  ;  ...}
  ;
  ; @return (map)
  ; {:horizontal-overflow (keyword)
  ;  :vertical-overflow (keyword)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-inner-position-props
  ; @description
  ; Applies the given default inner position properties on the given property map.
  ;
  ; @param (map) props
  ; {:inner-position (keyword)(opt)
  ;  :inner-position-method (keyword)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-inner-position-props {...} {:inner-position :tr :inner-position-method :flex-absolute})
  ; =>
  ; {:inner-position        :tr
  ;  :inner-position-method :flex
  ;  ...}
  ;
  ; @return (map)
  ; {:inner-position (keyword)
  ;  :inner-position-base (keyword)
  ;  :inner-position-method (keyword)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

(defn default-outer-position-props
  ; @description
  ; Applies the given default outer position properties on the given property map.
  ;
  ; @param (map) props
  ; {:outer-layer (keyword or integer)(opt)
  ;  :outer-position (keyword)(opt)
  ;  :outer-position-base (keyword)(opt)
  ;  :outer-position-method (keyword)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-outer-position-props {...} {:outer-layer :uppermost :outer-position :tr :outer-position-method :absolute})
  ; =>
  ; {:outer-layer           :uppermost
  ;  :outer-position        :tr
  ;  :outer-position-method :absolute
  ;  ...}
  ;
  ; @return (map)
  ; {:outer-layer (keyword or integer)
  ;  :outer-position (keyword)
  ;  :outer-position-base (keyword)
  ;  :outer-position-method (keyword)
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
  ; {:strength (percent)(opt)
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
  ; {:strength (percent)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-content-size-props
  ; @description
  ; Applies the given default content size properties on the given property map.
  ;
  ; @param (map) props
  ; {:content-height (keyword, px or string)(opt)
  ;  :content-size-unit (keyword)(opt)
  ;  :content-width (keyword, px or string)(opt)
  ;  :max-content-height (keyword, px or string)(opt)
  ;  :max-content-width (keyword, px or string)(opt)
  ;  :min-content-height (keyword, px or string)(opt)
  ;  :min-content-width (keyword, px or string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-content-size-props {...} {:content-height :xl :content-size-unit :full-block :content-width :xl})
  ; =>
  ; {:content-height    :xl
  ;  :content-size-unit :full-block
  ;  :content-width     :xl
  ;  ...}
  ;
  ; @return (map)
  ; {:content-height (keyword, px or string)
  ;  :content-size-unit (keyword)
  ;  :content-width (keyword, px or string)
  ;  :max-content-height (keyword, px or string)
  ;  :max-content-width (keyword, px or string)
  ;  :min-content-height (keyword, px or string)
  ;  :min-content-width (keyword, px or string)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

(defn default-inner-size-props
  ; @description
  ; Applies the given default inner size properties on the given property map.
  ;
  ; @param (map) props
  ; {:inner-height (keyword, px or string)(opt)
  ;  :inner-size-unit (keyword)(opt)
  ;  :inner-width (keyword, px or string)(opt)
  ;  :max-inner-height (keyword, px or string)(opt)
  ;  :max-inner-width (keyword, px or string)(opt)
  ;  :min-inner-height (keyword, px or string)(opt)
  ;  :min-inner-width (keyword, px or string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-inner-size-props {...} {:inner-height :xl :inner-size-unit :full-block :inner-width :xl})
  ; =>
  ; {:inner-height    :xl
  ;  :inner-size-unit :full-block
  ;  :inner-width     :xl
  ;  ...}
  ;
  ; @return (map)
  ; {:inner-height (keyword, px or string)
  ;  :inner-size-unit (keyword)
  ;  :inner-width (keyword, px or string)
  ;  :max-inner-height (keyword, px or string)
  ;  :max-inner-width (keyword, px or string)
  ;  :min-inner-height (keyword, px or string)
  ;  :min-inner-width (keyword, px or string)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

(defn default-outer-size-props
  ; @description
  ; Applies the given default outer size properties on the given property map.
  ;
  ; @param (map) props
  ; {:outer-height (keyword, px or string)(opt)
  ;  :outer-size-unit (keyword)(opt)
  ;  :outer-width (keyword, px or string)(opt)
  ;  :max-outer-height (keyword, px or string)(opt)
  ;  :max-outer-width (keyword, px or string)(opt)
  ;  :min-outer-height (keyword, px or string)(opt)
  ;  :min-outer-width (keyword, px or string)(opt)
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-outer-size-props {...} {:outer-height :xl :outer-size-unit :full-block :outer-width :xl})
  ; =>
  ; {:outer-height    :xl
  ;  :outer-size-unit :full-block
  ;  :outer-width     :xl
  ;  ...}
  ;
  ; @return (map)
  ; {:max-outer-height (keyword, px or string)
  ;  :max-outer-width (keyword, px or string)
  ;  :min-outer-height (keyword, px or string)
  ;  :min-outer-width (keyword, px or string)
  ;  :outer-height (keyword, px or string)
  ;  :outer-size-unit (keyword)
  ;  :outer-width (keyword, px or string)
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-inner-space-props
  ; @description
  ; Applies the given default inner space properties (indent, outdent) on the given property map.
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
  ;  ...}
  ; @param (map)(opt) default-props
  ;
  ; @usage
  ; (default-inner-space-props {...} {:indent {:all :s}})
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
  ;  ...}
  [props & [default-props]]
  (-> props (map/use-default-values default-props)))

(defn default-outer-space-props
  ; @description
  ; Applies the given default outer space properties (indent, outdent) on the given property map.
  ;
  ; @param (map) props
  ; {:outdent (map)(opt)
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
  ; (default-outer-space-props {...} {:outdent {:all :s}})
  ; =>
  ; {:outdent {:all :s}
  ;  ...}
  ;
  ; @return (map)
  ; {:outdent (map)
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
