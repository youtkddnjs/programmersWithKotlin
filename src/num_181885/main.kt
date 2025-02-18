package num_181885

fun main() {
    val todo_list = arrayOf("problemsolving", "practiceguitar", "swim", "studygraph")
    val finished = arrayOf(true, false, true, false)
    var answer: Array<String> = arrayOf<String>()

    for (i in todo_list.indices) {

        if (!finished[i]) answer += todo_list[i]
    }


}