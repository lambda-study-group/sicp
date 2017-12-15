(defn square [x] (* x x))
(defn cube [x] (* x x x))
(defn abs [n] (max n (- n)))

(defn improve [guess x]
  (/ (+ (/ x (square guess))
        (* 2 guess) )
     3))

(defn good-enough? [guess x]
  (< (abs (- (cube guess) x)) 0.001))

(defn cbrt-iter [guess x]
  (if (good-enough? guess x)
    guess
    (cbrt-iter (improve guess x) x)))

(defn cbrt [x]
  (cbrt-iter 1.0 x))

