package com.krai29.kotlin.strings

fun main() {
val str = "ABC"
    println(permutations(str))
}

fun permutations(str: String): List<String> =
    if (str.length <= 1) listOf(str)
    else str.flatMapIndexed { i, ch ->
        permutations(str.removeRange(i, i + 1)).map { ch + it }
    }