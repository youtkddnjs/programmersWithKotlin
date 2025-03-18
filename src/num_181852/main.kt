package num_181852

fun main() {
    val num_list = listOf(12, 4, 15, 46, 38, 1, 14, 56, 32, 10)
    val answer = num_list.sorted().slice( 5 .. num_list.size - 1 )
    println(answer.joinToString())
}