//
//  main.swift
//  Temp
//
//  Created by Sarpreet Singh on 2016-12-15.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

print("Provide a line of text: ", terminator: "")
let input = readLine()!


print("Backwards: ", terminator: "")
for i in stride(from:(input.characters.count) - 1, through: 0, by: -1) {
    let index = input.index(input.startIndex, offsetBy: i)
    print(input[index], terminator: "")
}
print()
