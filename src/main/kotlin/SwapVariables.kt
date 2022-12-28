fun main(){
    var a: Int = 1
    var b = 2

    /** swap variables **/
    println("A = $a, B = $b")
    a = b.also { b = a }

    println("New A = $a")
}