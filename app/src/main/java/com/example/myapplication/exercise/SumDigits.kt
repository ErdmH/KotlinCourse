package com.example.myapplication.exercise

fun main(){
    println("Sayı gir")
    var x = readln().toLong()
    var y = (0).toLong()
    while (x > 0){
        y += x%10
        if (x <= 9){
            print("${x%10} = $y")
        }else{
            print("${x%10} + ")
        }
        x /= 10
    }
}