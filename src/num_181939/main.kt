package num_181939

fun main() {
    var a = 1000
    var b = 1234
    var nextDigits = 0
    var maxDigits = 0
    var showTime: Boolean = true
    var answer : Int = 0

    // 자릿수 비교하여 작은 자릿수 크기 가져오기
    val countDigits : ( num1: Int ,num2: Int ) -> Int = { num1, num2 ->
        val anum = num1.toString().length
        val bnum = num2.toString().length

        if (anum > bnum){
            bnum
        }else if (anum < bnum){
            anum
        }else{
            anum
        }
    }

    // 한자리만 가져오기
    val resulFirsttDigits : (num: Int , digitsNum: Int) -> Int = { num, digitsNum ->
        num.toString().substring(digitsNum, digitsNum + 1).toInt()
    }

    // 숫자를 문자로 바꾼 뒤 합쳐서 숫자로 보낸다.
    val comparisonNum : (num1: Int, num2: Int) -> Int = { num1, num2 ->
        (num1.toString() + num2.toString()).toInt()
    }

    maxDigits = countDigits(a,b)

    while(showTime) {
        val first_digits_a = resulFirsttDigits(a, nextDigits)
        val first_digits_b = resulFirsttDigits(b, nextDigits)

        if( first_digits_a < first_digits_b){
            answer = comparisonNum(b, a)
            break
        }else if (first_digits_a > first_digits_b){
            answer = comparisonNum(a, b)
            break
        }else{
            if (nextDigits + 1 == maxDigits){
                answer = comparisonNum(a, b)
                break
            }
        }
        nextDigits += 1
    } //while


    println("답 : " + answer)
}
