package com.example.myapplication.exercise

fun main(){
    var sifre = readln()
    var hak = 3
    while (hak >= 1){
        println("şifre ne?")
        var deneme = readln()
        if(deneme == sifre){
            println("doğru girdin")
            break
        }else{
            println("yanlış girdin hakkın = ${hak-1}")
            hak -= 1
        }
        if(hak == 0){
            println("tüm hakkınız bitti")
            break
        }
    }
}