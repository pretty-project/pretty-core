
(ns pretty-properties.layout.tutorials)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Flex properties
;
; @title :gap property
;
; @code Usage
; {:gap (keyword, px or string)}
; {:gap :xs}
; {:gap 10}
; {:gap "10px"}
; {:gap "5%"}
;
; @code Predefined values
; :auto,
; :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title :horizontal-align property
;
; @code Usage
; {:horizontal-align (keyword)}
; {:horizontal-align :center}
;
; @code Predefined values
; :space-around, :space-between, :space-evenly,
; :left, :center, :right
;
;
;
; @title :orientation property
;
; @code Usage
; {:orientation (keyword)}
; {:orientation :vertical}
;
; @code Predefined values
; :horizontal, :vertical
;
;
;
; @title :overflow property
;
; @code Usage
; {:overflow (keyword)}
; {:overflow :visible}
;
; @code Predefined values
; :hidden, :scroll, :visible, :wrap
;
;
;
; @title :vertical-align property
;
; @code Usage
; {:vertical-align (keyword)}
; {:vertical-align :center}
;
; @code Predefined values
; :space-around, :space-between, :space-evenly,
; :bottom, :center, :top

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Grid properties
;
; @title :column-count property
;
; @code Usage
; {:column-count (integer)}
; {:column-count 10}
;
;
;
; @title :column-gap property
;
; @code Usage
; {:column-gap (keyword, px or string)}
; {:column-gap :xs}
; {:column-gap 10}
; {:column-gap "10px"}
; {:column-gap "5%"}
;
; @code Predefined values
; :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title :column-template property
;
; @code Usage
; {:column-template (keyword or string)}
; {:column-template :even}
; {:column-template "repeat(5, 1fr)"}
;
; @code Predefined values
; :even
;
;
;
; @title :row-count property
;
; @code Usage
; {:row-count (integer)}
; {:row-count 10}
;
;
;
; @title :row-gap property
;
; @code Usage
; {:row-gap (keyword, px or string)}
; {:row-gap :xs}
; {:row-gap 10}
; {:row-gap "10px"}
; {:row-gap "5%"}
;
; @code Predefined values
; :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title :row-template property
;
; @code Usage
; {:row-template (keyword or string)}
; {:row-template :even}
; {:row-template "repeat(5, 1fr)"}
;
; @code Predefined values
; :even

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Position properties
;
; @title :layer property
;
; @code Usage
; {:layer (keyword or integer)}
; {:layer :uppermost}
; {:layer 25}
;
; @code Predefined values
; :lowermost, :uppermost
;
;
;
; @title :position property
;
; @code Usage
; {:position (keyword)}
; {:position :tr}
;
; @code Predefined values
; :tr, :br, :bl, :tl,
; :left, :right, :bottom, :top, :center
;
;
;
; @title :position-base property
;
; @code Usage
; {:position-base (keyword)}
; {:position-base :inner}
;
; @code Predefined values
; :inner, :outer
;
;
;
; @title :position-method property
;
; @code Usage
; {:position-method (keyword)}
; {:position-method :absolute}
;
; @code Predefined values
; :absolute, :fixed, :relative, :static, :sticky

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Shape properties
;
; @title :strength property
;
; @code Usage
; {:strength (percent)}
; {:strength 100}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Size properties
;
; @title Adaptive content width
;
; Content width profiles ...
; ... adapt to the actual viewport width,
; ... larger than the actual viewport width are ignored and replaced with '100%' values.
;
; Viewport width profiles:
; XXS:  320px -  359px
; XS:   360px -  419px
; S:    420px -  479px
; M:    480px -  719px
; L:    720px - 1279px
; XL:  1280px - 1439px
; XXL: 1440px - 1679px
; 3XL: 1680px - 2159px
; 4XL: 2160px - 3839px
; 5XL: 3840px - 9999px
;
; E.g., if the actual viewport width is 1440px (i.e. XXL viewport width), 3XL, 4XL and 5XL
; content width profiles are replaced with the '{width: 100%}' setting.
;
;
;
; @title Quarter block size profiles:
;
; XXS:  6px
; XS:  12px
; S:   18px
; M:   24px
; L:   30px
; XL:  36px
; XXL: 42px
; 3XL: 48px
; 4XL: 54px
; 5XL: 60px
;
;
;
; @title Half block size profiles:
;
; XXS:  12px
; XS:   24px
; S:    36px
; M:    48px
; L:    60px
; XL:   72px
; XXL:  84px
; 3XL:  96px
; 4XL: 108px
; 5XL: 120px
;
;
;
; @title Full block size profiles:
;
; XXS:  24px
; XS:   48px
; S:    72px
; M:    96px
; L:   120px
; XL:  144px
; XXL: 168px
; 3XL: 192px
; 4XL: 216px
; 5XL: 240px
;
;
;
; @title Double block size profiles:
;
; XXS:  48px
; XS:   96px
; S:   144px
; M:   192px
; L:   240px
; XL:  288px
; XXL: 336px
; 3XL: 384px
; 4XL: 432px
; 5XL: 480px
;
;
;
; @title Triple block size profiles:
;
; XXS:  72px
; XS:  144px
; S:   216px
; M:   288px
; L:   360px
; XL:  432px
; XXL: 504px
; 3XL: 576px
; 4XL: 648px
; 5XL: 720px
;
;
;
; @title :max-height property
;
; @code Usage
; {:max-height (keyword, px or string)}
; {:max-height :xs}
; {:max-height 10}
; {:max-height "10px"}
; {:max-height "5%"}
;
; @code Predefined values
; :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title :max-width property
;
; @code Usage
; {:max-width (keyword, px or string)}
; {:max-width :xs}
; {:max-width 10}
; {:max-width "10px"}
; {:max-width "5%"}
;
; @code Predefined values
; :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title :min-height property
;
; @code Usage
; {:min-height (keyword, px or string)}
; {:min-height :xs}
; {:min-height 10}
; {:min-height "10px"}
; {:min-height "5%"}
;
; @code Predefined values
; :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title :min-width property
;
; @code Usage
; {:min-width (keyword, px or string)}
; {:min-width :xs}
; {:min-width 10}
; {:min-width "10px"}
; {:min-width "5%"}
;
; @code Predefined values
; :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title :height property
;
; @code Usage
; {:height (keyword, px or string)}
; {:height :xs}
; {:height 10}
; {:height "10px"}
; {:height "5%"}
;
; @code Predefined values
; :auto, :content, :parent,
; :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title :width property
;
; @code Usage
; {:width (keyword, px or string)}
; {:width :xs}
; {:width 10}
; {:width "10px"}
; {:width "5%"}
;
; @code Predefined values
; :auto, :content, :parent,
; :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Space properties
;
; @title :indent property
;
; @code Usage
; {:indent {:all, :bottom, :left, :right, :top, :horizontal, :vertical (keyword, px or string)}}
; {:indent {:all :xs}}
; {:indent {:all :xs :tr :xxl}}
; {:indent {:all 10}}
; {:indent {:all "10px"}}
; {:indent {:all "5%"}}
;
; @code Predefined values
; :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title :outdent property
;
; @code Usage
; {:outdent {:all, :bottom, :left, :right, :top, :horizontal, :vertical (keyword, px or string)}}
; {:outdent {:all :xs}}
; {:outdent {:all :xs :tr :xxl}}
; {:outdent {:all 10}}
; {:outdent {:all "10px"}}
; {:outdent {:all "5%"}}
;
; @code Predefined values
; :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
