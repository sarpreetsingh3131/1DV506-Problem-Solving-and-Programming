//
//  main.swift
//  Temp
//
//  Created by Sarpreet Singh on 2016-12-16.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

var frequency = Array(repeating:0, count:6)

    for i in 1...6000 {
    
        var randomNumber = Int(arc4random_uniform(6) + 1)

        switch randomNumber {
        case 1:
            frequency[0] += 1
        case 2:
            frequency[1] += 1
        case 3:
            frequency[2] += 1
        case 4:
            frequency[3] += 1
        case 5:
            frequency[4] += 1
        case 6:
            frequency[5] += 1
        default:
            break
        }
    }
    print("Frequencies when rolling a dice 6000 times.")

    for (index, element) in frequency.enumerated() {
        print("\(index + 1): \(element)")
    }
