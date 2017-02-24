//
//  main.swift
//  Temp
//
//  Created by Sarpreet Singh on 2016-12-16.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

var p1 = Point()
var p2 = Point(x: 3,y: 4)

print(p1.toString())
print(p2.toString())

if p1.isEqualTo(p: p2) {
    print("The two points are equal")
}

let distance = p1.distanceTo(p: p2)
print("Point Distance: \(distance)")

p2.move(x: 5, y: -2)
p1.moveTo(x: 8, y: 2)

if p1.isEqualTo(p: p2) {
    print("The two points are equal")
}
