
(ns pretty-themes.views)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn text-color
  ; @description
  ; A sample text color component displaying a specific text color (corresponding to the set theme).
  ;
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
  ; @description
  ; A sample text colors component displaying all text colors (corresponding to the set theme).
  ;
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
        [text-color :inverse]
        [text-color :primary]
        [text-color :secondary]
        [text-color :tertiary]
        [text-color :success]
        [text-color :warning]])

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn color-box
  ; @description
  ; A sample color box component displaying a specific fill color and border color (corresponding to the set theme).
  ;
  ; @param (keyword) text-color
  ;
  ; @usage
  ; (color-box :primary)
  ;
  ; @return (hiccup)
  [color]
  [:div {:data-fill-color color :data-border-color color
         :style {:border-radius :12px :border-style :solid :border-width :2px :height :144px :width :144px :display :flex :align-items :center :justify-content :center}}
        [text-color color]])

(defn color-boxes
  ; @description
  ; A sample color boxes component displaying all fill colors and border colors (corresponding to the set theme).
  ;
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
        [color-box :inverse]
        [color-box :primary]
        [color-box :secondary]
        [color-box :tertiary]
        [color-box :success]
        [color-box :warning]])
