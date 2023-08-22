package com.example.myapplication

fun main() {

    var hafta = arrayOf("Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar")
    for (n in hafta.indices) {
        println("Haftanın ${n + 1}'inci günü = ${hafta[n]}")
    }


    while (true) {
            println("lütfen bir gün girin veya bittirmek için 0'a basın")
            var gun = readln()
            when (gun) {
            "pazartesi" -> {
                println("Bugün günlerden ${gun}")
            }

            "salı" -> {
                println("Bugün günlerden ${gun}")
            }

            "çarşamba" -> {
                println("Bugün günlerden ${gun}")
            }

            "perşembe" -> {
                println("Bugün günlerden ${gun}")
            }

            "cuma" -> {
                println("Bugün günlerden ${gun}")

            }

            "0" -> {
                break
            }

            else -> println("Hatta")

        }
    }
}
