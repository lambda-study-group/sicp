(defn +++ [a b]
  (if (= a 0)
    b
    (inc (+ (dec a) b))))

(defn ++ [a b]
  (if (= a 0)
    b
    (++ (dec a) (inc b))))

; recursive
(= 9 (+++ 4 5))
; iterative
(= 9 (++ 4 5))