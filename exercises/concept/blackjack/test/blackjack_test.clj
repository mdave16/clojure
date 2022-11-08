(ns black-jack-test
  (:require [clojure.test :refer [deftest testing is]]
            cars-assemble))

; copied from https://exercism.org/tracks/python/exercises/black-jack
; functions to test:
; value-of-card
; higher-card
; is-blackjack
; can-split_pairs
; can-double_down

(deftest test-value-of-card
  (is (= 2 (black-jack/value-of-card "2")))
  (is (= 5 (black-jack/value-of-card "5")))
  (is (= 8 (black-jack/value-of-card "8")))
  (is (= 1 (black-jack/value-of-card "A")))
  (is (= 10 (black-jack/value-of-card "10")))
  (is (= 10 (black-jack/value-of-card "J")))
  (is (= 10 (black-jack/value-of-card "Q")))
  (is (= 10 (black-jack/value-of-card "K"))))
