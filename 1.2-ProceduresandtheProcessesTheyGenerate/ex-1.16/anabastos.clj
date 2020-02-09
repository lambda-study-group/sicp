(defn square [x] (* x x))

(defn expt [b n a]
   (cond (= n 0) a
         (even? n) (square (expt b (/ n 2) a))
         :else (expt b (- n 1) (* b a))))

