package num_181912

fun main() {
    val intStrs = arrayOf("0123456789","9876543210","9999999999999")
    val k = 50000
    val s = 5
    val l = 5
    var result: IntArray = intArrayOf()

    for( i in intStrs){
        val sliced = i.slice(s..s+l-1)
        val slicedtoInt = sliced.toInt()
        if (slicedtoInt > k ){
            result = result.plus(slicedtoInt)
        }
    }

    println("result : ${result.contentToString()}")

}