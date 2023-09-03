package com.example.myapplication.exercise.arrayexercise

fun main(){
    var x = arrayListOf<Int>(1,2,8,9,5,56,5656,5,898,5,0,0,-1,5959,565,6,5,65,65,65)
    var y = arrayListOf<Int>()
    var z = 0
    var q = 0
    for (n in x){
        if (n == 0 || n == -1){
            y.add(n)
        }
    }
    for (n in y){
        if (n == -1){
            z = 1
        }
        if (n == 0){
            q = 1
        }
    }
    if (z == 1 && q == 1){
        println(true)
    }else{
        println(false)
    }
}