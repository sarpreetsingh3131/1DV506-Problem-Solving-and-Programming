//
//  main.swift
//  Temp
//
//  Created by Sarpreet Singh on 2016-12-16.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

var text = "My name is Anakin Skywalker. My age is 42."
var ta = TextAnalyzer(text: text)

print("Char Count: \(ta.charCount())")
print("Upper Case Count: \(ta.upperCaseCount())")
print("Whitespace Count: \(ta.whitespaceCount())")
print("Digit Count: \(ta.digitCount())")

if ta.containsChar(char: "x") {
    print("The text contains char 'x'")
}
if ta.containsString(string: "nakin") {
    print("The text contains substring 'nakin'")
}
