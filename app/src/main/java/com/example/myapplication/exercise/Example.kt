package Class



// This class implements X and Y interfaces
abstract class MyClass(xy:Int){
    private var x :Int = 5

    init {
        println(mySetter(xy))
    }

    abstract fun demo()

    fun mySetter(x:Int):Int{
        return myGetter(x)
    }

    fun myGetter(y:Int):Int{
        return y*x
    }

}

class Example(xy:Int):MyClass(xy){
    override fun demo() {
        println("hello")
    }

}

fun main(args: Array<String>) {
    val obj = Example(14)
    obj.demo()

}

