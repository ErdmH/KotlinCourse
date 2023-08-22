package com.example.myapplication.Class

open class Base {
    open val name:String
    init {
        name = "Base"
    }
    open fun displayName(){
        println("I am in " + this.name)
    }
}
class Child3: Base(){
    override fun displayName(){
        super.displayName()
        println("I am in " + super.name)
    }
}
fun main(){
    var a = Child3()
    a.displayName()
}