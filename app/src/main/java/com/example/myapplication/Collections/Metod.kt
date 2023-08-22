package com.example.myapplication.Collections

fun main() {
    var list = listOf(1,2,7,null,28,null,8)
    var second = list.filterNotNull()
    var filter = second.filter {
        it >5
    }
    println(filter)
}