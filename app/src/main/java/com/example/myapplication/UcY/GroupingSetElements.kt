package com.example.myapplication.UcY

fun main() {
    val theSet = setOf(10, 12, 30, 31, 40, 9, -3, 0)
    val resultSet = theSet.groupBy{ it % 3}

    println(resultSet)
}