data class Cities(val name: String, val location: String, val address: Int)

val listOfCities = listOf(
    Cities("Kampala", "Uganda", 1200),
    Cities("Nebbi", "Uganda", 123002),
    Cities("Nairobi", "Kenya", 23000),
    Cities("Dar es sallam", "Tanzania", 30023)
)
fun main(){
    val list = listOfCities.groupBy { it.location }
    println("$list")
}