#lang sicp
(define (a-plus-abs-b a b)
((if (> b 0) + -) a b))

; The application will invert the signal of the operation based if the b
; argument is positive of negative, so the returned number will always be absolute.