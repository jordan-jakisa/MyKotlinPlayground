import kotlinx.coroutines.*
import java.util.Timer
import java.util.TimerTask
import javax.management.timer.TimerMBean

suspend fun printNumbers(){
    println("Number: $$$")
}

class Task: TimerTask() {
    override fun run() {
        println("Task is running")
    }
}

suspend fun main(){
    /** adding suspend keyword to a function and optionally adding a withContext function in network request
     * Coroutines solve the problems of synchronous programming like ui blocking by long background
     * thread operations. **/

    coroutineScope {
        launch {
            /** Runs a statement of code only once **/
            Timer().scheduleAtFixedRate(Task(), 0, 1000)
            println("End")
        }
    }
}