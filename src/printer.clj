(ns printer)

(defn error [char]
  (clojure.string/includes? char #"[^a-m]"))

(defn printer-error [s]
  ; your code
  (str (count (re-seq #"[^a-m]" s) ) "/" (count s)))

(defn vectorize-string [s]
  (seq (char-array s)))

;(defn count-errors [s]
;  (reduce + 0 vectorize-string (s))
;  )

; return a count of how many letters are not a to m
