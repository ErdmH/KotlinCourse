package com.example.myapplication.exercise

fun main(){
    for (i in 1..5){
        for (n in i..4){
            print(" ")
        }
        for (u in 1..i) {
            print("*")
        }
        println()
    }

}