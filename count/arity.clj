
(defn cusCount
  "Cutom count"
  ([total coll]
   (if (empty? coll)
     total
     (recur (inc total) (rest coll))))
  ([coll] (cusCount 0 coll)))

(println (cusCount 10 '(1 2 3 4 5 6 7 8 9 10))) ; 20
(println (cusCount '(1 2 3 4 5 6 7 8 9 10))) ; 10