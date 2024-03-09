
(ns pretty-subitems.api
    (:require [pretty-subitems.subitem-groups.utils :as subitem-groups.utils]
              [pretty-subitems.subitems.utils       :as subitems.utils]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Subitems
;
; @---
; Subitems are additional items within an element.
; E.g., A menu bar element within a dropdown menu element.
;
; @usage
; [my-element :my-element
;             {:label      "My element"
;              :my-subitem {:label "My subitem"}}]

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Subitem groups
;
; @---
; Subitem groups are group of subitems within an element.
; E.g., A group of menu items within a menu bar element.
;
; @usage
; [my-element :my-element
;             {:label              "My element"
;              :my-subitem-default {:fill-color :default}
;              :my-subitems        [{:label "My subitem #1"} {:label "My subitem #2"}]}]
;
; @---
; Default property maps of subitem groups are applied on each group item.
;
; Keys of default property maps of subitem groups are derived from the keys of subitem groups.
; E.g., ':menu-items' => ':menu-item-default'

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (pretty-subitems.subitem-groups.utils/*)
(def subitem-default-key             subitem-groups.utils/subitem-default-key)
(def apply-group-item-prototype      subitem-groups.utils/apply-group-item-prototype)
(def subitem-group<-disabled-state   subitem-groups.utils/subitem-group<-disabled-state)
(def subitem-groups<-disabled-state  subitem-groups.utils/subitem-groups<-disabled-state)
(def subitem-group<-subitem-default  subitem-groups.utils/subitem-group<-subitem-default)
(def subitem-groups<-subitem-default subitem-groups.utils/subitem-groups<-subitem-default)

; @redirect (pretty-subitems.subitems.utils/*)
(def subitem-id               subitems.utils/subitem-id)
(def ensure-subitem           subitems.utils/ensure-subitem)
(def ensure-subitems          subitems.utils/ensure-subitems)
(def apply-subitem-prototype  subitems.utils/apply-subitem-prototype)
(def subitem<-disabled-state  subitems.utils/subitem<-disabled-state)
(def subitems<-disabled-state subitems.utils/subitems<-disabled-state)
