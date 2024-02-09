
(ns pretty-properties.live.config)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @note (pretty-properties.accessories.config#4011)
; @note (pretty-properties.accessories.config#4012)
;
; @constant (map)
; {:animation-direction (keyword)
;  :animation-duration (ms)
;  :animation-mode (keyword)
;  :animation-name (keyword or string)}
(def STANDARD-ANIMATION-PROPERTIES
     {:animation-direction nil
      :animation-duration  350
      :animation-mode      :single
      :animation-name      nil})

; @note (pretty-properties.accessories.config#4011)
; @note (pretty-properties.accessories.config#4012)
;
; @constant (map)
; {:progress (percentage)
;  :progress-color (keyword or string)
;  :progress-direction (keyword)
;  :progress-duration (ms)}
(def STANDARD-PROGRESS-PROPERTIES
     {:progress           nil
      :progress-color     :default
      :progress-direction :ltr
      :progress-duration  350})
