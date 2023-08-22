package com.example.myapplication.exercise.functionExercise

fun main(){
    birikiucdort()
}
fun birikiucdort(){
    var num = readln().toInt()
    fun square(num: Int): Int {
        return num*num
    }
    println(square(num))
}