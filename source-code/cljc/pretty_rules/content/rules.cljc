
(ns pretty-rules.content.rules
    (:require [fruits.map.api        :as map]
              [fruits.string.api     :as string]
              [multitype-content.api :as multitype-content]
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
  (if disabled? (-> props (map/use-default-values {:cursor :default}))
                (-> props)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn compose-content
  ; @description
  ; Composes the ':content' or the ':content-placeholder' metamorphic content value (if any);
  ; and associates the composed result as ':content' property to the given property map.
  ;
  ; @param (map) props
  ; {:content (multitype-content)(opt)
  ;  :content-placeholder (multitype-content)(opt)
  ;  ...}
  ;
  ; @usage
  ; (compose-content {:content nil :content-placeholder "My placeholder" ...})
  ; =>
  ; {:content "My placeholder"
  ;  ...}
  ;
  ; @return (map)
  ; {:content (multitype-content)
  ;  ...}
  [{:keys [content content-placeholder] :as props}]
  (-> props (map/assoc-some :content (multitype-content/compose content content-placeholder))))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn auto-count-content-lines
  ; @description
  ; Counts newlines in the value of ':content' property (if string) and associates the result as ':line-count' property.
  ;
  ; @param (map) props
  ; {:content (multitype-content)(opt)
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
  (if (-> content string?)
      (-> props (map/use-default-values {:line-count (string/line-count content)}))
      (-> props)))

(defn auto-limit-multiline-count
  ; @description
  ; Limits the value of ':line-count' property (if any) based on the ':max-lines' and ':min-lines' properties.
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
  (if-not line-count (->     props)
                     (cond-> props (-> min-lines) (update :line-count max min-lines)
                                   (-> max-lines) (update :line-count min max-lines))))


(defn auto-set-multiline-height
  ; @description
  ; Sets the value of height property based on the ':font-size', ':line-count' and ':line-height' properties.
  ;
  ; @param (map)(opt)
  ; {:font-size (keyword, px or string)(opt)
  ;  :line-count (integer)(opt)
  ;  :line-height (keyword, px or string)(opt)
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
  (if-not line-count (-> props)
                     (if-let [multiline-height (pretty-attributes/adaptive-text-height font-size line-height line-count)]
                             (-> props (assoc :content-height multiline-height))
                             (-> props))))
