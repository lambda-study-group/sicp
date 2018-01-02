 (defn pascal [col depth] 
   (cond  
     (= col 0) 1
     (= col depth) 1
     :else (+ (pascal (- col 1) (- depth 1))  
              (pascal col ( - depth 1))))) 
