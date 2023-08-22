package com.example.myapplication.UcY

fun main() {
    val theMap = mapOf("one" to 1, "two" to 2, "three" to 3)
    val resultMap = theMap.map{ (k, v) -> "Key is $k, Value is $v" }

    println(resultMap)
}