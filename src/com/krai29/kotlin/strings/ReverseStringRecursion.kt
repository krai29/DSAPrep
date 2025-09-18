package com.krai29.kotlin.strings

fun main() {
    val str = "Kotlin"
    println(reverseRecursively(str))
}

fun reverseRecursively(str: String): String {
    if (str.isEmpty()){
        return str
    }
    return reverseRecursively(str.substring(1)) + str[0]
}
