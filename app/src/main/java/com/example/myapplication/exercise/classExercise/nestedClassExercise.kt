package com.example.myapplication.exercise.classExercise

class PersonC(phone:Long, eMail:String){
    class ContactInfo(phone: Long, eMail: String){   //nested Class
        var phone:Long
        var eMail:String
        init {
            this.phone = phone
            this.eMail = eMail
        }
        fun printContactInfo(){
            println(phone)
            println(eMail)
        }
    }
}
fun main(){
    var PersonC = PersonC.ContactInfo(1234567, "erdm@gmail.com")
    PersonC.printContactInfo()
}
/*
class PersonC(phone:Long, eMail:String){     //Inner Class
    var phone:Long
    var eMail:String
    init {
        this.phone = phone
        this.eMail = eMail
    }
    inner class ContactInfo{
        fun printContactInfo(){
            println(phone)
            println(eMail)
        }
    }
}
fun main(){
    var PersonC = PersonC(123456,"erdm@gmail.com").ContactInfo()
    PersonC.printContactInfo()
}*/
