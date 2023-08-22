package com.example.myapplication.exercise

fun main(){
  var arr = arrayOf<Int>(1,2,3,4,5,6)
    var cift = 0
    var tek = 0
   println("lütfen 6 tane sayı girin")
    for (n in arr){
        println("lütfen ${n}. sayıyı girin")
        var read = readln().toInt()
        if(read%2 == 0){
            cift += read
        }else{
            tek += read
        }
    }
    println("çift sayıların toplamı = ${cift}")
    println("tek sayıların toplamı = ${tek}")


}