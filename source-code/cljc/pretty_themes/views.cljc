
(ns pretty-themes.views)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn text-color
  ; @param (keyword) text-color
  ;
  ; @usage
  ; (text-color :primary)
  ;
  ; @return (hiccup)
  [text-color]
  [:div {:data-text-color text-color :style {:padding :12px}}
        (name text-color)])

(defn text-colors
  ; @param (keyword) theme
  ;
  ; @usage
  ; (text-colors :soft-light)
  ;
  ; @return (hiccup)
  [theme]
  [:div {:data-theme theme :data-fill-color :default :data-font-size :m :data-font-weight :medium}
        [text-color :default]
        [text-color :muted]
        [text-color :highlight]
        [text-color :invert]
        [text-color :primary]
        [text-color :secondary]
        [text-color :tertiary]
        [text-color :success]
        [text-color :warning]])

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn color-box
  ; @param (keyword) text-color
  ;
  ; @usage
  ; (color-box :primary)
  ;
  ; @return (hiccup)
  [color]
  [:div {:data-fill-color color :data-hover-color color :data-border-color color
         :style {:border-radius :12px :border-style :solid :border-width :2px :height :144px :width :144px :display :flex :align-items :center :justify-content :center}}
        [text-color color]])

(defn color-boxes
  ; @param (keyword) theme
  ;
  ; @usage
  ; (color-boxes :soft-light)
  ;
  ; @return (hiccup)
  [theme]
  [:div {:data-theme theme :data-fill-color :default :data-font-size :m :data-font-weight :medium
         :style {:display :flex :flex-direction :column :gap :24px :padding :24px}}
        [color-box :default]
        [color-box :muted]
        [color-box :highlight]
        [color-box :invert]
        [color-box :primary]
        [color-box :secondary]
        [color-box :tertiary]
        [color-box :success]
        [color-box :warning]])
