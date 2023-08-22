package com.example.myapplication.Class.Interface

/*
interface MyInterface{
    var str: String
    fun demo()

    fun func(){
        println("Hello")
    }
}
class MyClass: MyInterface{
    override var str: String = "Hi"
    override fun demo() {
        println("demo function")
    }
}
fun main(){
    val obj = MyClass()
    obj.demo()
    obj.func()
    println(obj.str)
}*/
/*interface X {
    fun demoX(){
        println("demoX function")
    }
    fun funcX()
}
interface Y {
    fun demoY(){
        println("demoY function")
    }
    fun funcY()
}
class MyClass: X, Y {
    override fun funcX() {
        println("Hello")
    }
    override fun funcY() {
     println("Hi")
    }
}

fun main(){
    val obj = MyClass()
    obj.demoX()
    obj.demoY()
    obj.funcX()
    obj.funcY()
}*/
 interface X {

     fun demo() {
         println("demoX function")
     }
 }
interface Y {
    fun demo(){
        println("demoY function")
    }
}

class MyClass: X, Y {
    override fun demo() {
        super<Y>.demo()
    }
}
fun main(){
    val obj = MyClass()
    obj.demo()
}