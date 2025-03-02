package num_181869

fun main() {
    var my_string = "i love you"
    var answer: Array<String> = arrayOf<String>()
    var temp = ""

    for (i in my_string) {
        if (i.toString() == " ") {
            answer = answer.plus(temp)
            temp = ""
        } else {
            temp += i.toString()
        }
    }

    answer = answer.plus(temp)


    println(answer.joinToString())

}