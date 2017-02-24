//  Created by Sunny Buttar on 2016-12-17.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

class MyStack: Stack {
    
    private var stack: [Any]
    
    private enum EmptyError: Error {
        case StackIsEmpty
    }
    
    init() {
       stack = [Any]()
    }
    
    func size() -> Int {
        return stack.count
    }
    
    func isEmpty() -> Bool {
        return stack.isEmpty
    }
    
    func push(element: Any) {
        stack.append(element)
    }
    
    func pop() throws -> Any {
        guard let element = stack.last
        else{
            throw EmptyError.StackIsEmpty
        }
        stack.removeLast()
        return element
    }
    
    func peek() throws -> Any {
        guard let element = stack.first
        else{
            throw EmptyError.StackIsEmpty
        }
        return element
    }
}
