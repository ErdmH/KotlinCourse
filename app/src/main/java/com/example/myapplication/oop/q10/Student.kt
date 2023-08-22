package com.example.myapplication.oop.q10

class Student(name:String, grade:Int, courses:ArrayList<Course>) {
    var name:String
    var grade:Int
    var courses:ArrayList<Course>
    init {
        this.name = name
        this.grade = grade
        this.courses = courses
    }
}
class Course(teacher:Teacher, topic:String){
    var teacher:Teacher
    var topic: String
    var grade: Int = 0
    init {
        this.teacher = teacher
        this.topic = topic
    }
    fun setGradee(grade: Int){
        this.grade = grade
    }
    fun getGradee(): Int {
        return this.grade
    }
}
class Teacher(name:String,){
    private var name: String
    init {
        this.name = name
    }
    fun getTeacherName(): String {
        return name
    }
}
class School(name:String, teacherList:ArrayList<Teacher>,studentList:ArrayList<Student>){
    var name: String
    var teacherList: ArrayList<Teacher>
    var studentList: ArrayList<Student>
    init {
        this.name = name
        this.teacherList = teacherList
        this.studentList = studentList
    }
}