package num_181870

fun main() {
    val strArr = arrayOf("and","notad","abcd")
    val ad = "ad"

    var answer: Array<String> = arrayOf<String>()

    for (i in strArr) {
        if (i.contains(ad)) {

        }else{
            answer = answer.plus(i)
        }
    }

    println(answer.joinToString())
}