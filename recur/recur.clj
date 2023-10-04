
; Recur transforms a recursion into a loop iteration. Doing this we 
; avoid the stack overflow that would otherwise occur and. Is like a recursion
; but without it's negative traits like stack overflow.

(def factorial
  (fn [n]
    (loop [cnt n
           acc 1]
      (if (zero? cnt)
        acc
        (recur (dec cnt) (* acc cnt))
; in loop cnt will take the value (dec cnt)
; and acc will take the value (* acc cnt)
        ))))


(loop [i 0]  
  (when (< i 5)    
    (println i)    
    (recur (inc i)); loop i will take this value
))

; using recur is like calling the function again but without the stack overflow
; So where you put the recursive call you put the recur call instead


