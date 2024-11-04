package num_181940

fun main() {
    val k = 3
    val my_string = "hello"
    var answer: String = ""

    answer = my_string.repeat(k)

    for( i in 0..3) {
        answer += my_string
    }

    println(answer)

}