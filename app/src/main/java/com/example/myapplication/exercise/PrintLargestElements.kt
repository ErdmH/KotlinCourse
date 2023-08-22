package com.example.myapplication.exercise

fun main(){
    println("sayı girin")
    var sayi = mutableListOf<Int>(1, 4, 17, 7, 25, 3, 100)
    val sizesayi = sayi.size
    val kac = readln().toInt()
    for (n in 1..kac){
        if (n <= sizesayi){
            println(sayi.max())
            sayi.remove(sayi.max())
        }

    }
}