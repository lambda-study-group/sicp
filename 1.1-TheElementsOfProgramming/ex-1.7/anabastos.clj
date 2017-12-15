(defn new-if 
    [predicate then-clause else-clause]
    (cond predicate then-clause
        :else else-clause))

(defn average 
  [x y]
  (/ (+ x y) 2))

(defn improve 
  [guess x]
  (average guess (/ x guess)))

(defn square [x] (* x x))

(defn abs [n] (max n (- n)))

(defn good-enough? 
  [guess x]
  (< (abs (- (square guess) x)) 0.001))

(defn sqrt [x]
  (sqrt-iter 1.0 x))

(defn sqrt-iter 
    [guess previous-guess x]
    (new-if (good-enough? guess previous-guess)
          guess
          (sqrt-iter (improve guess x) guess x)))
