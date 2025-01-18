package num_181918

fun main() {
    val arr = intArrayOf(1, 4, 2, 5, 3)
    var stk: IntArray = intArrayOf()
    var i = 0

    while( i < arr.size){
        if ( stk.size == 0 ){
            stk = stk.plus(arr[i])
            i += 1
        } else if (stk.last() < arr[i]){
            stk = stk.plus(arr[i])
            i += 1
        } else {
            stk = stk.dropLast(1).toIntArray()
        }
    }

    print(stk.joinToString())
}