package com.krai29.kotlin.strings

fun main() {
    val str = "12a"
    println(str.all { it.isDigit() })
}