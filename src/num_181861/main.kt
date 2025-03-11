package num_181861

fun main() {
    val arr = arrayOf(5, 1, 4)
    val answer = mutableListOf<Int>()
    for (i in arr) {
        for ( j in 1..i) {
            answer.add(i)
        }
    }

    println(answer.joinToString())
}