package num_181908

fun main() {
    val my_string = "banana"
    val is_suffix = "ana"
    var answer: Int = 0

    var s = my_string.length - is_suffix.length
    var e = my_string.length

    if ( my_string.substring(s,e).contains(is_suffix) ) {
        answer = 1
    }else {
        answer = 0
    }

    println(answer)
}