package com.example.myapplication.exercise

fun main(){
    println("boyutu kaç")
    var x = readln().toInt()
    println("kaç kere tekrar etsin")
    var sayi = readln().toInt()

    while (sayi >= 1){
        for (i in 1..x){
            for (n in (x-1).downTo(i)){
                print(" ")
            }
            for(x in 1..i*2-1){
                print("*")
            }

            println("")

        }
        for (i in (x-1).downTo(1)){
            for (n in 1..(x-i)){
                print(" ")
            }
            for (x in (i*2-1).downTo(1)){
                print("*")
            }
            println("")
        }
        sayi -= 1
    }




}