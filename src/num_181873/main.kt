package num_181873

fun main() {
    val myString = "programmers"
    val alp = "p"

    var answer = ""

    for ( c in myString) {
        if ( c.toString() == alp){
            answer += c.uppercase()
        }else {
            answer += c
        }
    }
    println(answer)
}