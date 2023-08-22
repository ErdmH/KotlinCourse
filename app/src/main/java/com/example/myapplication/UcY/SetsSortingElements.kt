package com.example.myapplication.UcY

fun main() {
    val theSet = setOf(10, 20, 30, 31, 40, 50, -1, 0)
    var resultSet = theSet.sorted()
    println(resultSet)

    resultSet = theSet.sortedDescending()
    println(resultSet)
}