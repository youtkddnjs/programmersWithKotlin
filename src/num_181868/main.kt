package num_181868

fun main() {
    var my_string = " programmers "
    var answer: Array<String> = arrayOf<String>()
    var temp = ""

    for (i in my_string) {
        if (i.toString() == " ") {
            if(temp == ""){
                temp = ""
            }else{
                answer = answer.plus(temp)
                temp = ""
            }
        } else {
            temp += i.toString()
        }
    }

    if(temp != ""){ answer = answer.plus(temp)}


    println(answer.joinToString())
}