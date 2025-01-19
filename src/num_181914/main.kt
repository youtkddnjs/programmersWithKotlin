package num_181914

fun main() {

    val num = "78720646226947352489"
    var sum = 0

    for (i in num){
        sum += i.digitToInt()
    }

    println(sum%9)
}