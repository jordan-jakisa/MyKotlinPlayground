/** extension functions - defined for specific data types like Int, String
 * they are used to extend the functionality of specific classes using custom user defined functions
 * examples include: toString(), toInt(), map() **/
fun Int.square(): Int = this * this

fun main(){
    println("${3.square()}")
}