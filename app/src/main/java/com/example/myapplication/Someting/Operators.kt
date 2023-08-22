package com.example.myapplication

fun main(){

    /*
            <
            >
            <=
            >=
            == eşit mi değil mi bakar
            != eşit değil mi diye bakar
            && (and) -> eğer bir tarafta false var ise cevap false çıkar
            || (or) -> eğer bir true taraf var ise cevap true çıkar
        */
    val hav1 = ("Yağmurlu")
    val hav2 = ("Yağmurlu")
    if (hav1 == hav2){
        println("Şemsiye aldınmı?(T/F)")
        val soru = readln().toBoolean()
        if (soru){
            println("Islanmadın")
        }
        else{
            println("Islandın")
        }
    }
    else{
        println("Hava güneşli")
    }

}