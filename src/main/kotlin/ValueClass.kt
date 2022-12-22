import com.sun.tools.javac.Main

/** value class can only take one primitive type **/
@JvmInline
value class Password(val field: Int)
@JvmInline
value class UId(val field: Int)

val a = Password(3)
val b = UId(5)

fun auth(userId: Password, pin: UId) {}

fun main(){
    /**right**/
    println(auth(a, b))

    /**reverse
     * compilation error **/
    //println(auth(b, a))

}