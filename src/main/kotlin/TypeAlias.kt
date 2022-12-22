import java.lang.ArithmeticException
import java.awt.Button as Bt
/** Can also be used to diambiguate classes with similar generic names **/
import java.util.Date as UtilDate
import java.sql.Date as SqlDate
private lateinit var utilDate: UtilDate
private lateinit var sqlDate: SqlDate

/** import alias **/
private lateinit var myButton: Bt

/** Type alias can be used to shorten long type definitions **/
typealias MyHandler = (Int, String) -> Unit
val myHandler: MyHandler = {int, str ->
}

/** can also be used to shorten long class names **/
typealias AE = ArithmeticException
val arithmeticException: AE = ArithmeticException()

class TypeAlias {
}