package com.example.myapplication.Class

open class ABC {
    open val count: Int = 0

    open fun think () {
        println("Hey!! i am thinking")
    }
}
class BCD(override val count: Int = 100): ABC(){
    override fun think() {
        println("I am from Child")
    }
    fun displayCount(){
        println("Count value is $count")
    }
}

fun main(){
    var a = BCD(200)
    val b = BCD()
    a.displayCount()
    b.displayCount()
}