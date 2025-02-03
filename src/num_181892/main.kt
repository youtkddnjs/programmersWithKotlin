package num_181892

fun main() {
    val num_list = arrayOf(5,2,1,7,5)
    val n = 2
    var answer : IntArray = intArrayOf()

    for( i in n - 1 .. num_list.lastIndex){
        answer = answer.plus(num_list[i])
    }
    println(answer.joinToString())
}