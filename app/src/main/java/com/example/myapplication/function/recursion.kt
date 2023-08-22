package com.example.myapplication.function

/**
 * recursion loop gibi kullanılır
 * recursion bir metodun içinde aynı metodun bir daha çarılmasıdır
 */
fun main(){
    isim(x = 5)

}
fun isim(x:Int){
    if (x == 0){
        return
    }else{
        println(x)
        isim(x-1)
    }
}