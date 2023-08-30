package com.example.myapplication.exercise.classExercise

inline class Email(val value: String)
 fun sendEmail(email: Email){
     println("Sending email to ${email.value}")
 }
fun main() {
    val email = Email("muhamettinBahriGalatasarayOlan193435345@gmail.com")
    sendEmail(email)
}