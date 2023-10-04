
(defn cusCount
  "Cutom count"
  [total coll]
  (if (empty? coll)
      total
      (recur (inc total) (rest coll))
  )
)

(println (cusCount 0 '(1 2 3 4 5 6 7 8 9 10)))