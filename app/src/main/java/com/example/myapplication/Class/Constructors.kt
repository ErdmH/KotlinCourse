package com.example.myapplication.Class

class Constructors(val name: String = "Student", var age: Int = 99) {
    val stuName: String
    var stuAge: Int
    init{
        if(name == "Student") {
            stuName = "NA"
            stuAge = 0
        }
        else {
            stuName = name.toUpperCase()
            stuAge = age
        }
        println("Student Name is: $stuName")
        println("Student Age is: $stuAge")
    }
}
fun main(){
    val stu = Constructors("Chaitanya", 31)
    val stu2 = Constructors("Chaitanya")
    val stu3 = Constructors()
}