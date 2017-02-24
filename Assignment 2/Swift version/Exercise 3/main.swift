//
//  main.swift
//  Temp
//
//  Created by Sarpreet Singh on 2016-12-15.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

print("Give a positive integer: ", terminator: "")
let input = Int(readLine()!)!

var sum = 0
var k = 0

while sum < input {
    sum += k + 2
    k += 2
}
k -= 2
print("The largest K such that 0 + 2 + 4 + 6 +...+ K < \(input) => K = \(k)")
