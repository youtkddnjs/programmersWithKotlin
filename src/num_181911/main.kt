package num_181911

fun main(){
    val my_strings = arrayOf("progressive", "hamburger", "hammer", "ahocorasick")
    val parts = arrayOf(
        arrayOf(0,4),
        arrayOf(1,2),
        arrayOf(3,5),
        arrayOf(7,7),
    )
    var answer = ""

    for ( i in 0..(parts.size-1) ){
        val s = parts[i][0]
        val e = parts[i][1]
        val sliced = my_strings[i].slice(s..e)

        answer += sliced
    }

    println(answer)
}