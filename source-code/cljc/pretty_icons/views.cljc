
(ns pretty-icons.views)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn material-icon
  ; @param (keyword) icon-name
  ; @param (keyword)(opt) style
  ; :outlined, :filled
  ; Default: :outlined
  ;
  ; @usage
  ; (material-icon :nature_people :outlined)
  ; =>
  ; [:i {:data-icon-family :material-icons-outlined} :nature_people]
  ;
  ; @usage
  ; (material-icon :nature_people :filled)
  ; =>
  ; [:i {:data-icon-family :material-icons-filled} :nature_people]
  ;
  ; @return (hiccup)
  [icon-name style]
  (case style :filled [:i {:data-icon-family :material-icons-filled}   icon-name]
                      [:i {:data-icon-family :material-icons-outlined} icon-name]))

(defn material-symbol
  ; @param (keyword) symbol-name
  ; @param (keyword)(opt) style
  ; :outlined, :filled
  ; Default: :outlined
  ;
  ; @usage
  ; (material-symbol :nature_people :outlined)
  ; =>
  ; [:i {:data-icon-family :material-symbols-outlined} :nature_people]
  ;
  ; @usage
  ; (material-symbol :nature_people :filled)
  ; =>
  ; [:i {:data-icon-family :material-symbols-filled} :nature_people]
  ;
  ; @return (hiccup)
  [symbol-name style]
  (case style :filled [:i {:data-icon-family :material-symbols-filled}   symbol-name]
                      [:i {:data-icon-family :material-symbols-outlined} symbol-name]))
