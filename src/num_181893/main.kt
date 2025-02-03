package num_181893

fun main() {
    val arr = intArrayOf( 0, 1, 2, 3, 4, 5 )
    val query = intArrayOf( 4, 1, 2)

    var answer = arr
    for ( i in query.indices) {
        println( "$i 번째 ${answer.joinToString()} ")
        if ( i % 2 == 0 ){
            //짝수 인덱스
            answer = answer.sliceArray( 0 .. (query[i]) )
            println( "$i 번째 짝수 ${query[i]} :: ${answer.joinToString()} ")
        }else {
            //홀수 인덱스
            answer = answer.sliceArray((query[i]) .. answer.lastIndex )
            println( "$i 번째 홀수 ${query[i]} :: ${answer.joinToString()} ")
        }
    }

    println( "결과 : ${answer.joinToString()} ")
}