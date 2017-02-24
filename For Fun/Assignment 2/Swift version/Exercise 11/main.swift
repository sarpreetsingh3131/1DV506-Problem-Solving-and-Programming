//
//  main.swift
//  Temp
//
//  Created by Sarpreet Singh on 2016-12-15.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

var list: Array<Int> = Array()
print("Enter positive integers. End by giving a negative integer.")

var counter = 0
var input = 0

while input >= 0 {
    counter += 1
    print("Integer \(counter): " , terminator: "")
    input = Int(readLine()!)!
    if input >= 0 {
        list.append(input)
    }
}

print("Number of positive integers: \(list.count)")
print("In reverse order: ", terminator: "")

for i in stride(from: list.count - 1, through: 0, by: -1) {
    print("\(list[i]) ", terminator: "")
}
print()




