//
//  main.swift
//  Temp
//
//  Created by Sarpreet Singh on 2016-12-15.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

print("Enter a line of text: ", terminator: "")
var input = readLine()!

var onlyLetters = ""
var reverse = ""

for char in input.unicodeScalars {
    let ascii = char.value
    if ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122 {
        onlyLetters += String(char)
    }
}

for i in stride(from: onlyLetters.characters.count - 1, through: 0, by: -1) {
      let index = onlyLetters.index(onlyLetters.startIndex, offsetBy: i)
        reverse.append(onlyLetters[index])
}
print("Is Palindromr \(reverse.lowercased() == onlyLetters.lowercased())")
