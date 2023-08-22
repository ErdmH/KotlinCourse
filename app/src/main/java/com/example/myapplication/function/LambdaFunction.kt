package com.example.myapplication.function

fun main(){
    var sum = {x:Int, y:Int ->
        x*y
    }
    println(sum(10,5))
}