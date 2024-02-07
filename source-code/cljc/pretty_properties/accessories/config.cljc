
(ns pretty-properties.accessories.config)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @note (#4011)
; Property groups are applied if at least one property of the group is also
; present in the provided property map or in the provided default property map.
;
; @note (#4012)
; The '{:badge-content nil}' property is part of the group to ensure that
; the group is applied even if only the ':badge-content' property is provided.
;
; @constant (map)
; {:badge-color (keyword or string)
;  :badge-content (metamorphic-content)
;  :badge-position (keyword)}
(def STANDARD-BADGE-PROPERTIES
     {:badge-color    :default
      :badge-content  nil
      :badge-position :br})

; @note (#4011)
;
; @constant (map)
; {:bullet-color (keyword or string)
;  :bullet-position (keyword)}
(def STANDARD-BULLET-PROPERTIES
     {:bullet-color    :muted
      :bullet-position :center})

; @note (#4011)
;
; @constant (map)
; {:marker-color (keyword or string)
;  :marker-position (keyword)}
(def STANDARD-MARKER-PROPERTIES
     {:marker-color    :primary
      :marker-position :tr})

; @note (#4011)
; @note (#4012)
;
; @constant (map)
; {:tooltip-content (metamorphic-content)
;  :tooltip-position (keyword)}
(def STANDARD-TOOLTIP-PROPERTIES
     {:tooltip-content  nil
      :tooltip-position :right})
