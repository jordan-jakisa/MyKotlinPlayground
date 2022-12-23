/** function with default parameters **/
fun add(a: Int, b: Int = 2): Int{
    return a + b
}

fun main(){
    println("Sum: ${add(2, 3)}")
    /** add called without supplying a value for parameter b **/
    println("Sum: ${add(3)}")
}