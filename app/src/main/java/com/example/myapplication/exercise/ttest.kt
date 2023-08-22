package com.example.myapplication.exercise

//fun main(){
    var arr = arrayOf(1,2,3,4,5,6,7,8,9,10)
    //println("ortalama = ${ort(arr)}")
//}
fun ort(arr:Array<Int>):Double{
    var toplam = 0.0
    var boyut = arr.size.toDouble()
    for(i in arr){
        toplam += i
    }
    var sonuc = toplam / boyut
    return sonuc
}
fun main(){
    var arr1 = arrayOf(1,5,3,4,7,1)
    println(max(arr1))
}
fun max(arr1:Array<Int>):Int{
    var x = arr1[0]
    for (i in arr1){
        if (x <= i){
            x = i
        }
    }
    return x
}