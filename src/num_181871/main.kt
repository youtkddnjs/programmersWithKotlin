package num_181871

fun main() {
    val myString = "banana"
    val pat = "ana"
    var answer = 0

    //우선 먼저 한번은 찾는다.
    var firstIndex = myString.indexOf(pat)
    if(firstIndex != -1 ){ answer += 1 } //찾게되면 +1 한다.
    var secondIndex = firstIndex

    //두번째 부터 찾기 위해 아래 코드가 진행 된다.
    while (secondIndex != -1) {

        secondIndex = myString.indexOf(pat, secondIndex + 1)

        if( secondIndex != -1 ){
            answer += 1
        }
    }

    println(answer)
}