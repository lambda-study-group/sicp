#lang sicp

(define (sqrt-iter guess oldguess x)
  (if (good-enough? guess oldguess x)
    guess
    (sqrt-iter (improve guess x) guess x)))

(define (improve guess x)
  (average guess (/ x guess)))

(define (average x y)
  (/ (+ x y) 2))

(define (good-enough? guess oldguess x)
  (< (abs (- oldguess guess)) 0.001))

(define (sqrt x)
  (sqrt-iter 1.0 2.0 x))

(define (square x) (* x x))