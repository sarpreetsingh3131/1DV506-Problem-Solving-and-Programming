//  Created by Sunny Buttar on 2016-12-16.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.

import Foundation

public class TextAnalyzer {
    
    private var text: String
    
    init(text: String) {
        self.text = text
    }
    
    public func charCount() -> Int {
        return text.characters.count
    }
    
    public func upperCaseCount() -> Int {
        var count = 0
        for char in text.unicodeScalars {
            if char.value >= 65 && char.value <= 90 {
                count += 1
            }
        }
        return count
    }
    
    public func whitespaceCount() -> Int {
        var count = 0
        for char in text.characters {
            if char == " "{
                count += 1
            }
        }
        return count
    }
    
    public func digitCount() -> Int {
        var count = 0
        for char in text.unicodeScalars {
            if char.value >= 48 && char.value <= 57 {
                count += 1
            }
        }
        return count
    }
 
    public func containsChar(char: Character) -> Bool {
        return text.contains(String(char))
    }
    
    public func containsString(string: String) -> Bool {
        return text.contains(string)
    }
}
