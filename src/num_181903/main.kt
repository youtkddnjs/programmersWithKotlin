package num_181903

fun main() {
    val q = 3
    val r = 1
    val code = "qjnwezgrpirldywt"
    var answer = ""
    for ( i in code.indices){
        if( i % q == r){
            answer += code[i]

        }
    }
    println(answer)
}