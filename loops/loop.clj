; Loop Acts as a recur target.

(loop
 [x 10]
  (when (> x 1) (println x)
        (recur (dec x))))
