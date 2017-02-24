//  Created by Sarpreet Singh on 2016-12-17.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

let stack = MyStack()

print("Is empty: \(stack.isEmpty())")
print("Size: \(stack.size())")
for i in 1...5 {
    stack.push(element: i)
}
print("Is empty: \(stack.isEmpty())")
print("Size: \(stack.size())")

for i in 1...5 {
    print("Peek: \(try stack.peek())")
    print("Pop: \(try stack.pop())")
}
print("Is empty: \(stack.isEmpty())")
print("Size: \(stack.size())")
