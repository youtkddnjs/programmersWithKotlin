package num_181898

fun main() {
    val arr = arrayOf(1,1,1,1,0)
    var idx = 3
    var answer = -1
    for ( i in arr.indices ){
        if( idx > arr.size -1 ) break
        if ( arr[idx] == 1 ){
            answer = idx
            break
        }else{
            idx++
        }
    }

    println(answer)
}