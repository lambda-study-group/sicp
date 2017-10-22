#lang sicp
(define (p) (p))
(define (test x y)
(if (> x 0) 0 y))

(test 0 (p))

; applicative-order
; (if (= 0 0) 0 (p (p (p (p (... and so on))))))
; infinite recursion
;
; normal-order
; (if (= 0 0) 0 (p))
; (if (true) 0 (p))
; 0

; This environment uses applicative-order evaluation, trying to expand
; everything and resulting in a infinite recursion. In normal-order evaluation
; the expression evaluates first then expand.