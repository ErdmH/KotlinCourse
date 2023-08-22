package com.example.myapplication.oop.q7

fun main(){
    var fibaBank = Bank()
    var account1 = Account("Erdem", "Kucuk", 12345, "Dollar", 2000.0)
    var account2 = Account("Tarık", "Keskin", 123456, "Dollar", 5000.0)
    var account3 = Account("Mert", "Yıldırım", 1234567, "TL", 1.0)
    fibaBank.addCustomer(account1)
    fibaBank.addCustomer(account2)
    fibaBank.addCustomer(account3)
    println("Tc gir yoksa bankaya girme")
    var gtc = readln().toInt()
    var secilenHesap = Account("", "", 0, "", 0.0)
    var f = false
    for (n in fibaBank.customers){
        if (gtc == n.tc){
            secilenHesap = n
            println("Hoşgeldin ${n.name}")
            f = true
        }
    }
    if (f == false){
        println("Hesap yok")
    }
    while (f == true){
        printMenu()
        var sayi = readln().toInt()
        when (sayi){
            1 -> {
                println("Kaç para yüklemek istioyorsun")
                var addm = readln().toDouble()
                fibaBank.addMoney(secilenHesap, addm)

            }
            2 -> {
                println("Kaç para çekmek istioyorsun")
                var deletem = readln().toDouble()
                fibaBank.deleteMoney(secilenHesap, deletem)
            }
            3 -> {
                println("bakiyeniz = ${secilenHesap.bakiye}")
            }
            4 ->  {
                println("Hoşçakal")
                break
            }
        }
    }
}
fun printMenu(){
    println("Para yatırmak için 1")
    println("Para çekmek için 2")
    println("Bakiye görüntüleme 3")
    println("Çıkmak için 4")

}