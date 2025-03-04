package num_181866

fun main() {
    val myString = "dxccxbbbxxaaaaxaaa"
    var result = mutableListOf<String>()
    var tempString = ""

    for (c in myString) {

        if (c == 'x') {
            if(!tempString.isNullOrBlank()){
                result.add(tempString)
            }
            tempString = ""       // 그리고 count를 초기화합니다.
        }else{
            tempString += c // 각 문자마다 count를 증가시킵니다.
        }
    }
    if(!tempString.isNullOrBlank()){
            result.add(tempString)
        }
    result.sort()
    println(result)
}
