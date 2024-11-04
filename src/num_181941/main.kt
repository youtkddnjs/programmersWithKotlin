package num_181941

fun main() {
    val arr : Array<String> = arrayOf("a","b","c","d","e","f")
    var answer : String = ""
    for(i in arr){
        println(i)
        answer += i.toString()
    }
    println(answer)

}