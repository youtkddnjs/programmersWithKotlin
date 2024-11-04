package num_181849

fun main() {
    val num_str = "1234"
    var num = 0
    var answer: Int = 0
    for( i in num_str){
        num += i.toString().toInt()
    }
    answer = num
    println(answer)
}