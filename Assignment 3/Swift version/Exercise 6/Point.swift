//  Created by Sunny Buttar on 2016-12-16.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.

import Foundation

public class Point {
    
    private var x: Int
    private var y: Int
    
    init() {
        x = 0
        y = 0
    }
    
    init(x: Int, y: Int) {
        self.x = x
        self.y = y
    }
    
    public func toString() -> String {
        return "(\(x), \(y))"
    }
    
    public func isEqualTo(p: Point) -> Bool {
        return p.x == self.x && p.y == self.y
    }
    
    public func distanceTo(p: Point) -> Double {
        return sqrt(pow(Double(x - p.x), 2.0) + pow(Double(y - p.y), 2.0))
    }
    
    public func move(x: Int, y: Int) {
        self.x += x
        self.y += y
    }
    
    public func moveTo(x:Int, y:Int) {
        self.x = x
        self.y = y
    }
}
