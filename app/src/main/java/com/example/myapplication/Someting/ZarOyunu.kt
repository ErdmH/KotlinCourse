package com.example.myapplication

fun main(){

    println("Zar oyununa hoş geldin")
    println("lütfen 1'le 2 arası bir sayı girin")
    var tahmin = readln().toInt()
    var sayi = (1..2)
    var x = sayi.random()
    if (tahmin == x) {
    println("Sayıyı doğru buldun")
    }
    else{
        println("sayıyı yanlış bildin")
        println("çıkan sayı ${x}")
    }


}
