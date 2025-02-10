package num_181889

fun main() {
    val num_list = arrayOf(5, 2, 1, 7, 5)
    val n = 3
    var answer: IntArray = intArrayOf()


    answer = answer.plus(num_list.slice(0 until n ))

    println(answer.joinToString())
}