package com.example.myapplication.Class

/*
open class Parent2(){
    var num = 100
    private var str = "BeginnersBook"
    protected open val ch = 'A'
    internal val number = 99
    protected open fun demo(){}
}
class Child2: Parent2(){
    override val ch = 'Z'
    override fun demo(){
        println("demo function of child class")
    }
}
fun main(){
    val obj = Parent2()
    val obj2 = Child2()
}*/
/**
 * Private member can not be accessed outside of its scope
 **/
/*
open class A() {
    private val i = 1
    fun doSomething(){
        println("Inside doSomething")
        println("Value of i is $i")
    }
}
class B : A() {
    fun printValue(){
        doSomething()
    }
}
fun main(){
    val a = A()
    val b = B()

    b.printValue()
}*/
/**
 * A protected properties or function
 * is visible to the class itself and it's subclasses only.
 **/
open class A {
    protected val i = 1

    protected fun doSomething(){
        println("Inside doSomething")
        println("Value of i is $i")
    }
}
class B : A() {
    fun printValue(){
        doSomething()
        println("Value of i is $i")
    }
}

fun main(){
    val a = A()
    val b = B()

    b.printValue()
}
