package com.example.myapplication.exercise

fun main(){
    println("lütfen 5 adet sayı giriniz")
    val list = mutableListOf<Int>()
    for(i in 1..5){
        list.add(readln().toInt())
    }
    println(calculateAverage(list))
}
fun calculateAverage(list: MutableList<Int>):Int{
    var all = 0
    val sayi = list.size
    for (n in 0..sayi-1){
        all += list[n]
    }
    val sonuc = all / sayi
    return sonuc
}