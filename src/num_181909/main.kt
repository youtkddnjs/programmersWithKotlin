package num_181909

fun main() {

    val my_string = "banana"
    var answer: Array<String> = arrayOf<String>()

    for( i in 0 .. my_string.length - 1){
        answer = answer.plus(my_string.slice(i..my_string.length-1))
    }
    answer = answer.sorted().toTypedArray()

    println(answer.joinToString())

}