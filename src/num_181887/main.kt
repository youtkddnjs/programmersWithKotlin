package num_181887

fun main() {
    val num_list = arrayOf(4, 2, 6, 1, 7, 6)
    var answer : Int
    var l_num = 0
    var r_num = 0

    for (i in num_list.indices) {
        if(i%2==0){
            l_num += num_list[i]
        }else{
            r_num += num_list[i]
        }
    }
    answer = if ( l_num > r_num ) l_num else r_num
    println( "left $l_num right $r_num" )
}