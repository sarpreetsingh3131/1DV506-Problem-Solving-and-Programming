//
//  main.swift
//  Temp
//
//  Created by Sarpreet Singh on 2016-12-16.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

var text = ["!", "y", "s", "a", "E", " ", "s", "a", "w", " ", "s", "i", "h", "T"]

for item in text {
    print(item, terminator: "")
}

for i in stride(from: 0, to: text.count / 2, by: 1) {
    var temp = text[i]
    text[i] = text[text.count - 1 - i]
    text[text.count - 1 - i] = temp
}
print()
for item in text {
    print(item, terminator: "")
}
