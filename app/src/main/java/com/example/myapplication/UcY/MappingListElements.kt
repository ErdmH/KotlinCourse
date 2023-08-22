package com.example.myapplication.UcY

fun main(){
    val theList = listOf(10, 12, 30, 31, 40, 9, -3, 0)
    val resultList = theList.map{ it / 3 }

    println(resultList)
}