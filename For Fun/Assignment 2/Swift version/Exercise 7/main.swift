//
//  main.swift
//  Temp
//
//  Created by Sarpreet Singh on 2016-12-15.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

print("Provide a positive integer: ", terminator: "")
var input = Int(readLine()!)!

var odds = 0
var zeros = 0
var evens = 0

while input != 0 {
    var temp = input % 10
    
    if temp == 0 {
        zeros += 1
    }
    else if temp % 2 == 0 {
        evens += 1
    }
    else {
        odds += 1
    }
    input /= 10;
}

print("Zeros: \(zeros)")
print("Odd: \(odds)")
print("Even: \(evens)")
