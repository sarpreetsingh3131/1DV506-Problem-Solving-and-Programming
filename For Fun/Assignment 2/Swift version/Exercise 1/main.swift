//
//  main.swift
//  Temp
//
//  Created by Sarpreet Singh on 2016-12-15.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

print("Provide a line of text: ", terminator: "")
var input = readLine()!
var smallA = 0
var bigA = 0

for char in input.characters {
    if char == "a" {
        smallA += 1
    }
    else if char == "A" {
        bigA += 1
    }
}
print("Number of 'a': \(smallA)");
print("Number of 'A': \(bigA)");
