package num_181842

fun main() {
    val str1 : String = "abc"
    val str2: String = "abddcbbc"
    val answer: Int = if(str2.contains(str1)){ 0 } else { 1 }
    print(answer)
}