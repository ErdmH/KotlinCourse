package com.example.myapplication.exercise

fun main(){
    num(x = 4)
}
fun num(x:Int){
    var s = 1
    for (i in 1..x){
        s *= i
    }
    println(s)
}