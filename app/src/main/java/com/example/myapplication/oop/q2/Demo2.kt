package com.example.myapplication.oop.q2

fun main(){
    var objD = Dog(name = "Foks", breed = "A")
    println(objD.name)
    println(objD.breed)
    objD.name = "Fox"
    objD.breed = "B"
    println(objD.name)
    println(objD.breed)
}
