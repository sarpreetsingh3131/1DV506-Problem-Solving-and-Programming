//  Created by Sarpreet Singh on 2016-12-17.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

print("X co-ordinates")
print("x1: ", terminator: "")
let x1 = Int(readLine()!)!
print("x2: ", terminator: "")
let x2 = Int(readLine()!)!

print("Y co-ordinates")
print("y1: ", terminator: "")
let y1 = Int(readLine()!)!
print("y2: ", terminator: "")
let y2 = Int(readLine()!)!

let distance = sqrt(pow(Double(x1 - x2), 2) + pow(Double(y1 - y2), 2))
print("Distance: \(String(format: "%.03f", distance))")
