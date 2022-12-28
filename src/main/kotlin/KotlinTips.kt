
/** fill a list without looping **/
val list = DoubleArray(4){ 0.0 }.asList()

/** list where each number is two times greater than the previous **/
val powList = List(5) { it * 2 }

/** using let to check if a value is null **/
val num: Int? = 10
fun main(){
    println("List: $list")
    println("Power List: $powList")
    num?.let {
        println("Num is not null, Its value is $it")
    }
}