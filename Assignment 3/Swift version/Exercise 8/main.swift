//
//  main.swift
//  Temp
//
//  Created by Sarpreet Singh on 2016-12-16.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

var deck = Deck()

deck.shuffle()
print("Size: \(deck.size())")

for i in 1...53 {
    if let card = deck.dealCard() {
    print("Dealt Card: \(card.getRank()) of \(card.getSuit())")
  }
}
deck.shuffle()
print("Size: \(deck.size())")
