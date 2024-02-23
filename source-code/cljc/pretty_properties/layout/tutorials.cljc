
(ns pretty-properties.layout.tutorials)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Expandable properties
;
; @title expandable? property
;
; @--- Accepted types
; {:expandable? (boolean)}
;
; @--- Examples
; {:expandable? true}
;
;
;
; @title expanded? property
;
; @--- Accepted types
; {:expanded? (boolean)}
;
; @--- Examples
; {:expanded? true}

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
; @title grow property
;
; @--- Accepted types
; {:grow (integer)}
;
; @--- Examples
; {:grow 1}
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
; @title shrink property
;
; @--- Accepted types
; {:shrink (integer)}
;
; @--- Examples
; {:shrink 0}
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

; @tutorial Fullscreen properties
;
; @title lock-scroll? property
;
; @--- Accepted types
; {:lock-scroll? (boolean)}
;
; @--- Examples
; {:lock-scroll? true}
;
;
;
; @title stretch-orientation property
;
; @--- Accepted types
; {:stretch-orientation (keyword)}
;
; @--- Examples
; {:stretch-orientation :horizontal}
;
; @--- Predefined values
; :none, :both, :horizontal, :vertical

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
; @---
; Height/width profiles in ':quarter-block' size system:
;
; MICRO:  3px -  3px
; XXS:    6px -  6px
; XS:    12px - 12px
; S:     18px - 18px
; M:     24px - 24px
; L:     30px - 30px
; XL:    36px - 36px
; XXL:   42px - 42px
; 3XL:   48px - 48px
; 4XL:   54px - 54px
; 5XL:   60px - 60px
;
; @---
; Height/width profiles in ':half-block' size system:
;
; MICRO:  6px -   6px
; XXS:   12px -  12px
; XS:    24px -  24px
; S:     36px -  36px
; M:     48px -  48px
; L:     60px -  60px
; XL:    72px -  72px
; XXL:   84px -  84px
; 3XL:   96px -  96px
; 4XL:  108px - 108px
; 5XL:  120px - 120px
;
; @---
; Height/width profiles in ':full-block' size system:
;
; MICRO: 12px -  12px
; XXS:   24px -  24px
; XS:    48px -  48px
; S:     72px -  72px
; M:     96px -  96px
; L:    120px - 120px
; XL:   144px - 144px
; XXL:  168px - 168px
; 3XL:  192px - 192px
; 4XL:  216px - 216px
; 5XL:  240px - 240px
;
; @---
; Height/width profiles in ':double-block' size system:
;
; MICRO: 24px -  24px
; XXS:   48px -  48px
; XS:    96px -  96px
; S:    144px - 144px
; M:    192px - 192px
; L:    240px - 240px
; XL:   288px - 288px
; XXL:  336px - 336px
; 3XL:  384px - 384px
; 4XL:  432px - 432px
; 5XL:  480px - 480px
;
; @---
; Height/width profiles in ':triple-block' size system:
;
; MICRO: 36px -  36px
; XXS:   72px -  72px
; XS:   144px - 144px
; S:    216px - 216px
; M:    288px - 288px
; L:    360px - 360px
; XL:   432px - 432px
; XXL:  504px - 504px
; 3XL:  576px - 576px
; 4XL:  648px - 648px
; 5XL:  720px - 720px
;
; @---
; Height/width profiles in ':screen' size system:
;
; MICRO:  160px - 160px
; XXS:    320px - 240px
; XS:     480px - 320px
; S:      640px - 400px
; M:      800px - 480px
; L:      960px - 560px
; XL:    1120px - 640px
; XXL:   1280px - 720px
; 3XL:   1440px - 800px
; 4XL:   1600px - 880px
; 5XL:   1760px - 960px
;
; The '{:size-unit :screen}' setting implements an adaptive content size logic, where the height and width profiles
; are adjusted to common screen resolutions; and in case the selected profile is larger than the actual screen
; size, it replaces the applied value with '100%'.
;
; For example, if the actual viewport width is 1280px (i.e. XXL), the 3XL, 4XL and 5XL width profiles are replaced with the '{width: 100%}' setting.
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

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Body size properties
;
; @note
; The body size properties describe inner element dimensions within the main element.
;
; @title body-height property
;
; @--- Accepted types
; {:body-height (keyword, px or string)}
;
; @--- Examples
; {:body-height :xs}
; {:body-height 10}
; {:body-height "10px"}
; {:body-height "5%"}
;
; @--- Predefined values
; :auto, :content, :parent, :grow,
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title body-width property
;
; @--- Accepted types
; {:body-width (keyword, px or string)}
;
; @--- Examples
; {:body-width :xs}
; {:body-width 10}
; {:body-width "10px"}
; {:body-width "5%"}
;
; @--- Predefined values
; :auto, :content, :parent, :grow,
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title max-body-height property
;
; @--- Accepted types
; {:max-body-height (keyword, px or string)}
;
; @--- Examples
; {:max-body-height :xs}
; {:max-body-height 10}
; {:max-body-height "10px"}
; {:max-body-height "5%"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title max-body-width property
;
; @--- Accepted types
; {:max-body-width (keyword, px or string)}
;
; @--- Examples
; {:max-body-width :xs}
; {:max-body-width 10}
; {:max-body-width "10px"}
; {:max-body-width "5%"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title min-body-height property
;
; @--- Accepted types
; {:min-body-height (keyword, px or string)}
;
; @--- Examples
; {:min-body-height :xs}
; {:min-body-height 10}
; {:min-body-height "10px"}
; {:min-body-height "5%"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title min-body-width property
;
; @--- Accepted types
; {:min-body-width (keyword, px or string)}
;
; @--- Examples
; {:min-body-width :xs}
; {:min-body-width 10}
; {:min-body-width "10px"}
; {:min-body-width "5%"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Content size properties
;
; @note
; The content size properties describe dedicated content element dimensions within the inner element.
;
; @title content-height property
;
; @--- Accepted types
; {:content-height (keyword, px or string)}
;
; @--- Examples
; {:content-height :xs}
; {:content-height 10}
; {:content-height "10px"}
; {:content-height "5%"}
;
; @--- Predefined values
; :auto, :content, :parent, :grow,
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title content-width property
;
; @--- Accepted types
; {:content-width (keyword, px or string)}
;
; @--- Examples
; {:content-width :xs}
; {:content-width 10}
; {:content-width "10px"}
; {:content-width "5%"}
;
; @--- Predefined values
; :auto, :content, :parent, :grow,
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title max-content-height property
;
; @--- Accepted types
; {:max-content-height (keyword, px or string)}
;
; @--- Examples
; {:max-content-height :xs}
; {:max-content-height 10}
; {:max-content-height "10px"}
; {:max-content-height "5%"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title max-content-width property
;
; @--- Accepted types
; {:max-content-width (keyword, px or string)}
;
; @--- Examples
; {:max-content-width :xs}
; {:max-content-width 10}
; {:max-content-width "10px"}
; {:max-content-width "5%"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title min-content-height property
;
; @--- Accepted types
; {:min-content-height (keyword, px or string)}
;
; @--- Examples
; {:min-content-height :xs}
; {:min-content-height 10}
; {:min-content-height "10px"}
; {:min-content-height "5%"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title min-content-width property
;
; @--- Accepted types
; {:min-content-width (keyword, px or string)}
;
; @--- Examples
; {:min-content-width :xs}
; {:min-content-width 10}
; {:min-content-width "10px"}
; {:min-content-width "5%"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl

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
