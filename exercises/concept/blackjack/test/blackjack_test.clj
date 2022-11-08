(ns blackjack-test
  (:require [clojure.test :refer [deftest testing is]]
            blackjack))

; copied from https://github.com/exercism/go/blob/main/exercises/concept/blackjack/blackjack_test.go

(deftest test-pase-card
  (is (= 2 (blackjack/pase-card "2")))
  (is (= 5 (blackjack/pase-card "5")))
  (is (= 8 (blackjack/pase-card "8")))
  (is (= 11 (blackjack/pase-card "A")))
  (is (= 10 (blackjack/pase-card "10")))
  (is (= 10 (blackjack/pase-card "J")))
  (is (= 10 (blackjack/pase-card "Q")))
  (is (= 10 (blackjack/pase-card "K"))))

(deftest test-first-hand
  (is (= "P" (blackjack/first-turn ("A" "A" "A"))))
  (is (= "S" (blackjack/first-turn ("J" "J" "A"))))
  (is (= "S" (blackjack/first-turn ("K" "K" "A"))))
  (is (= "H" (blackjack/first-turn ("2" "2" "A"))))
  (is (= "H" (blackjack/first-turn ("5" "5" "A"))))
  (is (= "S" (blackjack/first-turn ("A" "J" "A"))))
  (is (= "S" (blackjack/first-turn ("K" "A" "Q"))))
  (is (= "S" (blackjack/first-turn ("K" "A" "Q"))))
  (is (= "W" (blackjack/first-turn ("A" "10" "5"))))
  (is (= "W" (blackjack/first-turn ("A" "K" "9"))))
  (is (= "S" (blackjack/first-turn ("10" "K" "A"))))
  (is (= "S" (blackjack/first-turn ("10" "9" "A"))))
  (is (= "S" (blackjack/first-turn ("10" "8" "A"))))
  (is (= "S" (blackjack/first-turn ("7" "K" "A")))))

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
