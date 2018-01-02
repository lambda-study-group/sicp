(defn cube [x] (* x x x))
(defn abs [n] (max n (- n)))
(defn p [x] (print (- (* 3 x) (* 4 (cube x)))))
(defn sine [angle]
   (if (not (> (abs angle) 0.1))
       angle
       (p (sine (/ angle 3.0)))))

; a) 7 Vezes
; b) É logaritmico log3(n) pois p é chamado somente até quando a divisao do angulo esta acima de 0.1.