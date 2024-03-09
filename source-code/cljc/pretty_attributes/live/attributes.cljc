
(ns pretty-attributes.live.attributes
    (:require [fruits.map.api          :as map]
              [pretty-attributes.utils :as utils]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn animation-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @note
  ; Do not apply animation and visibility attributes on the same element, in order to avoid concurent opacity values!
  ;
  ; @description
  ; Applies the animation related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:animation-direction (keyword)(opt)
  ;  :animation-duration (ms)(opt)
  ;  :animation-mode (keyword)(opt)
  ;  :animation-name (keyword or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (animation-attributes {...} {:animation-direction :ltr :animation-duration 250 :animation-name :fade-in})
  ; =>
  ; {:data-animation-direction :ltr
  ;  :data-animation-duration  :var
  ;  :data-animation-name      :fade-in
  ;  :style {"--animation-duration" "250ms"}
  ;  ...}
  ;
  ; @return (map)
  ; {:data-animation-direction (keyword)
  ;  :data-animation-duration (keyword)
  ;  :data-animation-mode (keyword)
  ;  :data-animation-name (keyword)
  ;  :style (map)
  ;   {"--animation-duration" (string)
  ;    "--animation-name" (string)
  ;    ...}
  ;  ...}
  [attributes {:keys [animation-direction animation-duration animation-mode animation-name]}]
  (-> attributes (map/merge-some {:data-animation-direction animation-direction})
                 (utils/apply-property-value :animation-duration :data-animation-duration animation-duration "ms")
                 (utils/apply-property-value :animation-mode     :data-animation-mode     animation-mode)
                 (utils/apply-property-value :animation-name     :data-animation-name     animation-name)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn progress-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the progress related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; {:style (map)(opt)}
  ; @param (map) props
  ; {:progress (percent)(opt)
  ;  :progress-color (keyword or string)(opt)
  ;  :progress-direction (keyword)(opt)
  ;  :progress-duration (ms)(opt)
  ;  ...}
  ;
  ; @usage
  ; (progress-attributes {...} {:progress           50
  ;                             :progress-color     :primary
  ;                             :progress-direction :ltr
  ;                             :progress-duration  250})
  ; =>
  ; {:data-progress-color     :primary
  ;  :data-progress-direction :ltr
  ;  :style {"--progress"          "50%"
  ;          "--progress-duration" "250ms"}
  ;  ...}
  ;
  ; @return (map)
  ; {:data-progress-color (keyword)
  ;  :data-progress-direction (keyword)
  ;  :style (map)
  ;   {"--progress" (string)
  ;    "--progress-color" (string)
  ;    "--progress-duration" (string)
  ;    ...}
  ;  ...}
  [{:keys [style] :as attributes} {:keys [progress progress-color progress-direction progress-duration]}]
  (-> attributes (assoc :style (merge style (if progress          {"--progress"          (str progress          "%")})
                                            (if progress-duration {"--progress-duration" (str progress-duration "ms")})))
                 (map/merge-some {:data-progress-direction progress-direction})
                 (utils/apply-property-value :progress-color :data-progress-color progress-color)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn transformation-attributes
  ; @note
  ; Values derived from the given property map, and applied on the given attribute map.
  ;
  ; @description
  ; Applies the transformation related values on the given attribute map.
  ;
  ; @param (map) attributes
  ; @param (map) props
  ; {:transform (keyword or string)(opt)
  ;  ...}
  ;
  ; @usage
  ; (transformation-attributes {...} {:transform :rotate-90})
  ; =>
  ; {:data-transform :rotate-90
  ;  ...}
  ;
  ; @return (map)
  ; {:data-transform (keyword)
  ;  :style {"--transform" (string)}
  ;  ...}
  [attributes {:keys [transform]}]
  (-> attributes (utils/apply-property-value :transform :data-transform transform)))
