data class Cities(val name: String, val location: String, val address: Int)

val listOfCities = listOf(
    Cities("Kampala", "Uganda", 1200),
    Cities("Arua", "Uganda", 123002),
    Cities("Nairobi", "Kenya", 23000),
    Cities("Dar Es Sallam", "Tanzania", 30023)
)
fun main(){
    val list = listOfCities.groupBy { it.location }
    val ugandan = list["Uganda"]
    if (ugandan != null) {
        for (i in ugandan) println(i.name)
    }
}