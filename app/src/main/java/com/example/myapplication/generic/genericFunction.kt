package com.example.myapplication.generic

fun <T> swap(array: Array<T>) {
    if (array.size != 2){
        println("Olmaz")
    }else {
        println("Before swap: ${array[0]}, ${array[1]}")
        val temp = array[0]
        array[0] = array[1]
        array[1] = temp
        println("After swap: ${array[0]}, ${array[1]}")
    }
}
fun main(){
    val  numbers = arrayOf(5,585)
    swap(numbers)

    val strings = arrayOf("Hello", "World")
    swap(strings)
}