import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

suspend fun printNumbers(){
    println("Number: $$$")
}

fun main(){
    /** adding suspend keyword to a function and optionally adding a withContext function in network request
     * Coroutines solve the problems of synchronous programming like ui blocking by long background
     * thread operations. **/
    runBlocking{
        withContext(GlobalScope.coroutineContext){
            printNumbers()
        }
    }
}