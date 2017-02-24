//  Created by Sarpreet Singh on 2016-12-17.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

print("Provide a three digit number: ", terminator: "")
var input = Int(readLine()!)!
var sum = input % 10
input = input / 10;
sum += input % 10;
sum += input / 10;
print("Sum: \(sum)")
