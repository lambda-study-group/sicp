 (defn f [n] 
    (cond (< n 3) n
         :else (+ (f (- n 1)) (f (- n 2))))) 
  