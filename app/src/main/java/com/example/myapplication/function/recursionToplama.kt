package com.example.myapplication.function

fun main(){
   var toplam = toplama(x = 3)
    println(toplam)
}
fun toplama(x:Int):Int{
    if(x == 0){
        return 0
    }else{
        return x+ toplama(x-1)
    }
}