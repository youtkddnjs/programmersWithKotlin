package num_181943

fun main() {

    val my_string: String = "He11oWor1d"
    val overwrite_string: String = "lloWorl"
    val s: Int = 2
//"He11oWor1d"	"lloWorl"	2	"HelloWorld"
    var answer: String = ""

    answer += my_string.substring( 0 until s )
    answer += overwrite_string
    answer += my_string.substring( overwrite_string.length + s )

    println(answer)
}