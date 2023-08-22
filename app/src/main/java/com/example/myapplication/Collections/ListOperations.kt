package com.example.myapplication.Collections

fun main(){
    var mylist = listOf(1,2,3,4,5,6,7,8,9,10)
    var mylistF = mylist.filter { it > 5 }     //mylist numabalarının 5 ten büyüklerini alır
    println(mylistF)
    //#############################################
    var mylistD = listOf(1,2,8,9,42,58,78,9)
    var mylistD2 = mylistD.drop(3)   //ilk üç sayıyı atar
    println(mylistD2)
    //#############################################
    var mylistG = listOf(1,2,3,8,9,4,6,7,12,35)
    var mylistG2 = mylistG.groupBy { it%2 }    // mylistG 2 ile bölümünden kalanları guruba ayırır
    println(mylistG2)     //bu bir map data tipidir
    //#############################################
    var mylistM = listOf(1,2,8,9,45,63,12,78,54,657,67)
    var mylistM2 = mylistM.map { it/2 }
    println(mylistM2)
    //#############################################
    var mylistC = listOf(1,2,5,8,9,7,45,632,987,65,32,41,8)
    var mylistC2 = mylistC.chunked(3)      //mylistC'yi 3'er 3'er böler
    println(mylistC2)
    //#############################################
}