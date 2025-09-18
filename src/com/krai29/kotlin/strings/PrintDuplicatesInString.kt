package com.krai29.kotlin.strings

fun main() {
    val s1 = "programming"
    println(duplicatesInString(s1))
}

fun duplicatesInString(s1: String) : Set<Char>{
    val seen = mutableSetOf<Char>()
    val duplicates = mutableSetOf<Char>()
    for (char in s1){
        if (!seen.add(char)){
            duplicates.add(char)
        }
    }
    return duplicates
}
