; custom map
; A map function that takes a function and a list as arguments and returns 
; a new list that is the result of applying the function to each element of the list.

(defn cusmap
  "Custom map"
  [f arr]
  (if (empty? arr)
    nil
    (cons (f (first arr)) (cusmap f (rest arr)))))


(cusmap println ["hello" "world"])
(map println ["hello" "world"])

(defn square
  "Square"
  [x] 
  (* x x))

(def numlist [1 2 3 4 5 6 7 8 9 10])

(cusmap square numlist)
(map println numlist)


(def newlist (map square numlist))
(println newlist)


(def newlist2 (cusmap square numlist))
(println newlist2)