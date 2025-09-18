package com.krai29.kotlin.strings

fun main() {
    val str = "swiss"
    println(firstNonRepeatedChar(str))
}

fun firstNonRepeatedChar(str: String) : Char?{
    val charMap = LinkedHashMap<Char,Int>()
    for (input in str){
        charMap[input] = charMap.getOrDefault(input,0) + 1
    }
    for ((char,count) in charMap){
        if (count == 1){
            return char
        }
    }
    return null
}
