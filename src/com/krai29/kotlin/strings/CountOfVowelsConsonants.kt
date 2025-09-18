package com.krai29.kotlin.strings

fun main() {
    val str = "abcdA".lowercase()
    val (vowelCount, consonntCount) = getVowelConsonantCount(str)
    println("$vowelCount : $consonntCount")
}

fun getVowelConsonantCount(input: String):Pair<Int, Int>{

    val vowels = setOf('a','e','i','o','u')
    var vowelsCount = 0
    var consonantCount = 0
    for (char in input){
        if (char.isLetter()){
            if (char in vowels){
                vowelsCount++
            } else consonantCount++
        }
    }
    return Pair(vowelsCount,consonantCount)
}