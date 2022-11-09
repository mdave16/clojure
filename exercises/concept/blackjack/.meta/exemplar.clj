(ns black-jack)

;; ParseCard returns the integer value of a card following blackjack ruleset.
;; card names are given in english lowercase
(defn parse-card [card]
  ({"ace"   11
    "two"   2
    "three" 3
    "four"  4
    "five"  5
    "six"   6
    "seven" 7
    "eight" 8
    "nine"  9
    "ten"   10
    "jack"  10
    "queen" 10
    "king"  10
    "joker" 0} card))

;; FirstTurn returns the decision for the first turn, given two cards of the
;; player and one card of the dealer.
(defn first-turn [card1 card2 dealer-card]
  (let [hand-score (+ (parse-card card1) (parse-card card2))
        dealer-score (parse-card dealer-card)]
    (cond
      (= 22 hand-score) "P"
      (and (= 21 hand-score) (< dealer-score 10)) "W"
      (or (>= hand-score 17) (and (>= hand-score 12) (< dealer-score 7))) "S"
      :else "H")))