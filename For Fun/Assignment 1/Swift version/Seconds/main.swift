//  Created by Sarpreet Singh on 2016-12-17.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

print("Hours: ", terminator: "")
let hours = Int(readLine()!)!
print("Minutes: ", terminator: "")
let minutes = Int(readLine()!)!
print("Second: ", terminator: "")
let seconds = Int(readLine()!)!
print("Total time measured in seconds: \((hours * 3600) + (minutes * 60) + seconds)")
