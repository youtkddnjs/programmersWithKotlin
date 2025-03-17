package num_181853

fun main() {
    val num_list = arrayListOf(12, 4, 15, 46, 38, 1, 14)
    val answer = num_list.sorted().slice(0..4)

    println(answer.joinToString())
}