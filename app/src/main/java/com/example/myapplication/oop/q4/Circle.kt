package com.example.myapplication.oop.q4

class Circle {
    private var radius: Double = 1.0
    fun getRadius(): Double{
        return radius
    }
    fun setRadius(s: Double){
        radius = s
    }
    fun calculateArea():Double{
        return 2.0*radius*3.14
    }
}
