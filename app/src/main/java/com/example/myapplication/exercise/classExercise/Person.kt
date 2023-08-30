package com.example.myapplication.exercise.classExercise

class Person(name:String, age:Int, country:String) {
    var name:String
    var age:Int
    var country:String
    init {
        this.name = name
        this.age = age
        this.country = country
    }
    fun printInfo(){
        println(name)
        println(age)
        println(country)
    }
}
fun main(){
    var person1 = Person("Erdem",13, "Turkey")
    person1.printInfo()
}