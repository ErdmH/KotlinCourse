package com.example.myapplication.exercise

fun main(){
 ha(c = "orgjı")
}
fun ha(c:String = "owadfo") {
    var f = (0)
    for (i in c) {
        if (c[i.code].equals("o")) {
            f++
        }
        println(f)
    }
    println(f)
}

