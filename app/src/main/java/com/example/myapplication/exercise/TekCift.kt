package com.example.myapplication.exercise

fun main(){
    var arr = arrayOf(1,2,3,4,5,6,7,8,9)
    print("Çift sayılar = ")
    for (n in arr){
        if (n%2==0){
            print("${n} ")
        }

    }
    println(" ")
    print("Tek sayılar = ")
    for (n in arr){
        if (n%2!=0) {
            print("${n} ")
        }
    }
}