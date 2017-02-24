//  Created by Sarpreet Singh on 2016-12-17.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

print("Price: ", terminator: "")
let price = Double(readLine()!)!
print("Payment: ", terminator: "")
let payment = Double(readLine()!)!
var change = Int(round(payment - price))
print("Change: \(change) kronor")
print("1000kr bills: \(change / 1000)")
change %= 1000
print("500kr bills: \(change / 500)")
change %= 500
print("100kr bills: \(change / 100)")
change %= 100
print("50kr bills: \(change / 50)")
change %= 50
print("20kr bills: \(change / 20)")
change %= 20
print("10kr bills: \(change / 10)")
change %= 10
print("5kr bills: \(change / 5)")
change %= 5
print("1kr bills: \(change)")
