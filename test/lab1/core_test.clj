(ns lab1.core-test
  (:require [clojure.test :refer :all]
            [lab1.core :refer :all]))

(deftest mytest (testing "test group" (are [result param]
                                        (= result (group param))
                                        '{"Chet" [4 8 16 42], "Nechet" [15 23]} [4 8 15 16 23 42]
                                        '{"Chet" [22 44], "Nechet" [17 1 33]} [17 1 22 33 44]
                                        '{"Chet" [1 2 3], "Nechet" [4 5]} [1 2 3 4 5])))
;;(run-tests 'lab1.core-test)

