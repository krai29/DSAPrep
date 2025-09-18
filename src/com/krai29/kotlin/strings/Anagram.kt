package com.krai29.kotlin.strings


fun main() {
    val s1 = readln()
    val s2 = readln()
    println(checkAnagramEfficient(s1,s2))
}

fun checkAnagramEfficient(s1: String, s2: String): MutableMap<Char, Int> {
   // if (s1.length != s2.length) return false

    val charCount = mutableMapOf<Char, Int>()

    for (c in s1.replace(" ","").trim()){
        charCount[c] = charCount.getOrDefault(c,0) + 1
    }

//    for (c in s2){
//        charCount[c] = charCount.getOrDefault(c,0) + 1
//    }
    return charCount

}

//fun checkAnagram(s1: String, s2: String): Boolean{
//    if (s1.length != s2.length) return false
//    return (s1.toCharArray().sorted() == s2.toCharArray().sorted())
//}