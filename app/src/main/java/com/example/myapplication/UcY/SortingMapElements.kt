package com.example.myapplication.UcY

fun main() {
    val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    var resultMap = theMap.toSortedMap()
    println(resultMap)
}