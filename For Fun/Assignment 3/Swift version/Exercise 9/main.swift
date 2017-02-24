//  Created by Sarpreet Singh on 2016-12-16.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

func play123() -> Bool {
    let deck = Deck()
    deck.shuffle()
    
    for i in 1...3 {
        let card = deck.dealCard()!
        print("Count is \(i) and Rank is \(card.getRank())")
        if i == 1 && card.getRank() == Card.Rank.Ace {
            return false
        }
        else if i == 2 && card.getRank() == Card.Rank.Two {
            return false
        }
        else if i == 3 && card.getRank() == Card.Rank.Three {
            return false
        }
    }
    return true
}

var wins = 0

for _ in 0..<10000 {
    if !play123() {
        break
    }
    else {
        wins += 1
    }
}
let probability = Double(wins) * 100.0 / 10000.0
print("You win \(wins) times out of 10000. Your probability is \(probability) %")
