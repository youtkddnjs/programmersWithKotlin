package num_181921

fun main() {
    val l = 5
    val r = 555

    var intArray = mutableListOf<Int>()

    for (i in l..r) {
        var str = i.toString()
        // 문자열의 모든 문자가 '5' 또는 '0'인지 확인
        var result = str.all { it ==  '5' || it == '0' }
        if (result) intArray.add(i)
    }
    println("all 사용 " + intArray.joinToString())
    intArray = mutableListOf<Int>()

    for (i in l..r) {
        var str = i.toString()
        // 문자열의 고유 문자가 '5'와 '0'만 포함되는지 확인
        var result = str.toSet() == setOf('5', '0')
        if (result) intArray.add(i)
    }
    println("set 사용 " + intArray.joinToString())
    intArray = mutableListOf<Int>()

    for (i in l..r) {
        var str = i.toString()
        // 변형: '5'만 있거나 '0'만 있는 경우도 포함하려면
        var result = str.toSet().all { it in setOf('5', '0') }
        if (result) intArray.add(i)
    }
    println("set 변형 사용 " + intArray.joinToString())
    intArray = mutableListOf<Int>()

    for (i in l..r) {
        var str = i.toString()
        // '5'와 '0'이 아닌 문자가 없는지 확인
        var result = str.filter { it != '5' && it != '0' }.isEmpty()
        if (result) intArray.add(i)
    }
    println("fileter 사용 " + intArray.joinToString())
    intArray = mutableListOf<Int>()

    for (i in l..r) {
        var str = i.toString()
        // '5'와 '0'을 제거한 결과가 비어 있는지 확인
        val result = str.replace("5", "").replace("0", "").isEmpty()
        if (result) intArray.add(i)
    }
    println("replace 사용 " + intArray.joinToString())
    intArray = mutableListOf<Int>()

    for (i in l..r) {
        var str = i.toString()
        // '5' 또는 '0'의 개수와 문자열 전체 길이 비교
        val result = str.count { it == '5' || it == '0' } == str.length
        if (result) intArray.add(i)
    }
    println("count 사용 " + intArray.joinToString())
    intArray = mutableListOf<Int>()

    for (i in l..r) {
        var str = i.toString()
        // '5'와 '0' 외의 문자가 있는지 확인
        val result = !str.any { it != '5' && it != '0' }
        if (result) intArray.add(i)
    }
    println("any 사용 " + intArray.joinToString())
    intArray = mutableListOf<Int>()

}