package num_181880

fun main() {

    val num_list = intArrayOf(12, 4, 15, 1, 14)
    var answer: Int = 0
    for (i in num_list) {
        answer += calNum(i)
    }

    println(answer)
}

fun calNum(num:Int): Int {
    var s = num
    var count = 0
    while (s > 1 ){
        if( s % 2 == 0 ){
            count++
            s = s / 2
        }else{
            count++
            s = (s - 1) / 2
        }
    }
    return count
}