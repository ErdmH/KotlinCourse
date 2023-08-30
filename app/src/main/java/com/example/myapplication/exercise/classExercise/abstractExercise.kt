package com.example.myapplication.exercise.classExercise

abstract class Shape(){
    abstract fun calculateArea():Double
}
class Circle :Shape(){
    override fun calculateArea():Double {
        return 3.14*5.0
    }

}
class Rectangle :Shape(){
    override fun calculateArea(): Double {
        return 5.0*5.0
    }

}
fun main(){
    var objCircle = Circle()
    println(objCircle.calculateArea())
    var objRectangle = Rectangle()
    println(objRectangle.calculateArea())
}