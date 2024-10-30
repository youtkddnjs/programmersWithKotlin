package num_181944

fun main() {
    val a = readLine()!!.toInt()
    print(if( a % 2 == 0) "${a} is even" else "${a} is odd")
}