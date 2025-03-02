package num_181874

fun main() {
    val myString = "PrOgRaMmErS"


    var answer = ""
    var lowerString = myString.lowercase()
    for ( c in lowerString) {
        if ( c == 'a'){
            answer += c.uppercase()
        }else {
            answer += c
        }
    }
    println(answer)

}