(defn closest-palindrome [n]
  (if (palindrome? n)
    n
    (do
        (let [small (small-palindrome n)]
        (let [large (large-palindrome n)]
          ;large is always > n and small is always < n
          ;return small in case of tie
          (if (<= 
                (- n small)
                (- large n))
            small
            large))))))


;(Math/abs (- (small-palindrome n) n))]

(defn palindrome? [n]
 (= (seq (str n)) (reverse (seq(str n)))))

(defn small-palindrome [n]
  (if (palindrome? n)
    n
    (small-palindrome (dec n))))

(defn large-palindrome [n]
  (if (palindrome? n)
    n
    (large-palindrome (inc n))))
