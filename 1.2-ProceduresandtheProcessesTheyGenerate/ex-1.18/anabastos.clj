(defn double [x]
  (* x 2))

(defn halve [x]
  (/ x 2))

(defn square [x] (* x x))

(defn fast-mult [a b c]
  (cond (= b 0) c
        (even? b) (fast-mult a (halve b) (double c))
        (odd? b) (fast-mult a (- b 1) (+ a c))))
