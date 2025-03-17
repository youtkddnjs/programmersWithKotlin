package num_181855

fun main() {
    val strArr = arrayOf("a","bc","d","efg","hi")

    val answer1 = strArr
        .map { it.length }  // 문자열 길이 리스트 생성
        .groupingBy { it }
        .eachCount()
        .maxByOrNull { it.value }  // 가장 큰 개수 찾기

    val answer2 = strArr
        .map { it.length }
        .groupBy { it }  // 길이별 그룹화
        .mapValues { it.value.size }  // 각 길이의 개수 계산
        .maxByOrNull { it.value }  // 가장 큰 값 찾기

    val answer3 = strArr
        .map { it.length }
        .groupingBy { it }
        .fold(0) { acc, _ -> acc + 1 }  // 길이별 개수를 누적
        .maxByOrNull { it.value }  // 가장 큰 값 찾기


    println( "answer1 : ${answer1?.value}")
    println( "answer2 : ${answer2?.value}")
    println( "answer3 : ${answer3?.value}")

}

