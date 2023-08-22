package com.example.myapplication.function

/**
 * return metdu veya function'u çağardığımız zaman elimize bir değer geçmesini sağlar
 */
fun main(){
var x = toplamaMetodu(10,20)
    println(x)
//isimMetodu(readln())
}
/*
fun isimMetodu(isim:String){
    println("İsminiz $isim")
}*/
fun toplamaMetodu(x:Int,y:Int):Int{
    return x+y
}
