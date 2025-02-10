package num_181890

fun main() {

    val str_list = arrayOf("u", "u", "l", "r")
    var answer: Array<String> = arrayOf<String>()
    var index = 0
    var type = true

    for (i in str_list.indices) {

        if (str_list[i] == "l"){
            index = i
            type = true
            break
        }else if(str_list[i] == "r"){
            index = i
            type = false
            break
        }
    }

    if(type){
        answer = answer.plus(str_list.slice(0 until  index))
    }else{
        answer = answer.plus(str_list.slice(index + 1 ..  str_list.lastIndex))
    }


    println(answer.joinToString())




}