package com.example.myapplication.function

/**
 * Infix Function -> tekbaşına kulanılırken bir classın içinde olmak zorundadır
 * eğer class dışında kullanmak istersen extention function ile kullanmalısın
 * sadece bir parametre almak zorundadır
 */
class Infix{
    infix fun myInfixFunction(x:Int): Int {
        return x*x
    }
}

/**
 * Extention Function -> Int, Double, String ve Float gibi data tiplerinin sonuna
 * nokta ile metod veya function yazabilmeni sağlar, istediğin gibi parametre verebilirsin
 */
fun Int.extention(enderx:Int, endery:Int, enderz:Int){
    println(enderx*endery*enderz*this)
}

/**
 * Extention Function ile Infix functionun beraber kullanımı
 */
infix fun Int.extentionInfix(x:Int): Int {
    return this*x
}
fun main(){
    var Infix = Infix()
    println(Infix myInfixFunction 8)
    80.extention(59,87,69)
    println(12 extentionInfix 58)
}