//  Created by Sunny Buttar on 2016-12-16.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.

import Foundation

public class Card {
    
    public enum Suit {
        case Hearts, Clubs, Diamonds, Spades
        
        static let allValues = [Hearts, Clubs, Diamonds, Spades]
    }
    
    public enum Rank {
        case Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
        
        static let allValues = [Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King]
    }
    
    private var suit: Suit
    private var rank: Rank
    
    init(suit: Suit, rank: Rank) {
        self.suit = suit
        self.rank = rank
    }
    
    public func getSuit() -> Suit {
        return suit
    }
    
    public func getRank() -> Rank {
        return rank
    }
}
