package com.example.myapplication.Class

class Example {
    var number = 10

    fun calculateSquare(): Int {
        return number*number
    }
}
fun main(){
    val obj = Example()
    println("${obj.number*obj.number}")
}
