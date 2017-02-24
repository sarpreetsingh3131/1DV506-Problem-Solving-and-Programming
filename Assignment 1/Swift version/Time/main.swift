//  Created by Sarpreet Singh on 2016-12-17.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

print("Give number of seconds: ", terminator: "")
var seconds = Int(readLine()!)!
let hours = seconds / 3600;
seconds -= hours * 3600;
let minutes = seconds / 60;
seconds -= minutes * 60;
print("This corresponds to: \(hours) hours \(minutes) minutes \(seconds) seconds.")
