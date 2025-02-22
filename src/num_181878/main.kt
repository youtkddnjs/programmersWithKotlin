package num_181878

fun main() {
    var myString = "aaAA"
    var myString2 = "AbCdEfG"
    var pat = "aaaaa"
    var pat2 = "aBc"

    val answer = myString.contains(pat , ignoreCase = true)
    val answer2 = myString2.contains(pat2 , ignoreCase = true)

    println(answer)
    println(answer2)

    val str = "Hello World"

    println("World" in str)  // ✅ 출력: true
    println("world" in str.lowercase())  // 🚫 출력: false (대소문자 구분)
}