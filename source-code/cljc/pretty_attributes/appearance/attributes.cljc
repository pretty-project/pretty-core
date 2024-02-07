
(ns pretty-attributes.appearance.attributes
    (:require [fruits.map.api                     :as map]
              [pretty-attributes.appearance.utils :as appearance.utils]
              [pretty-attributes.utils            :as utils]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn background-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @note
  ; - Automatically turns off the hover color and hover pattern on disabled elements.
  ; - Automatically uses the hover color (if any) as fallback of highlight color (if not provided) on highlighted elements.
  ; - Automatically applies the 'data-highlighted' attribute on highlighted elements.
  ; - Doesn't apply the highlight color and highlight pattern properties on non-highlighted elements.
  ;
  ; @description
  ; Applies the background related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:disabled? (boolean)(opt)
  ;  :fill-color (keyword or string)(opt)
  ;  :fill-pattern (keyword)(opt)
  ;  :highlighted? (boolean)(opt)
  ;  :highlight-color (keyword or string)(opt)
  ;  :highlight-pattern (keyword)(opt)
  ;  :hover-color (keyword or string)(opt)
  ;  :hover-pattern (keyword)(opt)
  ;  ...}
  ;
  ; @usage
  ; (background-attributes {...} {:fill-color :highlight :hover-color :highlight})
  ; =>
  ; {:data-fill-color  :highlight
  ;  :data-hover-color :highlight
  ;  ...}
  ;
  ; @usage
  ; (background-attributes {...} {:fill-color :highlight :hover-color :highlight
  ;                               :disabled? true})
  ; =>
  ; {:data-fill-color :highlight
  ;  ...}
  ;
  ; @return (map)
  ; {:data-fill-color (keyword)
  ;  :data-fill-pattern (keyword)
  ;  :data-highlighted (boolean)
  ;  :data-highlight-color (keyword)
  ;  :data-highlight-pattern (keyword)
  ;  :data-hover-color (keyword)
  ;  :data-hover-pattern (keyword)
  ;  :style (map)
  ;   {"--fill-color" (string)
  ;    "--highlight-color" (string)}
  ;    "--hover-color" (string)}
  ;  ...}
  [attributes {:keys [disabled? fill-color fill-pattern highlight-color highlight-pattern highlighted? hover-color hover-pattern]}]
  (cond (and disabled? highlighted?)
        (-> attributes (map/assoc-some             :data-highlighted                      highlighted?)
                       (map/assoc-some             :data-fill-pattern                     fill-pattern)
                       (map/assoc-some             :data-highlight-pattern                hover-pattern)
                       (utils/apply-property-value :fill-color      :data-fill-color      fill-color)
                       (utils/apply-property-value :highlight-color :data-highlight-color hover-color)
                       (utils/apply-property-value :highlight-color :data-highlight-color highlight-color))
        (-> disabled?)
        (-> attributes (map/assoc-some             :data-fill-pattern           fill-pattern)
                       (utils/apply-property-value :fill-color :data-fill-color fill-color))
        (-> highlighted?)
        (-> attributes (map/assoc-some             :data-highlighted                      highlighted?)
                       (map/assoc-some             :data-fill-pattern                     fill-pattern)
                       (map/assoc-some             :data-highlight-pattern                hover-pattern)
                       (map/assoc-some             :data-hover-pattern                    hover-pattern)
                       (utils/apply-property-value :fill-color      :data-fill-color      fill-color)
                       (utils/apply-property-value :highlight-color :data-highlight-color hover-color)
                       (utils/apply-property-value :highlight-color :data-highlight-color highlight-color)
                       (utils/apply-property-value :hover-color     :data-hover-color     hover-color))
        :default
        (-> attributes (map/assoc-some             :data-fill-pattern             fill-pattern)
                       (map/assoc-some             :data-hover-pattern            hover-pattern)
                       (utils/apply-property-value :fill-color  :data-fill-color  fill-color)
                       (utils/apply-property-value :hover-color :data-hover-color hover-color))))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn border-radius-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the border radius related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:border-radius (map)(opt)
  ;   {:tl (keyword, px or string)(opt)
  ;    :tr (keyword, px or string)(opt)
  ;    :br (keyword, px or string)(opt)
  ;    :bl (keyword, px or string)(opt)
  ;    :all (keyword, px or string)(opt)}
  ;  ...}
  ;
  ; @usage
  ; (border-radius-attributes {...} {:border-radius {:tr :xxl :tl :xs}})
  ; =>
  ; {:data-border-radius-tr :xxl
  ;  :data-border-radius-tl :xs
  ;  ...}
  ;
  ; @return (map)
  ; {:data-border-radius-all (keyword)
  ;  :data-border-radius-bl (keyword)
  ;  :data-border-radius-br (keyword)
  ;  :data-border-radius-tl (keyword)
  ;  :data-border-radius-tr (keyword)
  ;  :style (map)
  ;   {"--border-radius-all" (string)
  ;    "--border-radius-bl" (string)
  ;    "--border-radius-br" (string)
  ;    "--border-radius-tl" (string)
  ;    "--border-radius-tr" (string)}
  ;  ...}
  [attributes {:keys [border-radius]}]
  (letfn [(f0 [result k v]
              (let [css-var-name        (keyword (str      "border-radius-" (name k)))
                    data-attribute-name (keyword (str "data-border-radius-" (name k)))]
                   (utils/apply-property-value result css-var-name data-attribute-name v "px")))]
         (merge attributes (if (map?            border-radius)
                               (reduce-kv f0 {} border-radius)))))

(defn border-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the border related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:border-color (keyword or string)(opt)
  ;  :border-radius (map)(opt)
  ;   {:tl (keyword, px or string)(opt)
  ;    :tr (keyword, px or string)(opt)
  ;    :br (keyword, px or string)(opt)
  ;    :bl (keyword, px or string)(opt)
  ;    :all (keyword, px or string)(opt)}}
  ;  :border-position (keyword)(opt)
  ;  :border-width (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (border-attributes {...} {:border-color :default :border-width :s})
  ; =>
  ; {:data-border-color :default
  ;  :data-border-width :s
  ;  ...}
  ;
  ; @return (map)
  ; {:data-border-color (keyword)
  ;  :data-border-position (keyword)
  ;  :data-border-width (keyword)
  ;  :style (map)
  ;   {"--border-color" (string)
  ;    "--border-width" (string)}
  ;  ...}
  [attributes {:keys [border-color border-position border-width] :as props}]
  (-> (map/merge-some attributes {:data-border-position border-position})
      (border-radius-attributes props)
      (utils/apply-property-value :border-color :data-border-color border-color)
      (utils/apply-property-value :border-width :data-border-width border-width "px")))

(defn adaptive-border-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the ':all' border radius value on the given attribute map,
  ; adjusted with the given 'ratio' value.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:border-radius (map)
  ;   {:all (keyword)(opt)}
  ;  ...}
  ; @param (number) ratio
  ;
  ; @usage
  ; (adaptive-border-attributes {...} {:border-radius {:all :xs}} 0.5)
  ; =>
  ; {:data-border-radius-all :var
  ;  :style {"--border-radius" "calc(var(--border-radius-xs) * 0.5)"}
  ;  ...}
  ;
  ; @return (map)
  ; {:data-border-radius-all (keyword)
  ;  :style (map)
  ;   {"--border-radius" (string)}
  ;  ...}
  [attributes {{:keys [all]} :border-radius} ratio]
  (let [adaptive-border-radius (appearance.utils/adaptive-border-radius all ratio)]
       (if all (-> attributes (update :style assoc "--border-radius" adaptive-border-radius)
                              (assoc  :data-border-radius-all :var))
               (-> attributes))))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn line-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the line related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:line-color (keyword or string)(opt)
  ;  :line-orientation (keyword)(opt)
  ;  :line-strength (keyword, px or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (line-attributes {...} {:line-color :default :line-orientation :horizontal :line-strength :s})
  ; =>
  ; {:data-line-color       :default
  ;  :data-line-orientation :horizontal
  ;  :data-line-strength    :s
  ;  ...}
  ;
  ; @return (map)
  ; {:data-line-color (keyword)
  ;  :data-line-orientation (keyword)
  ;  :data-line-strength (keyword)
  ;  :style (map)
  ;   {"--line-color" (string)
  ;    "--line-strength" (string)}
  ;  ...}
  [attributes {:keys [line-color line-orientation line-strength] :as props}]
  (-> (map/merge-some attributes {:data-line-orientation line-orientation})
      (utils/apply-property-value :line-color    :data-line-color    line-color)
      (utils/apply-property-value :line-strength :data-line-strength line-strength "px")))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn shadow-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the shadow related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:shadow-color (keyword or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (shadow-attributes {...} {:shadow-color :default})
  ; =>
  ; {:data-shadow-color :default
  ;  ...}
  ;
  ; @return (map)
  ; {:data-shadow-color (keyword)
  ;  :style (map)
  ;   {"--shadow-color" (string)}
  ;  ...}
  [attributes {:keys [shadow-color]}]
  ; + :shadow-strength: :thin ... :extra-bold
  (-> attributes (utils/apply-property-value :shadow-color :data-shadow-color shadow-color)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn theme-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the theme related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:theme (keyword)(opt)
  ;  ...}
  ;
  ; @usage
  ; (theme-attributes {...} {:theme :my-theme})
  ; =>
  ; {:data-theme :my-theme
  ;  ...}
  ;
  ; @return (map)
  ; {:data-theme (keyword)
  ;  ...}
  [attributes {:keys [theme]}]
  (-> attributes (map/merge-some {:data-theme theme})))
