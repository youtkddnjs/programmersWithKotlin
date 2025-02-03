package num_181899

fun main() {
    val start_num = 10
    val end_num = 3
    var answer: IntArray = intArrayOf()
    for (i in start_num downTo end_num) {
        answer = answer.plus(i)
    }
    println(answer.joinToString())
}