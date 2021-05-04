(ns descending-order)

;Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
;
;Examples:
;Input: 42145 Output: 54421
;
;Input: 145263 Output: 654321
;
;Input: 123456789 Output: 987654321

(defn desc-order [n]
  ;; Converts number to characters, sorts digits on ASCII values, then turns it back into a number
  (Integer. (apply str (map char (sort > (map int (map char (seq (str n)))))))))



(defn desc-order-threaded [n]
  (->> n
     str
     (map char)
     (map int)
     (sort >)
     (map char)
     (apply str)
     Integer.))                                             ;; Integer. same as Integer/parseInt
