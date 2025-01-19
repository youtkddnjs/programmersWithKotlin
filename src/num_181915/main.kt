package num_181915

fun main(){

    val my_string = "cvsgiorszzzmrpaqpe"
    val index_list = listOf(16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7)
    var new_string = ""

    for ( i in index_list)
        new_string += my_string[i]

    println(new_string)
}