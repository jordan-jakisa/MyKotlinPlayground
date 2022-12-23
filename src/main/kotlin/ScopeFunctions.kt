/** Scope functions **/

class Methods{
    fun firstMethod(){
        println("First Method")
    }
    fun secondMethod(){
        println("Second Method")
    }
    fun thirdMethod(){
        println("Third Method")
    }

    fun fourthMethod(name: String){
        println("Name: $name")
    }
}

fun main(){
    val methods = Methods()
    /** apply **/
    /** called when we need to call multiple instances of an object **/
    methods.apply {
        firstMethod()
        secondMethod()
    }

    /**let - used to execute one or more functions on result of call chains **/
    methods.let {
        it.firstMethod()
        //getAge(it)
    }

    /** with - call multiple methods on the same object **/
    with(methods){
        firstMethod()
        secondMethod()
        //getAge(this)
    }

    /** run - to do object initialization and some computation on the return value **/
    val method = Methods().run {
        val name = "John Doe"
        fourthMethod(name)
    }

    /** also - actions that need a reference to the object rather than to its properties and funtions **/
    val numbers = mutableListOf("One", "Two", "Three")
     numbers.also {
         println("Other numbers before adding four: $it")
     }.add("Four")
}

