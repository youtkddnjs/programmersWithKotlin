package num_181891

fun main() {
    val num_list = arrayOf(2,1,6)
    val n = 1

    var answer: IntArray = intArrayOf()

    answer = answer.plus(num_list.slice(n..num_list.lastIndex))
    answer = answer.plus(num_list.slice(0..n-1))

    println(answer)
}
