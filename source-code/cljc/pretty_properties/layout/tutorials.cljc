
(ns pretty-properties.layout.tutorials)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Flex properties
;
; @title gap property
;
; @--- Accepted types
; {:gap (keyword, px or string)}
;
; @--- Examples
; {:gap :xs}
; {:gap 10}
; {:gap "10px"}
; {:gap "5%"}
;
; @--- Predefined values
; :auto,
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title horizontal-align property
;
; @--- Accepted types
; {:horizontal-align (keyword)}
;
; @--- Examples
; {:horizontal-align :center}
;
; @--- Predefined values
; :space-around, :space-between, :space-evenly,
; :left, :center, :right
;
;
;
; @title orientation property
;
; @--- Accepted types
; {:orientation (keyword)}
;
; @--- Examples
; {:orientation :vertical}
;
; @--- Predefined values
; :horizontal, :vertical
;
;
;
; @title overflow property
;
; @--- Accepted types
; {:overflow (keyword)}
;
; @--- Examples
; {:overflow :visible}
;
; @--- Predefined values
; :hidden, :scroll, :visible, :wrap
;
;
;
; @title vertical-align property
;
; @--- Accepted types
; {:vertical-align (keyword)}
;
; @--- Examples
; {:vertical-align :center}
;
; @--- Predefined values
; :space-around, :space-between, :space-evenly,
; :bottom, :center, :top

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Grid properties
;
; @title column-count property
;
; @--- Accepted types
; {:column-count (integer)}
;
; @--- Examples
; {:column-count 10}
;
;
;
; @title column-gap property
;
; @--- Accepted types
; {:column-gap (keyword, px or string)}
;
; @--- Examples
; {:column-gap :xs}
; {:column-gap 10}
; {:column-gap "10px"}
; {:column-gap "5%"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title column-template property
;
; @--- Accepted types
; {:column-template (keyword or string)}
;
; @--- Examples
; {:column-template :even}
; {:column-template "repeat(5, 1fr)"}
;
; @--- Predefined values
; :even
;
;
;
; @title row-count property
;
; @--- Accepted types
; {:row-count (integer)}
;
; @--- Examples
; {:row-count 10}
;
;
;
; @title row-gap property
;
; @--- Accepted types
; {:row-gap (keyword, px or string)}
;
; @--- Examples
; {:row-gap :xs}
; {:row-gap 10}
; {:row-gap "10px"}
; {:row-gap "5%"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title row-template property
;
; @--- Accepted types
; {:row-template (keyword or string)}
;
; @--- Examples
; {:row-template :even}
; {:row-template "repeat(5, 1fr)"}
;
; @--- Predefined values
; :even

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Position properties
;
; @title layer property
;
; @--- Accepted types
; {:layer (keyword or integer)}
;
; @--- Examples
; {:layer :uppermost}
; {:layer 25}
;
; @--- Predefined values
; :lowermost, :uppermost
;
;
;
; @title position property
;
; @--- Accepted types
; {:position (keyword)}
;
; @--- Examples
; {:position :tr}
;
; @--- Predefined values
; :tr, :br, :bl, :tl,
; :left, :right, :bottom, :top, :center
;
;
;
; @title position-base property
;
; @--- Accepted types
; {:position-base (keyword)}
;
; @--- Examples
; {:position-base :inner}
;
; @--- Predefined values
; :inner, :outer
;
;
;
; @title position-method property
;
; @--- Accepted types
; {:position-method (keyword)}
;
; @--- Examples
; {:position-method :absolute}
;
; @--- Predefined values
; :absolute, :fixed, :relative, :static, :sticky

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Shape properties
;
; @title strength property
;
; @--- Accepted types
; {:strength (percentage)}
;
; @--- Examples
; {:strength 100}

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Size properties
;
; @title size-unit property
;
; The ':size-unit' property controls the predefined size profiles (e.g., :xxs, :xs, ...) applied within which size system.
;
; @code
; Height/width profiles in ':quarter-block' size system:
;
; MICRO:  3px
; XXS:    6px
; XS:    12px
; S:     18px
; M:     24px
; L:     30px
; XL:    36px
; XXL:   42px
; 3XL:   48px
; 4XL:   54px
; 5XL:   60px
; @---
;
; @code
; Height/width profiles in ':half-block' size system:
;
; MICRO:  6px
; XXS:   12px
; XS:    24px
; S:     36px
; M:     48px
; L:     60px
; XL:    72px
; XXL:   84px
; 3XL:   96px
; 4XL:  108px
; 5XL:  120px
; @---
;
; @code
; Height/width profiles in ':full-block' size system:
;
; MICRO: 12px
; XXS:   24px
; XS:    48px
; S:     72px
; M:     96px
; L:    120px
; XL:   144px
; XXL:  168px
; 3XL:  192px
; 4XL:  216px
; 5XL:  240px
; @---
;
; @code
; Height/width profiles in ':double-block' size system:
;
; MICRO: 24px
; XXS:   48px
; XS:    96px
; S:    144px
; M:    192px
; L:    240px
; XL:   288px
; XXL:  336px
; 3XL:  384px
; 4XL:  432px
; 5XL:  480px
; @---
;
; @code
; Height/width profiles in ':triple-block' size system:
;
; MICRO: 36px
; XXS:   72px
; XS:   144px
; S:    216px
; M:    288px
; L:    360px
; XL:   432px
; XXL:  504px
; 3XL:  576px
; 4XL:  648px
; 5XL:  720px
; @---
;
; @code
; Height profiles in ':screen' size system:
;
; MICRO:  5vh
; XXS:   10vh
; XS:    10vh
; S:     10vh
; M:     10vh
; L:     10vh
; XL:    10vh
; XXL:   10vh
; 3XL:   10vh
; 4XL:   10vh
; 5XL:   10vh
; @---
;
; @code
; Width profiles in ':screen' size system:
;
; MICRO:  160px
; XXS:    320px
; XS:     360px
; S:      420px
; M:      480px
; L:      720px
; XL:    1280px
; XXL:   1440px
; 3XL:   1680px
; 4XL:   2160px
; 5XL:   3840px
; @---
;
; The '{:size-unit :screen}' setting implements an adaptive content width logic, where the width profiles
; are adjusted to common screen resolutions; and in case the width profile is larger than the actual screen
; size, it replaces the applied profile with the '{width: 100%}' setting.
;
; For example, if the actual viewport width is 1440px (i.e. XXL), the 3XL, 4XL and 5XL width profiles are replaced with the '{width: 100%}' setting.
;
;
;
; @title max-height property
;
; @--- Accepted types
; {:max-height (keyword, px or string)}
;
; @--- Examples
; {:max-height :xs}
; {:max-height 10}
; {:max-height "10px"}
; {:max-height "5%"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title max-width property
;
; @--- Accepted types
; {:max-width (keyword, px or string)}
;
; @--- Examples
; {:max-width :xs}
; {:max-width 10}
; {:max-width "10px"}
; {:max-width "5%"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title min-height property
;
; @--- Accepted types
; {:min-height (keyword, px or string)}
;
; @--- Examples
; {:min-height :xs}
; {:min-height 10}
; {:min-height "10px"}
; {:min-height "5%"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title min-width property
;
; @--- Accepted types
; {:min-width (keyword, px or string)}
;
; @--- Examples
; {:min-width :xs}
; {:min-width 10}
; {:min-width "10px"}
; {:min-width "5%"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title height property
;
; @--- Accepted types
; {:height (keyword, px or string)}
;
; @--- Examples
; {:height :xs}
; {:height 10}
; {:height "10px"}
; {:height "5%"}
;
; @--- Predefined values
; :auto, :content, :parent, :grow,
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title width property
;
; @--- Accepted types
; {:width (keyword, px or string)}
;
; @--- Examples
; {:width :xs}
; {:width 10}
; {:width "10px"}
; {:width "5%"}
;
; @--- Predefined values
; :auto, :content, :parent, :grow,
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Canvas size properties
;
; @note
; The canvas size properties control inner element dimensions within the main element.
;
; @title canvas-height property
;
; @--- Accepted types
; {:canvas-height (keyword, px or string)}
;
; @--- Examples
; {:canvas-height :parent}
; {:canvas-height 10}
; {:canvas-height "10px"}
; {:canvas-height "5%"}
;
; @--- Predefined values
; :auto, :content, :parent, :grow
;
;
;
; @title canvas-width property
;
; @--- Accepted types
; {:canvas-width (keyword, px or string)}
;
; @--- Examples
; {:canvas-width :parent}
; {:canvas-width 10}
; {:canvas-width "10px"}
; {:canvas-width "5%"}
;
; @--- Predefined values
; :auto, :content, :parent, :grow

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Wrapper size properties
;
; @note
; The wrapper size properties control outer element dimensions outside the main element.
;
; @title wrapper-height property
;
; @--- Accepted types
; {:wrapper-height (keyword, px or string)}
;
; @--- Examples
; {:wrapper-height :content}
; {:wrapper-height 10}
; {:wrapper-height "10px"}
; {:wrapper-height "5%"}
;
; @--- Predefined values
; :auto, :content, :parent, :grow
;
;
;
; @title wrapper-width property
;
; @--- Accepted types
; {:wrapper-width (keyword, px or string)}
;
; @--- Examples
; {:wrapper-width :content}
; {:wrapper-width 10}
; {:wrapper-width "10px"}
; {:wrapper-width "5%"}
;
; @--- Predefined values
; :auto, :content, :parent, :grow

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Space properties
;
; @title indent property
;
; @--- Accepted types
; {:indent {:all, :bottom, :left, :right, :top, :horizontal, :vertical (keyword, px or string)}}
;
; @--- Examples
; {:indent {:all :xs}}
; {:indent {:all :xs :tr :xxl}}
; {:indent {:all 10}}
; {:indent {:all "10px"}}
; {:indent {:all "5%"}}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title outdent property
;
; @--- Accepted types
; {:outdent {:all, :bottom, :left, :right, :top, :horizontal, :vertical (keyword, px or string)}}
;
; @--- Examples
; {:outdent {:all :xs}}
; {:outdent {:all :xs :tr :xxl}}
; {:outdent {:all 10}}
; {:outdent {:all "10px"}}
; {:outdent {:all "5%"}}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
