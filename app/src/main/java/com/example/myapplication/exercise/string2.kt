package com.example.myapplication.exercise

fun main(){

    println("2 tane string gir")
    var str = readln()
    var str1 = readln()
    println("Bu ikisinin son index'ini karşılaştıracağım")
    var strL = str[str.lastIndex]
    var str1L = str1[str1.lastIndex]
    if (strL == str1L){
        println("Son harfler eşit")
    }else{
        println("Son harfler farklı")
    }





}