(ns blackjack-test
  (:require [clojure.test :refer [deftest testing is]]
            blackjack))

; copied from https://github.com/exercism/go/blob/main/exercises/concept/blackjack/blackjack_test.go

(deftest test-value-of-card
  (is (= 2 (black-jack/value-of-card "2")))
  (is (= 5 (black-jack/value-of-card "5")))
  (is (= 8 (black-jack/value-of-card "8")))
  (is (= 1 (black-jack/value-of-card "A")))
  (is (= 10 (black-jack/value-of-card "10")))
  (is (= 10 (black-jack/value-of-card "J")))
  (is (= 10 (black-jack/value-of-card "Q")))
  (is (= 10 (black-jack/value-of-card "K"))))

(deftest test-first-hand
  (is (= "P" (black-jack/first-turn ("A" "A" "A"))))
  (is (= "S" (black-jack/first-turn ("J" "J" "A"))))
  (is (= "S" (black-jack/first-turn ("K" "K" "A"))))
  (is (= "H" (black-jack/first-turn ("2" "2" "A"))))
  (is (= "H" (black-jack/first-turn ("5" "5" "A"))))
  (is (= "S" (black-jack/first-turn ("A" "J" "A"))))
  (is (= "S" (black-jack/first-turn ("K" "A" "Q"))))
  (is (= "S" (black-jack/first-turn ("K" "A" "Q"))))
  (is (= "W" (black-jack/first-turn ("A" "10" "5"))))
  (is (= "W" (black-jack/first-turn ("A" "K" "9"))))
  (is (= "S" (black-jack/first-turn ("10" "K" "A"))))
  (is (= "S" (black-jack/first-turn ("10" "9" "A"))))
  (is (= "S" (black-jack/first-turn ("10" "8" "A"))))
  (is (= "S" (black-jack/first-turn ("7" "K" "A")))))

  ;{
  ; name:   "score of 16 with six for dealer",
  ; hand:   hand{card1: "ten", card2: "six"},
  ; dealer: "six",
  ; want:   "S",
  ; },
  ;{
  ; name:   "score of 16 with seven for dealer",
  ; hand:   hand{card1: "ten", card2: "six"},
  ; dealer: "seven",
  ; want:   "H",
  ; },
  ;{
  ; name:   "score of 16 with ace for dealer",
  ; hand:   hand{card1: "ten", card2: "six"},
  ; dealer: "ace",
  ; want:   "H",
  ; },
  ;{
  ; name:   "score of 15 with six for dealer",
  ; hand:   hand{card1: "ten", card2: "five"},
  ; dealer: "six",
  ; want:   "S",
  ; },
  ;{
  ; name:   "score of 15 with seven for dealer",
  ; hand:   hand{card1: "ten", card2: "five"},
  ; dealer: "seven",
  ; want:   "H",
  ; },
  ;{
  ; name:   "score of 15 with king for dealer",
  ; hand:   hand{card1: "ten", card2: "five"},
  ; dealer: "king",
  ; want:   "H",
  ; },
  ;{
  ; name:   "score of 14 with six for dealer",
  ; hand:   hand{card1: "ten", card2: "four"},
  ; dealer: "six",
  ; want:   "S",
  ; },
  ;{
  ; name:   "score of 14 with seven for dealer",
  ; hand:   hand{card1: "ten", card2: "four"},
  ; dealer: "seven",
  ; want:   "H",
  ; },
  ;{
  ; name:   "score of 14 with queen for dealer",
  ; hand:   hand{card1: "ten", card2: "four"},
  ; dealer: "queen",
  ; want:   "H",
  ; },
  ;{
  ; name:   "score of 13 with six for dealer",
  ; hand:   hand{card1: "ten", card2: "three"},
  ; dealer: "six",
  ; want:   "S",
  ; },
  ;{
  ; name:   "score of 13 with seven for dealer",
  ; hand:   hand{card1: "ten", card2: "three"},
  ; dealer: "seven",
  ; want:   "H",
  ; },
  ;{
  ; name:   "score of 13 with queen for dealer",
  ; hand:   hand{card1: "ten", card2: "three"},
  ; dealer: "queen",
  ; want:   "H",
  ; },
  ;{
  ; name:   "score of 12 with six for dealer",
  ; hand:   hand{card1: "ten", card2: "two"},
  ; dealer: "six",
  ; want:   "S",
  ; },
  ;{
  ; name:   "score of 12 with seven for dealer",
  ; hand:   hand{card1: "ten", card2: "two"},
  ; dealer: "seven",
  ; want:   "H",
  ; },
  ;{
  ; name:   "score of 12 with queen for dealer",
  ; hand:   hand{card1: "ten", card2: "two"},
  ; dealer: "queen",
  ; want:   "H",
  ; },
  ;{
  ; name:   "score of 11 with queen for dealer",
  ; hand:   hand{card1: "nine", card2: "two"},
  ; dealer: "queen",
  ; want:   "H",
  ; },
  ;{
  ; name:   "score of 10 with two for dealer",
  ; hand:   hand{card1: "eight", card2: "two"},
  ; dealer: "two",
  ; want:   "H",
  ; },
  ;{
  ; name:   "score of 5 with queen for dealer",
  ; hand:   hand{card1: "three", card2: "two"},
  ; dealer: "queen",
  ; want:   "H",
  ; },
  ;{
  ; name:   "score of 4 with five for dealer",
  ; hand:   hand{card1: "two", card2: "two"},
  ; dealer: "five",
  ; want:   "H",
  ; },
