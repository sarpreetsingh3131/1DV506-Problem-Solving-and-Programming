//
//  main.swift
//  Temp
//
//  Created by Sarpreet Singh on 2016-12-15.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

print("Provide 10 integer: ", terminator: "")
var secondLargest = 0
var largest = 0

for i in 1...10 {
    let input = Int(readLine()!)!
    
    if input > largest {
        secondLargest = largest
        largest = input
    }
    else if input < largest && input > secondLargest {
        secondLargest = input
    }
}
print("The second largest is: \(secondLargest)")






