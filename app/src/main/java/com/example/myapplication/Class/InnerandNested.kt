package com.example.myapplication.Class
/**
Kotlin Nested Class bir classın içinde bir class oluşturur ve
fuctionlarını ve data memberlarını kullanamaz
 **/
/*fun main() {
    val obj = Outer.Nested()

    print(obj.foo())
}
class Outer {
    var ısım = "Erdem"
    class Nested {
        fun foo() = "Welcome"
    }
}*/

/**
Kotlin Inner Class bis classın içinde br class oluşturur ve
olduğu classın özelliklerini alır
 **/
/*fun main() {
    val obj = Outer().Inner()

    print(obj.foo())
}
class Outer {
    private val welcomeMessage: String = "Welcome"
    inner class Inner {
        fun foo() = welcomeMessage
    }
}*/

/**
Anonymous Inner Class (object ve Interface) birşeye bir özelik atamak
 **/
/*fun main() {
    var programmer = object:Human {
        override fun think() {
            println("I am an example of Anonymous Inner Class ")
        }

        override fun eat() {
            println("I like to eat")
        }

        override fun sleep() {
            println("I want to sleep")
        }
    }
    programmer.think()
    programmer.eat()
    programmer.sleep()
}
interface Human {
    fun think()
    fun eat()
    fun sleep()
}*/
/**
Kotlin Type Aliases data tipine bir isim atamayı sağlar
 **/
typealias User = Triple<String, String, Int>
fun main() {
    val obj = userInfo()

    print(obj)
}

fun userInfo():User{
    return Triple("Zara","Ali",21)
}
