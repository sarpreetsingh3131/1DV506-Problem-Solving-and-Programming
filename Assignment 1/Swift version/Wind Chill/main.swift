//  Created by Sarpreet Singh on 2016-12-17.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

print("Temperature: ", terminator: "")
let temperature = Double(readLine()!)!
print("Wind Speed: ", terminator: "")
let windSpeed = Double(readLine()!)!
let windChill = 33 + (temperature - 33) * (0.474 + 0.454 * sqrt(windSpeed) - 0.0454 * windSpeed)
print("Wind Chill Temperature: \(String(format: "%.1f", windChill))")
