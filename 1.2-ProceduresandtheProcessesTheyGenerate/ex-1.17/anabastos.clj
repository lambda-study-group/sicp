(defn double [x]
  (* x 2))

(defn halve [x]
  (/ x 2))

(defn fast-mult [a b]
  (cond (= b 0) 0
        (= b 1) a
        (even? b) (double (fast-mult a (halve b)))
        :else + a (fast-mult a (- b 1))))

; (fast-mult 4 2) 8