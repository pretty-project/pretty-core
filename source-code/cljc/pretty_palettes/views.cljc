
(ns pretty-palettes.views)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn full-palette
  ; @param (keyword) palette
  ;
  ; @usage
  ; (full-palette :soft-grey)
  ;
  ; @return (hiccup)
  [palette]
  [:div {:style {:display :flex :flex-direction :column}}
        [:div {:style {:background-color (str "var(--"(name palette)"-xx-light)") :height :48px :width :48px}}]
        [:div {:style {:background-color (str "var(--"(name palette)"-x-light)")  :height :48px :width :48px}}]
        [:div {:style {:background-color (str "var(--"(name palette)"-light)")    :height :48px :width :48px}}]
        [:div {:style {:background-color (str "var(--"(name palette)")")          :height :48px :width :48px}}]
        [:div {:style {:background-color (str "var(--"(name palette)"-dark)")     :height :48px :width :48px}}]
        [:div {:style {:background-color (str "var(--"(name palette)"-x-dark)")   :height :48px :width :48px}}]
        [:div {:style {:background-color (str "var(--"(name palette)"-xx-dark)")  :height :48px :width :48px}}]])

(defn palettes
  ; @usage
  ; (palettes)
  ;
  ; @return (hiccup)
  []
  [:div {:style {:display :flex :flex-direction :row}}
        [full-palette :hard-black]
        [full-palette :soft-black]
        [full-palette :hard-grey]
        [full-palette :soft-grey]
        [full-palette :hard-white]
        [full-palette :soft-white]
        [full-palette :hard-blue]
        [full-palette :soft-blue]
        [full-palette :hard-purple]
        [full-palette :soft-purple]
        [full-palette :hard-red]
        [full-palette :soft-red]
        [full-palette :hard-green]
        [full-palette :soft-green]
        [full-palette :hard-khaki]
        [full-palette :soft-khaki]])
