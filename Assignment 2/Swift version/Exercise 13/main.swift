//
//  main.swift
//  Temp
//
//  Created by Sarpreet Singh on 2016-12-16.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

var salaries = [Int]()
var sum = 0

print("Provide salaries (and terminate input with 'X'): ")
var input = ""

while input != "X" {
    input = readLine()!
    if input != "X" {
      salaries.append(Int(input)!)
        sum += Int(input)!
    }
}
salaries.sort()

if salaries.count % 2 != 0 {
    print("Median: \(salaries[salaries.count / 2])")
}
else {
    var median = Double(salaries[salaries.count / 2] + salaries[(salaries.count / 2) - 1])
    print("Median: \(round(median / 2))")
}
print("Average: \(sum / salaries.count)")
print("Gap: \(salaries.last! - salaries.first!)")
