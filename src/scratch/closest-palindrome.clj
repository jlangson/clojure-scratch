(defn closest-palindrome [n]
  (if (palindrome? n)
    n
    (do
      ;TODO find palindrome > n and < n then filter whichever is closer to the original n
      (closest-palindrome(dec n))
      ;(closest-palindrome(inc n))
    )))

(defn palindrome? [n]
 (= (seq (str n)) (reverse (seq(str n)))))
