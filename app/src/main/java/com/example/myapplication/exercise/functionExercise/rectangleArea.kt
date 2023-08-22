package com.example.myapplication.exercise.functionExercise

fun main(){
    //println(np(12))
    println(average(9,86,35,7,8,9,5555,8682,26298,52562,66,56586,856,63,52,52,5623,5,3,532,52,5,25252,52,52,52,526,15485))
}
fun average(vararg nums:Int): Int {
    var total = 0
    for(num in nums){
        total += num
    }
    return total/nums.size
}
fun np(num:Int) = num >= 0  //this is single-expression function