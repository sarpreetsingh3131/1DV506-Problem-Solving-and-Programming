//  Created by Sarpreet Singh on 2016-12-17.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

print("First Name: ", terminator: "")
let fName = readLine()!
print("Last Name: ", terminator: "")
let lName = readLine()!
let fNameIndex = fName.index(fName.startIndex, offsetBy: 1)
let lNameIndex = lName.index(lName.startIndex, offsetBy: 4)
print("Short Name: \(fName.substring(to: fNameIndex)). \(lName.substring(to: lNameIndex))")

