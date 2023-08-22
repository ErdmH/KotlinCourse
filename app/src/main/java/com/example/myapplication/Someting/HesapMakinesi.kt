package com.example.myapplication

fun main (){
    println("hesap makinesine hoşgeldin")
    println("lütfen numara girin")
    val numara = Integer.valueOf(readln())
    println("lütfen ikinci numarayı girin")
    val numara2 = Integer.valueOf(readln())
    println("toplama için 1'e basın")
    println("çıkarma için 2'ye basın")
    println("çarpma için 3'e basın")
    println("bölme için 4'e basın")
    val secim = readln()
    if(secim=="1"){
        //burası toplama alanı
        println("toplama işlemi sonucu ${numara+numara2}")
    }
    if(secim=="2"){
        //burası çıkarma alanı
        println("çıkartma işlemi sonucu ${numara-numara2}")
    }
    if(secim=="3"){
        //burası çarpma alanı
        println("çarpma işlemi sonucu ${numara*numara2}")
    }
    if(secim=="4"){
        //burası bölme alanı
        println("bölme işlemi sonucu ${numara.toDouble()/numara2.toDouble()}")
    }





}