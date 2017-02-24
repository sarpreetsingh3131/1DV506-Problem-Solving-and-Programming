//
//  main.swift
//  Temp
//
//  Created by Sarpreet Singh on 2016-12-15.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

print("Provide an odd positive integer: ", terminator: "")
var input: Int = Int(readLine()!)!

if input % 2 == 0 {
    print("Intger should be odd and positive")
    exit(0)
}

print("Right - Angled Triangle")
for i in stride(from: 1, through: input, by: 1) {
    for j in stride(from: i, through: input, by: 1) {
        print(" ", terminator: "")
    }
    for k in stride(from: 1, through: i, by: 1) {
        print("*", terminator: "")
    }
    print()
}

print("Isosceles Triangle: ")
for i in stride(from: 1, through: input, by: 2) {
    let numOfStars = i
    let spaces = (input - i) / 2
    for j in stride(from: 1, through: spaces, by: 1) {
      print(" ", terminator: "")
    }
    for k in stride(from: 1, through: numOfStars, by: 1) {
         print("*", terminator: "")
    }
    for l in stride(from: 1, through: spaces, by: 1) {
      print(" ", terminator: "")
    }
     print()
}
