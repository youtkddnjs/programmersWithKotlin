package num_181904

fun main() {
    val my_string = "ihrhbakrfpndopljhygc"
    val m = 4
    val c = 2
    var printString = ""
    var answer = ""
    for ( i in 0 .. my_string.length -1 ){
        printString = printString + my_string[i]
        if ( (i+1) % m == 0) {
            println( "$printString")
            answer += printString[c-1]
            printString = ""
        }
    }
    println("")
    println(answer)
}