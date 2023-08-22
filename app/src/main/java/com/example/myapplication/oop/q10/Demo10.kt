package com.example.myapplication.oop.q10

fun main(){
    var tAli = Teacher("Ali")
    var tMehmet = Teacher("Memo")
    var teacherList = ArrayList<Teacher>()
    teacherList.add(tAli)
    teacherList.add(tMehmet)
    var cKimyaE = Course(tAli, "Kimya")
    var cFizikE = Course(tMehmet, "Fizik")
    var cKimyaT = Course(tAli, "Kimya")
    var cFizikT = Course(tMehmet, "Fizik")
    var course = ArrayList<Course>()
    course.add(cKimyaE)
    course.add(cFizikE)
    var course2 = ArrayList<Course>()
    course2.add(cKimyaT)
    course2.add(cFizikT)
    var sErdem = Student("Erdem", 8, course)
    var sTarik = Student("Tarik", 8, course2)
    var studentList = ArrayList<Student>()
    studentList.add(sErdem)
    studentList.add(sTarik)
    var oguzKaan = School("Oguzkaan", teacherList, studentList)
    println("Oğuzkaan kolejine hoşgeldiniz")
    println("Okulda ${teacherList.size} öğretmen, ${studentList.size} öğrenci ve ${course.size} adet kurs vardır")
    println("Hangi sınavı yapmak istersiniz?")
    println("Kimya için 1 ve Fizik için 2")
    var cSecim = readln().toInt()
    when (cSecim){
        1 -> {
            println("Kimya dersine hoşgeldiniz")
            println("Kimya dersinin hocası ${cKimyaE.teacher.getTeacherName()}")
            printStudentList(studentList)
            for (student in studentList){
                println("${student.name} isimli öğrencinin Kimya notunu girin")
                var studentGrade = readln().toInt()
                for (coursee in student.courses){
                    if (coursee.topic == cKimyaE.topic){
                        coursee.setGradee(studentGrade)
                    }
                }
            }
        }
        2 -> {
            println("Fizik dersine hoşgeldiniz")
            println("Fizik dersinin hocası ${cFizikE.teacher.getTeacherName()}")
            printStudentList(studentList)
            for (student in studentList){
                println("${student.name} isimli öğrencinin Fizik notunu girin")
                var studentGrade = readln().toInt()
                for (course in student.courses){
                    if (course.topic == cFizikE.topic){
                        course.setGradee(studentGrade)
                    }
                }
            }
        }
    }
    printGrade(studentList)
}
fun printStudentList(studentList: ArrayList<Student>){
    var x = 1
    for (n in studentList){
        println("${n.name} = öğrenci ${x}")
        x++
    }
}
fun printGrade(studentList: ArrayList<Student>){
    for (student in studentList){
            for (course in student.courses){
                if (course.grade != 0) {
                    println("${student.name} isimli öğrencinin ${course.topic} dersinin notu ${course.grade}")
                }else{
                    println("${student.name} isimli öğrencinin ${course.topic} dersinin notu girilmedi")
                }
            }
    }
}