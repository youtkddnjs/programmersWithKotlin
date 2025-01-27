package num_181901

fun main() {
    val n = 10
    val k = 3
    var answer: IntArray = intArrayOf()

    for ( i in 1 until n ) {
        if( i % k ==0 ){
            answer = answer.plus(i)
        }
    }
    println(answer.joinToString())
}