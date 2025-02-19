package num_181883

fun main() {

    val arr = arrayOf(0, 1, 2, 3, 4)
    val queries = arrayOf( //[0, 1],[1, 2],[2, 3]
        arrayOf(0,1),
        arrayOf(1,2),
        arrayOf(2,3)
    )
    var answer: IntArray = intArrayOf()

    for ( qArray in queries){
        var s = qArray[0]
        var e = qArray[1]

        for ( i in s ..  e){
            arr[i] = arr[i] + 1
        }
    }
    answer = answer.plus(arr.toIntArray())
    println(arr.joinToString())

}