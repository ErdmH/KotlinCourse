package com.example.myapplication.exercise

fun main() {
    var x = readln().toInt()
    /*for (i in 1..x){
        for (n in (x-1).downTo(i)){
            print(" ")
        }
        for(x in 1..i*2-1){
            print(i)
        }

        println("")

    }*/
    for (i in 1..x) {
        for (n in (x - 1).downTo(i)) {
            print(" ")
        }
        for (x in i.downTo(1)){
            print(x)
        }
        for (y in 2..i){
            print(y)
        }

        println("")
    }
}