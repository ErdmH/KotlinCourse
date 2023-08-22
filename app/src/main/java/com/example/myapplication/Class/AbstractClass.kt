package com.example.myapplication.Class

abstract class Student4(name: String, age: Int){
    init {
        println("Student name is: $name")
        println("Student age is: $age")
    }
    fun demo(){
        println("Non-abstract function of abstract class")
    }
    abstract fun func(message: String)
}
abstract class Student5(name: String, age: Int){
    init {
        println("Student name is: $name")
        println("Student age is: $age")
    }
    fun demo(){
        println("Non-abstract function of abstract class")
    }
    abstract fun func(message: String)
}
class College2(name: String, age: Int): Student4(name, age){

    override fun func(message: String) {
        println(message)
    }
}
fun main(){
    val obj = College2("Chaitanya",31)
    obj.func("I'm a Blogger")
    obj.demo()
}