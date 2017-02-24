//  Created by Sarpreet Singh on 2016-12-17.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

print("Give your length in meters: ", terminator: "")
var length = Double(readLine()!)!
print("Give your weight in kilograms: ", terminator: "")
var weight = Double(readLine()!)!
let bmi = Int(round(weight / (length * length)))
print("Total time measured in seconds: \(bmi)")
