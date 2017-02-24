//
//  main.swift
//  Temp
//
//  Created by Sarpreet Singh on 2016-12-15.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

var randomNumber = Int(arc4random_uniform(100) + 1)
var guess = 0
print("Guess a number between 1-100 in 10 turns")

for i in 1...10 {
    
    print("Guess \(i): ", terminator: "")
    guess = Int(readLine()!)!
    
    if guess == randomNumber {
        print("Correct answer after only \(i) guesses – Excellent!")
        break
    }
    else if guess < randomNumber {
        print("Clue: Higher")
    }
    else {
        print("Clue: Lower")
    }
}
if guess != randomNumber {
    print("Correct answer is \(randomNumber)")
}
