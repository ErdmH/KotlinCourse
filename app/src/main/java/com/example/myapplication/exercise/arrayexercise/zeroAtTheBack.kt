package com.example.myapplication.exercise.arrayexercise

fun main(){
    var arr = mutableListOf<Int>(2,0,5,0,1,6,8)
    var sayi = 0
    for (n in arr.indices){
        if(arr[n] == 0){
            sayi += 1
        }
    }
    for (n in 1..sayi){
        arr.remove(0)
        arr.add(0)
    }
    println(arr)

}