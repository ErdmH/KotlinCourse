package com.example.myapplication.exercise.classExercise.OOPExercise.PolymorphismExercise

abstract class Shape(){
    abstract fun printKenar()
}
class Circle() : Shape(){
    override fun printKenar() {
        println("Yuvarlağın kenarı yok sen bilmiyon mu")
    }

}
class Rectangle() : Shape(){
    override fun printKenar() {
        println("Karenin 4 kenarı var")
    }

}
class Triangle() : Shape(){
    override fun printKenar() {
        println("Üçgenin 3 kenarı var")
    }
}
fun shape(x:Int,y:Int,z:Int){
    println("Bu bir üçgen")
}
fun shape(x:Int,y:Int,z:Int,q:Int){
    println("Bu bir kare")
}
fun shape(){
    println("Bu bir yuvarlak ve pizza mammamia")
}

fun main(){
    var Shape = Rectangle()
    Shape.printKenar()
    var Shape2 = Triangle()
    Shape2.printKenar()
    var Shape3 = Circle()
    Shape3.printKenar()
    shape(1,1,1,1)
    shape(1,1,1)
    shape()

}