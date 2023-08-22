package com.example.myapplication.loops

fun main(){
    var puan = 0
    while (true){
            var read = (1..10).random().toDouble()
        println("${read} sayısının karesi nedir")
        var cevap = readln().toDouble()
        if (cevap == Math.pow(read,2.0)){
            println("başardın")
            puan++
        }else{
            println("yanlış bildin cevap ${Math.pow(read,2.0)}")
            puan--
        }
        println("çıkmak için -1'e basın devam etmek için 0'a basın")
        var cik = readln().toInt()
        if (cik == -1){
            println("Oyun bitti")
            println("puanın ${puan}")
            break
        }else{
            continue
        }
    }










}