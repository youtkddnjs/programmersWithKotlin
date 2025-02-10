package num_181888

fun main() {
    val num_list = arrayOf(4, 2, 6, 1, 7, 6)
    val n = 2
    var answer: IntArray = intArrayOf()
    var num = n

    answer = answer.plus(num_list[0])
    for ( i in num_list.indices) {
        if( i  == num){
            answer = answer.plus(num_list[i])
            num += num
        }
    }

    println(answer.joinToString())
}