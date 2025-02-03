package num_181895

fun main() {
    val arr = arrayOf( 1,2,3,4,5)
    val intervals = arrayOf(
        arrayOf(1,3),
        arrayOf(0,4)
    )
    var answer : IntArray = intArrayOf()

    for ( i in intervals){
        answer = answer.plus(arr.slice( i[0] .. i[1] ))
    }

    println(answer.joinToString())

}