package com.example.myapplication.Class.Interface

/*
interface ExampleInterface {
    var myVar: Int
    fun absMethod():String

    fun hello() {
        println("Hello there")
    }
}
class InterfaceImp : ExampleInterface {
    override var myVar: Int = 25
    override fun absMethod() = "Happy Learning "
}
fun main(){
    val obj = InterfaceImp()
    println("My Variable Value is = ${obj.myVar}")
    print("Calling hello(): ")
    obj.hello()

    print("Message from the Website-- ")
    println(obj.absMethod())
}*/
interface A {
    fun printMe() {
        println("Method of interface A")
    }
}
interface B {
    fun printMeToo(){
        println("I am another Metod from interface B")
    }
}

class multipleInterfaceExample: A, B

fun main(){
    val obj = multipleInterfaceExample()
    obj.printMe()
    obj.printMeToo()
}