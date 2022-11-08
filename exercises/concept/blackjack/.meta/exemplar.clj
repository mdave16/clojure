(ns black-jack)

;; ParseCard returns the integer value of a card following blackjack ruleset.
(defn parse-card [card]
  {"ace" 11
   "two" 2
   "three" 3
   "joker" 0}
  )


;; FirstTurn returns the decision for the first turn, given two cards of the
;; player and one card of the dealer.
(defn func FirstTurn [card1 card2 dealerCard string])
