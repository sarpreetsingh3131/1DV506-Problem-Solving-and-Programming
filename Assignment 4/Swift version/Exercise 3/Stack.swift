//  Created by Sunny Buttar on 2016-12-17.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

protocol Stack {
    
    func size() -> Int
    func isEmpty() -> Bool
    func push(element: Any)
    func pop() throws -> Any
    func peek() throws -> Any
}
