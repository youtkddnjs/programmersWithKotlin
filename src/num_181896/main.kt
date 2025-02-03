package num_181896

fun main(){
    val num_list = arrayOf( 12,4,15,46,38,-2,15)
    var answer = -1
    for ( i in num_list.indices){
        if ( num_list[i] < 0){
            answer = i
        }
    }
}