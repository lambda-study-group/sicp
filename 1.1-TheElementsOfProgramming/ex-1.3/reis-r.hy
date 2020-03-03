(defn square [x] (* x x))
(defn answer [x y z]
  (+ (square (get (sorted [x y z]) -1))
     (square (get (sorted [x y z]) -2))))
