package num_181857

fun main() {
//    val arr = arrayOf(1, 2, 3, 4, 5, 6)
    val arr = arrayOf(58, 172, 746, 89)
    val n = 1

    var squareNum = 0



    var answer = mutableListOf<Int>()
    var square = 1
    answer.addAll(arr)
    while(true){
        if(arr.size == square || arr.size < square) break
        println("$square")
        square *= 2
    }
    for( i in 1..(square - arr.size)){
        answer.add(0)
    }

    println(answer.joinToString())

}