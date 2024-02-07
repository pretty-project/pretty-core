
(ns pretty-attributes.appearance.utils)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn adaptive-border-radius
  ; @note
  ; Using an adaptive border radius makes the border of an element track the curve of the border of an inner/outer element.
  ;
  ; @description
  ; Returns a border radius CSS value that adapts to the given 'border-radius' value.
  ;
  ; @param (keyword, px or string) border-radius
  ; @param (number)(opt) ratio
  ; Default: 1
  ;
  ; @usage
  ; (adaptive-border-radius :s 0.3)
  ; =>
  ; "calc(var(--border-radius-s) * 0.3)"
  ;
  ; @usage
  ; (adaptive-border-radius "5%" 0.3)
  ; =>
  ; "calc(5% * 0.3)"
  ;
  ; @usage
  ; (adaptive-border-radius 10 0.3)
  ; =>
  ; "calc(10px * 0.3)"
  ;
  ; @usage
  ; (adaptive-border-radius nil 0.3)
  ; =>
  ; nil
  ;
  ; @return (string)
  ([border-radius]
   (adaptive-border-radius border-radius 1))

  ([border-radius ratio]
   (cond (keyword? border-radius) (str "calc(var(--border-radius-" (name border-radius) ") * " ratio ")")
         (string?  border-radius) (str "calc(" border-radius   " * " ratio ")")
         (integer? border-radius) (str "calc(" border-radius "px * " ratio ")"))))
