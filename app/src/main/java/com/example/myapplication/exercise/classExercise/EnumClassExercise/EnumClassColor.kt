package com.example.myapplication.exercise.classExercise.EnumClassExercise

enum class EnumColor{
    SARI,MAVI,YESIL
}
data class Object(val name: String, val color: EnumColor)
fun main(){
    var plants = Object("Plants", EnumColor.YESIL)
    var cloud = Object("Cloud", EnumColor.MAVI)
    var flower = Object("Flowers", EnumColor.SARI)

    println("${plants.name} color: ${plants.color}")
    println("${cloud.name} color: ${cloud.color}")
    println("${flower.name} color: ${flower.color}")
    /*println("1 -> Sarı  2 -> Mavi  3 -> Yeşil")
    var readl = readln().toInt()
    when(readl){
        1 -> {
            println("${EnumColor.SARI} rengini seçtin")
        }
        2 -> {
            println("${EnumColor.MAVI} rengini seçtin")
        }
        3 -> {
            println("${EnumColor.YESIL} rengini seçtin")
        }
    }*/

}