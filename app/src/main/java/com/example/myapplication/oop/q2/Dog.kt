package com.example.myapplication.oop.q2

class Dog (name:String, breed:String){
    var name:String = ""
        get() = field
        set(value){
            field = value
        }
    var breed:String = ""
        get() = field
        set(value){
            field = value
        }
    init {
        this.name = name
        this.breed = breed
    }



}