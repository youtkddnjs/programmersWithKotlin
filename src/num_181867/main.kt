package num_181867

fun main() {
    val myString = "dfajxxafdlclkjadf"
    val result = mutableListOf<Int>()
    var count = 0


    for (c in myString) {

        if (c == 'x') {
            result.add(count) // 'x'를 만나면 현재 count 값을 result에 추가합니다.
            count = 0       // 그리고 count를 초기화합니다.
        }else{
            count++ // 각 문자마다 count를 증가시킵니다.
        }
    }

    result.add(count) //x뒤에 문자가 또 올 수 있으므로
    println(result)
}