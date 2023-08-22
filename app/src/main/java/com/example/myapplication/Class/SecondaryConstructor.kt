package com.example.myapplication.Class

fun main(){
    val stu = Student("Harry", 24)
}

open class College{
    constructor(name: String, age: Int){
        println("Parent class constructor")
        println("Student Name: ${name.toUpperCase()}")
        println("Student Age: $age")
    }
}
class Student: College{
    constructor(name: String, age:Int):super(name, age){
        println("Child class constructor")
        println("Student Name: $name")
        println("Student Age: $age")
    }
}