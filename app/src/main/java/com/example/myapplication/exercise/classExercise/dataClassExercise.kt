package com.example.myapplication.exercise.classExercise

data class Point(
    var x:Int,
    var y:Int
)
fun main(){
    var point = Point(6,8)
    var point2 = point.copy(y = 10)
    println(point2)
}