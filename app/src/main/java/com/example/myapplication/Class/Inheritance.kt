package com.example.myapplication.Class

/*
open class Animal(color: String, age:Int){
    init {
        println("Color is: $color")
        println("Age is: $age")
    }
}
class Dog(color: String, age: Int): Animal(color,age){
    fun woof(){
        println("Dog makes sound of woof")
    }
}
class Cat(color: String, age: Int):Animal(color, age){
    fun meow(){
        println("Cat makes sound of meow")
    }
}
fun main(){
    val d = Dog("Black",4)
    d.woof()
    val c = Cat("White", 1)
    c.meow()
}*/
/*open class Animal(){
    open fun sound(){
        println("Animal makes a sound")
    }
}
class Dog: Animal(){
    override fun sound() {
        println("Dog makes a sound of woof woof")
    }
}
fun main(){
    val d = Dog()
    d.sound()
}*/
/*
open class Animal(){
    open var color: String = "White"
}

class Dog: Animal(){
    override var color: String = "Black"
    fun sound(){
        println("Dog makes a sound of woof woof")
    }
}

fun main(){
    val d = Dog()
    d.sound()
    println(d.color)
}*/
open class Parent() {
    open var num: Int = 100
    open fun demo(){
        println("demo function of parent class")
    }
}

class Child: Parent() {
    override var num: Int = 101
    override fun demo(){
        super.demo()
        println("demo function of child class")
    }
    fun demo2(){
        println(super.num)
    }
}

fun main(){
    val obj = Child()
    obj.demo()
    obj.demo2()
}