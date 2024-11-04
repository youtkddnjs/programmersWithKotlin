package num_181941

fun main() {
    val arr : Array<String> = arrayOf("a","b","c","d","e","f")

    var answer_1 = arr.joinToString("")
    var answer_2 = arr.joinToString("-")
    var answer_3 = arr.joinToString()
    var answer_4 = arr.joinToString(prefix = "<", postfix = ">", separator = "•")
    var answer_5 = arr.joinToString(limit = 5, truncated = "...!")

    println(answer_1)
    println(answer_2)
    println(answer_3)
    println(answer_4)
    println(answer_5)
    println(arr.joinToString(limit = 5, truncated = "...!") { it.uppercase() })

}