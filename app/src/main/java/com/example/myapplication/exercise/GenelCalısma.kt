package com.example.myapplication.exercise

fun main() {
    var arr = 350..2570

    for (i in arr) {
        print("$i->")
        var number = i
        var toplam = 0
        while (number != 0){
            print("${number%10}")
            if (number >= 10){
                print("+")
            }
            toplam += number%10
            number /= 10
        }
        print(" toplamları = $toplam")
        println()
    }











}
