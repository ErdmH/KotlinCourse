abstract class Animal{
    abstract fun makeSound()
}

class Tiger : Animal(){
    override fun makeSound() {
        println("Tiger: Mamamia")
    }
}
class Lion : Animal() {
    override fun makeSound() {
        println("Lion: Roar")
    }
}
class AnimalFactory{
    fun createAnimal(type: String): Animal? {
        return when (type) {
            "Tiger" -> Tiger()
            "Lion" -> Lion()
            else -> null
        }
    }
}
fun main() {
    var animalFactory = AnimalFactory()
    val userInput = "Tiger"
    println("Type of animal (Tiger or Lion): $userInput")

    var animal = animalFactory.createAnimal(userInput.orEmpty())
    animal?.makeSound()
}