package com.example.myapplication.exercise

fun main(){
    var number1 = 1..20
    var number = number1.random()
    println("I made a number number try to find it I will say to high or to low")
    while (true){
        var read = readln().toInt()
        if (read < number){
            println("To low")
        }else if (read > number){
            println("To high")
        }else{
            println("You won")
            break
        }
    }
}