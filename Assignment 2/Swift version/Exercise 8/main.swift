//
//  main.swift
//  Temp
//
//  Created by Sarpreet Singh on 2016-12-15.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

var box = 24
var totalBoughtBoxes = 0
var remainingCandles = 0

for i in stride(from: 1, through: 100, by: 1) {
    var counter = 0
    while remainingCandles < i {
        remainingCandles += box
        counter += 1
    }
    if counter != 0 {
        print("Before birthday \(i), buy \(counter) box(es)")
    }
    remainingCandles -= i
    totalBoughtBoxes += counter
    counter = 0
}
print("Total number of boxes: \(totalBoughtBoxes), Remaining candles: \(remainingCandles)")
