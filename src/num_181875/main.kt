package num_181875

fun main() {
    val strArr = arrayOf("AAA","BBB","CCC","DDD")
    var answer: Array<String> = arrayOf<String>()

    for (i in strArr.indices) {
        if (i % 2 != 0){
            answer = answer.plus(strArr[i].uppercase())
        }else{
            answer = answer.plus(strArr[i].lowercase())
        }
    }

    println(answer.joinToString())
}