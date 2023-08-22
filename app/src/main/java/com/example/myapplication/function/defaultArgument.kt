package com.example.myapplication.function

fun main(){
    default(x = 100,y = 'E')
}
fun default(x:Int = 10,y:Char = 'A'){
   println(x)
   println(y)
}