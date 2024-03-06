
(ns pretty-attributes.utils)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn apply-property-value
  ; @ignore
  ;
  ; @description
  ; - Applies the given multi-type CSS property value on the given attribute map.
  ; - If the given value is provided as ...
  ;   ... a string, associates it with the given CSS variable name into the style map within the given attribute map.
  ;   ... an integer, associates it with the given CSS variable name into the style map within the given attribute map.
  ;   ... a keyword, associates it with the given data attribute name into the given attribute map.
  ; - Integer type values are suffixed with the given 'default-unit' value (if any).
  ;
  ; @param (map) attributes
  ; {:style (map)(opt)}
  ; @param (keyword) css-var-name
  ; @param (keyword) data-attribute-name
  ; @param (keyword or string) property-value
  ; @param (string)(opt) default-unit
  ; Appended to the given value in case it is provided as an integer.
  ;
  ; @usage
  ; (apply-property-value {...} :text-color :data-text-color :muted)
  ; =>
  ; {:data-text-color :muted
  ;  ...}
  ;
  ; @usage
  ; (apply-property-value {...} :text-color :data-text-color "#fff")
  ; =>
  ; {:data-text-color :var :style {"--text-color" "#fff"}
  ;  ...}
  ;
  ; @usage
  ; (apply-property-value {:style {:padding "12px"} ...} :text-color :data-text-color "#fff")
  ; =>
  ; {:data-text-color :var :style {"--text-color" "#fff" :padding "12px"}
  ;  ...}
  ;
  ; @usage
  ; (apply-property-value {...} :element-width :data-element-width 420 "px")
  ; =>
  ; {:data-element-width :var :style {"--element-width" "420px"}
  ;  ...}
  ;
  ; @return (map)
  ; {:style (map)
  ;  ...}
  [attributes css-var-name data-attribute-name property-value & [default-unit]]
  ; By using a CSS variable to address the given value, not just the element but its pseudo-elements can use it.
  (cond (integer? property-value) (-> attributes (apply-property-value css-var-name data-attribute-name (str property-value default-unit)))
        (keyword? property-value) (-> attributes (assoc-in [data-attribute-name] property-value))
        (string?  property-value) (-> attributes (assoc-in [:style (str "--" (name css-var-name))] property-value)
                                                 (assoc-in [data-attribute-name] :var))
        :return attributes))

(defn apply-event-function
  ; @ignore
  ;
  ; @description
  ; - Associates the given 'event-f' function to a specific DOM event (e.g., 'on-click') within the given attribute map.
  ; - In case the attribute map already contained a function associated to the same DOM event, it ensures that the
  ;   already associated function will be fired also.
  ;
  ; @param (map) attributes
  ; @param (keyword) event-key
  ; @param (map) event-f
  ;
  ; @usage
  ; (apply-event-function {:on-click #(println "Function #1") ...}
  ;                       :on-click #(println "Function #2"))
  ; =>
  ; {:on-click (fn [_] (println "Function #1")
  ;                    (println "Function #2"))
  ;  ...}
  ;
  ; @return (map)
  [attributes event-key event-f]
  (letfn [(f0 [e] (event-f e)
                  (if-let [default-f (event-key attributes)]
                          (default-f e)))]
         (if event-f (-> attributes (assoc event-key f0))
                     (-> attributes))))
