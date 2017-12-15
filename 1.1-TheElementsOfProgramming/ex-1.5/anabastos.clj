(defn p [] p)

(defn test 
    [x y]
    (if (> x 0) 0 y))

(test 0 (p))

; The expression (test 0 (p)) will end in a infinite loop if the programming language evaluates in applicative-order 
; In normal order evaluation the expression is evaluated outside in, terminating the execution.
