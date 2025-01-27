package num_181905

fun main() {
    val my_string = "Progra21Sremm3"
    val s = 6
    val e = 12

    var sub_string = my_string.substring(s, e+1)
    println(sub_string)
    var reversed_string = sub_string.reversed()
    println(reversed_string)
    var result = my_string.replaceRange(s,e+1,reversed_string)
    println(result)
}