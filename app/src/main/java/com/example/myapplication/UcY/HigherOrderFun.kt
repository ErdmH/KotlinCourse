package com.example.myapplication.UcY

fun main() {

    func("Erdem", ::demo)

}

fun func(str: String, myfunc: (String) -> Unit) {
    print("Welcome to learn Kotlin with ")
    myfunc(str)
}
fun demo(str: String) {
    println(str)
}