//
//  Deck.swift
//  Temp
//
//  Created by Sunny Buttar on 2016-12-16.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

public class Deck {
    
    private var deck = [Card]()
    
    init() {
        for suit in Card.Suit.allValues {
            for rank in Card.Rank.allValues {
                deck.append(Card(suit: suit, rank: rank))
            }
        }
    }
    
    public func shuffle() {
        if deck.count != 52 {
            print("Cannot Shuffle. Deck contains \(deck.count) cards")
            return
        }
        for _ in 0...1000 {
            let index = Int(arc4random_uniform(1000)) % deck.count
            let card = deck[index]
            deck.remove(at: index)
            deck.append(card)
        }
    }
    
    public func dealCard() -> Card? {
        if deck.count <= 0 {
            print("Cannot deal. Deck is empty!")
        }
        if let card = deck.first {
        deck.removeFirst()
         return card
        }
        return nil
    }
    
    public func size() -> Int {
        return deck.count
    }
}
