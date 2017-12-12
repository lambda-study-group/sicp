(defn sum-of-square [x y] (+ (* x x) (* y y)))

(defn procedure 
    [x y z]
    (cond
        (and (< x y)(< x z)) (sum-of-square y z)
        (< y z) (sum-of-square x z)
        :else (sum-of-square x y)))