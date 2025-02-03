package num_181900

fun main() {
    val my_string = "apporoograpemmemprs"
    val indices = arrayOf(1, 16, 6, 15, 0, 10, 11, 3)
    var answer = ""
    val sortedIndices = indices.sorted()
    var count = 0 // sortedIndices 의 요소를 하나씩 증가 하려는 변수

    for ( i in my_string.indices ){
        // my_string 의 위치값 i 와 sortedIndices 의 요소를 비교한다.
        if( i == sortedIndices[count]){
            // 같다면 건너 뛰어야 하므로 단순히 sortedIndices 의 다음 요소를 가르킨다.
            // 단 count가 sortedIndices 의 배열 크기를 넘어가지 않아야 한다.
            if( count < sortedIndices.size-1 ){
                count++
            }

        }else{

            answer += my_string[i]
        }
    }

    println("1. answer = $answer")

}