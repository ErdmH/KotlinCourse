package com.example.myapplication.exercise

fun main() {
    var Str = readln().toLowerCase()
    println(palindrome(Str))
}
fun palindrome(re: String):Boolean{
    var final = ""
    for (n in (re.length-1).downTo(0)){
        final+=re[n]
    }
    return re == final
}