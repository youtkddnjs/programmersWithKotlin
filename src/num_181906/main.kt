package num_181906

fun main(){
    val my_string = "banana"
    val is_suffix = "nan"
    var answer: Int = 0

    var s = 0
    var e = is_suffix.length -1

    if ( my_string.substring(0 , e).contains(is_suffix) ) {
        answer = 1
    }else {
        answer = 0
    }
    println(  my_string.substring(0 ,e) )

    println(answer)
}

