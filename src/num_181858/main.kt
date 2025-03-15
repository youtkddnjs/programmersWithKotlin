package num_181858

fun main() {
    val arr = arrayOf(0, 1, 1, 1, 1)
    val k = 4
    var answer = mutableListOf<Int>()
    answer.addAll(arr.distinct())

    if ( answer.size < k){
        for ( i in 0 .. k - answer.size - 1){
            answer.add(-1)
        }
    }else {
        answer = answer.slice(0..k-1).toMutableList()
    }

    println(answer.joinToString())
}