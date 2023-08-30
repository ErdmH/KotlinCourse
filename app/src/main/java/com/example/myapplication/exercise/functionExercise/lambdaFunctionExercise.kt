package com.example.myapplication.exercise.functionExercise

fun main(){
    var lamba = {list:ArrayList<String> ->
        var arrK = ArrayList<String>()
        for (arr in list){
            if (arr[0].toLowerCase() == 'k'){
                arrK.add(arr)
            }
        }
        arrK
    }
    var arr = ArrayList<String>()
    arr.add("Hello")
    arr.add("Karen")
    arr.add("What")
    println(lamba(arr))
}