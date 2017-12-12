(defn a-plus-abs-b 
  [a b]
  ((if (> b 0) + -) a b))

; The procedure checks if b is negative and return function of the operator plus or minus. 
; If b is negative the operator will be minus, that way it ensures that b is always absolute.
