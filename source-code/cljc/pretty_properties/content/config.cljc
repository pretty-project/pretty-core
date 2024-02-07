
(ns pretty-properties.content.config)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @note (pretty-properties.accessories.config#4011)
; @note (pretty-properties.accessories.config#4012)
;
; @constant (map)
; {:icon (keyword)
;  :icon-color (keyword or string)
;  :icon-family (keyword)
;  :icon-size (keyword, px or string)}
(def STANDARD-ICON-PROPERTIES
     {:icon        nil
      :icon-color  :default
      :icon-family :material-symbols-outlined
      :icon-size   :s})

; @note (pretty-properties.accessories.config#4011)
;
; @constant (map)
; {:font-size (keyword, px or string)
;  :font-weight (keyword)
;  :letter-spacing (keyword, px or string)
;  :letter-spacing (line-height)}
(def STANDARD-FONT-PROPERTIES
     {:font-size      :s
      :font-weight    :normal
      :letter-spacing :auto
      :line-height    :text-block})

; @note (pretty-properties.accessories.config#4011)
; @note (pretty-properties.accessories.config#4012)
;
; @constant (map)
; {:text-align (keyword)
;  :text-caret (keyword)
;  :text-color (keyword or string)
;  :text-direction (keyword)
;  :text-overflow (keyword)
;  :text-selectable? (boolean)
;  :text-transform (keyword)}
(def STANDARD-TEXT-PROPERTIES
     {:text-align       nil
      :text-caret       nil
      :text-color       :default
      :text-direction   nil
      :text-overflow    :visible
      :text-selectable? nil
      :text-transform   nil})
