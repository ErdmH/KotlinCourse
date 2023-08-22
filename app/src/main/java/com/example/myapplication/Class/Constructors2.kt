package com.example.myapplication.Class

/*
class Person (val _name: String, val _age: Int=20) {
    var name: String
    var age: Int

    init {
        this.name = _name
        this.age = _age
        println("Name = $name")
        println("Age = $age")
    }
}

fun main() {
    val zara = Person("Zara")
    val nuha = Person("Nuha", 11)
}*/
class Person{
    var name: String
    var age: Int
    var salary:Double

    constructor ( _name: String, _age: Int) {
        this.name = _name
        this.age = _age
        this.salary = 0.00
        println("Name = $name")
        println("Age = $age")
    }

    constructor ( _name: String, _age: Int, _salary: Double) {
        this.name = _name
        this.age = _age
        this.salary = _salary
        println("Name = $name")
        println("Age = $age")
        println("Salary = $salary")
    }
}

fun main() {
    val nuha = Person("Nuha", 12)
    val zara = Person("Zara", 20, 2000.00)
}