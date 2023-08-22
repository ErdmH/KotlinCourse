package com.example.myapplication.oop.q3

class Rectangle(height:Int, width:Int){
    var height:Int = 0
    var width:Int = 0
    init {
        this.height = height
        this.width = width
    }
    fun alan():Int{
        return height*width
    }
    fun cevre():Int{
        return height+width
    }
}