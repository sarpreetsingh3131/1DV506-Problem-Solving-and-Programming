//
//  main.swift
//  Temp
//
//  Created by Sarpreet Singh on 2016-12-15.
//  Copyright © 2016 Sarpreet Singh. All rights reserved.
//

import Foundation

class Arrays {

    static func sum(arr: Array<Int>) -> Int{
        var sum: Int = 0
        for i in arr {
            sum += i
        }
        return sum
    }

    static func toString(arr: Array<Int>) -> String {
        var str: String = "["
        for index in 0..<arr.count - 1 {
            str += "\(arr[index]) ,"
        }
        str += "\(arr[arr.count - 1])]"
        return str
    }

    static func addN(arr: Array<Int>, n: Int) -> Array<Int> {
        var array = arr
        for index in 0..<array.count {
            array[index] += n
        }
        return array
    }

    static func reverse(arr: Array<Int>) -> Array<Int> {
        var array = arr
        for index in stride(from: array.count - 1, through: 0, by: -1) {
            array[array.count - 1 - index] = arr[index]
        }
        return array
    }

    static func hasN(arr: Array<Int>, n: Int) -> Bool {
        for item in arr {
            if item == n {
                return true
            }
        }
        return false
    }

    static func replaceAll(arr: inout Array<Int>, old: Int, nw: Int) {
        for i in 0..<arr.count {
            if arr[i] == old {
                arr[i] = nw
            }
        }
    }

    static func sort(arr: Array<Int>) -> Array<Int> {
        var array = arr
        for _ in 0..<array.count {
            for j in 0..<array.count - 1 {
                if array[j] > array[j + 1] {
                    let temp = array[j]
                    array[j] = array[j + 1]
                    array[j + 1] = temp
                }
            }
        }
        return array
    }

    static func hasSubsequence(arr: Array<Int>, sub: Array<Int>) -> Bool {
        for var i in 0..<arr.count {
            if arr[i] == sub[0] {
                for j in 0..<sub.count {
                    if i < arr.count {
                        if arr[i] != sub[j] {
                            break
                        }
                        else if arr[i] == sub [j] && j == sub.count - 1 {
                            return true
                        }
                    }
                    i += 1
                }
            }
        }
        return false
    }
}
print("Sum: \(Arrays.sum(arr: [1,2,3]))")
print("To String: \(Arrays.toString(arr: [1,2,3]))")
print("Reverse: \(Arrays.toString(arr: Arrays.reverse(arr: [3,2,1])))")
var a:[Int] = [1,2,3,4]
Arrays.replaceAll(arr: &a, old: 1, nw: 100)
print("To String: \(Arrays.toString(arr: a))")
print("Sort: \(Arrays.toString(arr: Arrays.sort(arr: [4,3,7,5,0,1])))")
print("Has subsequence: \(Arrays.hasSubsequence(arr: [1,2,3,4,5], sub: [3,4,5]))")
