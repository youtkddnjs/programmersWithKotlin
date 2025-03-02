package num_181872

fun main() {
    val myString = "AbCdEFG"
    val pat = "dE"

    var answer = myString.substring(0,myString.indexOf(pat)+pat.length)

    println(myString.indexOf(pat))

}