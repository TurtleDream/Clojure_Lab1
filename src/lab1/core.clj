(ns lab1.core)

(defn group [vector]
  (loop [
         cvec []
         nvec []
         map (array-map)
         i 0]
    (if-not(= (count vector) i)
      (if (= (rem (get vector i) 2) 0)
        (recur
          (conj cvec(get vector i))
          nvec
          (assoc map "Chet" (conj cvec(get vector i)))
          (inc i))
        (recur
          cvec
          (conj nvec(get vector i))
          (assoc map "Nechet" (conj nvec(get vector i)))
          (inc i)))
      map
      )))

(group [4 8 15 16 23 42])