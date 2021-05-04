(defn closest-palindrome [n]
  (if (palindrome? n)
    (n)
    :else
  ; TODO figure this out  
    ))

(defn palindrome? [n]
 (= (seq (str n) (reverse (seq(str n))))))
