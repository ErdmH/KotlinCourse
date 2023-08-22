package com.example.myapplication.function

fun main(){
    var res = factorial(re=3)
    println(res)

}
fun factorial(re: Int):Int{
    if (re == 1){
        return 1
    }else{
        return re * factorial(re-1)
    }

}
