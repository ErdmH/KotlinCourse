package com.example.myapplication.exercise

fun main(){
    println("Bu tekrardır")
    var num = arrayOf<Int>(1,2,3,4,5,6)
    var num1 = 1
    for (n in num){
        var read = readln().toInt()
        num1 *= read
    }
     println(num1)


}



