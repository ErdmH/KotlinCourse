package com.example.myapplication.exercise.functionExercise

fun main(){
    println(1584 numIsDivisibleBy 8)
}
infix fun Int.numIsDivisibleBy(x:Int): Boolean {
    return this%x == 0
}