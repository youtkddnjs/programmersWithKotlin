package num_181894

fun main() {
    val arr = arrayOf(1,1,1)
    val lastIndex = arr.lastIndex
    var s_num = -1
    var e_num = 0
    var answer : IntArray = intArrayOf()

    for (i in 0 .. lastIndex){
        if ( arr[i] == 2) {
            s_num = i
            break
        }
    }
    for (i in lastIndex downTo 0) {
        if ( arr[i] == 2) {
            e_num = i
            break
        }
    }
    if(s_num != -1 && e_num != 0 ){
        answer = answer.plus(arr.slice(s_num..e_num))
    }else{
        answer = answer.plus(s_num )
    }

    println(answer.joinToString())



}