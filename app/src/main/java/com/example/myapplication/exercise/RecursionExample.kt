package com.example.myapplication.exercise

fun main(){
    println("Write a word")
    var x = readln().toString()
    println(size(r = x))
}
fun size(r: String):Int{
    if (r.equals("")){
        return 0
    }else{
        return size(r.substring(1))+1
    }
}