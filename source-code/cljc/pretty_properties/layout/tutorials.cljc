
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

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Overflow properties
;
; @title horizontal-overflow property
;
; @--- Accepted types
; {:horizontal-overflow (keyword)}
;
; @--- Examples
; {:horizontal-overflow :scroll}
;
; @--- Predefined values
; :auto, :hidden, :scroll
;
;
;
; @title vertical-overflow property
;
; @--- Accepted types
; {:vertical-overflow (keyword)}
;
; @--- Examples
; {:vertical-overflow :scroll}
;
; @--- Predefined values
; :auto, :hidden, :scroll

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Inner position properties
;
; Inner position properties are applied on the [inner element](#xxx).
;
; @title inner-position property
;
; @--- Accepted types
; {:inner-position (keyword)}
;
; @--- Examples
; {:inner-position :tr}
;
; @--- Predefined values
; :tr, :br, :bl, :tl,
; :left, :right, :bottom, :top, :center
;
;
;
; @title inner-position-method property
;
; @--- Accepted types
; {:inner-position-method (keyword)}
;
; @--- Examples
; {:inner-position-method :flex}
;
; @--- Predefined values
; :flex

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Outer position properties
;
; Outer position properties are applied on the [outer element](#xxx).
;
; @title outer-layer property
;
; @--- Accepted types
; {:outer-layer (keyword or integer)}
;
; @--- Examples
; {:outer-layer :uppermost}
; {:outer-layer 25}
;
; @--- Predefined values
; :lowermost, :uppermost
;
;
;
; @title outer-position property
;
; @--- Accepted types
; {:outer-position (keyword)}
;
; @--- Examples
; {:outer-position :tr}
;
; @--- Predefined values
; :tr, :br, :bl, :tl,
; :left, :right, :bottom, :top, :center
;
;
;
; @title outer-position-base property
;
; @--- Accepted types
; {:outer-position-base (keyword)}
;
; @--- Examples
; {:outer-position-base :internal}
;
; @--- Predefined values
; :internal, :external
;
;
;
; @title outer-position-method property
;
; @--- Accepted types
; {:outer-position-method (keyword)}
;
; @--- Examples
; {:outer-position-method :absolute}
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

; @tutorial Content size properties
;
; @note
; Content size properties are applied on the [content element](#xxx).
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
;
;
;
; @title content-size-unit property
;
; Check out the [size unit systems](#size-unit-systems) section.
;
; @--- Accepted types
; {:content-size-unit (keyword)}
;
; @--- Examples
; {:content-size-unit :full-block}
;
; @--- Predefined values
; :quarter-block, :half-block, :full-block, :double-block, :triple-block, :screen

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Inner size properties
;
; Inner size properties are applied on the [inner element](#xxx).
;
; @title inner-height property
;
; @--- Accepted types
; {:inner-height (keyword, px or string)}
;
; @--- Examples
; {:inner-height :xs}
; {:inner-height 10}
; {:inner-height "10px"}
; {:inner-height "5%"}
;
; @--- Predefined values
; :auto, :content, :parent, :grow,
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title inner-width property
;
; @--- Accepted types
; {:inner-width (keyword, px or string)}
;
; @--- Examples
; {:inner-width :xs}
; {:inner-width 10}
; {:inner-width "10px"}
; {:inner-width "5%"}
;
; @--- Predefined values
; :auto, :content, :parent, :grow,
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title max-inner-height property
;
; @--- Accepted types
; {:max-inner-height (keyword, px or string)}
;
; @--- Examples
; {:max-inner-height :xs}
; {:max-inner-height 10}
; {:max-inner-height "10px"}
; {:max-inner-height "5%"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title max-inner-width property
;
; @--- Accepted types
; {:max-inner-width (keyword, px or string)}
;
; @--- Examples
; {:max-inner-width :xs}
; {:max-inner-width 10}
; {:max-inner-width "10px"}
; {:max-inner-width "5%"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title min-inner-height property
;
; @--- Accepted types
; {:min-inner-height (keyword, px or string)}
;
; @--- Examples
; {:min-inner-height :xs}
; {:min-inner-height 10}
; {:min-inner-height "10px"}
; {:min-inner-height "5%"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title min-inner-width property
;
; @--- Accepted types
; {:min-inner-width (keyword, px or string)}
;
; @--- Examples
; {:min-inner-width :xs}
; {:min-inner-width 10}
; {:min-inner-width "10px"}
; {:min-inner-width "5%"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title inner-size-unit property
;
; Check out the [size unit systems](#size-unit-systems) section.
;
; @--- Accepted types
; {:inner-size-unit (keyword)}
;
; @--- Examples
; {:inner-size-unit :full-block}
;
; @--- Predefined values
; :quarter-block, :half-block, :full-block, :double-block, :triple-block, :screen

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Outer size properties
;
; Outer size properties are applied on the [outer element](#xxx).
;
; @title outer-height property
;
; @--- Accepted types
; {:outer-height (keyword, px or string)}
;
; @--- Examples
; {:outer-height :xs}
; {:outer-height 10}
; {:outer-height "10px"}
; {:outer-height "5%"}
;
; @--- Predefined values
; :auto, :content, :parent, :grow,
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title outer-width property
;
; @--- Accepted types
; {:outer-width (keyword, px or string)}
;
; @--- Examples
; {:outer-width :xs}
; {:outer-width 10}
; {:outer-width "10px"}
; {:outer-width "5%"}
;
; @--- Predefined values
; :auto, :content, :parent, :grow,
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title max-outer-height property
;
; @--- Accepted types
; {:max-outer-height (keyword, px or string)}
;
; @--- Examples
; {:max-outer-height :xs}
; {:max-outer-height 10}
; {:max-outer-height "10px"}
; {:max-outer-height "5%"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title max-outer-width property
;
; @--- Accepted types
; {:max-outer-width (keyword, px or string)}
;
; @--- Examples
; {:max-outer-width :xs}
; {:max-outer-width 10}
; {:max-outer-width "10px"}
; {:max-outer-width "5%"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title min-outer-height property
;
; @--- Accepted types
; {:min-outer-height (keyword, px or string)}
;
; @--- Examples
; {:min-outer-height :xs}
; {:min-outer-height 10}
; {:min-outer-height "10px"}
; {:min-outer-height "5%"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title min-outer-width property
;
; @--- Accepted types
; {:min-outer-width (keyword, px or string)}
;
; @--- Examples
; {:min-outer-width :xs}
; {:min-outer-width 10}
; {:min-outer-width "10px"}
; {:min-outer-width "5%"}
;
; @--- Predefined values
; :micro, :xxs, :xs, :s, :m, :l, :xl, :xxl, :3xl, :4xl, :5xl
;
;
;
; @title outer-size-unit property
;
; Check out the [size unit systems](#size-unit-systems) section.
;
; @--- Accepted types
; {:outer-size-unit (keyword)}
;
; @--- Examples
; {:outer-size-unit :full-block}
;
; @--- Predefined values
; :quarter-block, :half-block, :full-block, :double-block, :triple-block, :screen

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Size unit systems
;
; @---
; The ':inner-size-unit' and ':outer-size-unit' properties determine that the predefined size profiles (e.g., :xxs, :xs, ...) applied within which size system.
;
; @---
; The ':quarter-block', ':half-block', ':full-block', ':double-block' and ':triple-block' size systems are static px based units for different size categories.
;
; @---
; The ':screen' size system implements an adaptive content size logic, where the height and width profiles are adjusted
; to common screen resolutions; and in case the selected profile is larger than the actual screen size, it replaces the applied value with '100%'.
;
; For example, if the actual viewport width is 1280px (i.e. XXL), the 3XL, 4XL and 5XL width profiles are replaced with the '{width: 100%}' setting.
;
; @---
; The selected size unit system is inherited from ascendent elements.
; E.g., if the [outer element](#xxx) has a selected size unit, the [inner element](#xxx) inherits its value as default.
;
; @---
; inner-height / inner-width profiles in ':quarter-block' size system:
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
; inner-height / inner-width profiles in ':half-block' size system:
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
; inner-height / inner-width profiles in ':full-block' size system:
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
; inner-height / inner-width profiles in ':double-block' size system:
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
; inner-height / inner-width profiles in ':triple-block' size system:
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
; inner-height / inner-width profiles in ':screen' size system:
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
