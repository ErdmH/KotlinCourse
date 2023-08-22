package com.example.myapplication.function

/*
fun main() {

    val sum = func(10)
    println("10 + 20: ${sum(20)}")

}

fun func(num: Int): (Int) -> Int = {nu -> nu + num}*/
fun main(){
    fum("Hi",::fam)
}
fun fum(str:String,myfun: (String) -> Unit){
    print("Hello")
    myfun(str)
}
fun fam(str: String){
    println(" $str")
}