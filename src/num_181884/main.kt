package num_181884

fun main() {
    val numbers = arrayOf(34, 5, 71, 29, 100, 34)
    val n = 123

    var sum = 0
    for (i in numbers) {
        sum += i
        if ( sum > n ) break
    }

    println(sum)
}