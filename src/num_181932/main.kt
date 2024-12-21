package num_181932


class Main {
    fun solution(code: String): String {
        var answer: String = ""
        var mode = true
        for( i in code.indices){
            if( code[i] == '1') {
                mode = !mode
                continue
            }
            if(mode){
                if (i % 2 == 0) answer += code[i]
                if(answer == "") answer = "EMPTY"
            }else {
                if (i % 2 != 0) answer += code[i]
            }
            println( "mode가 "+if(mode) {"0"} else {"1"} + "일 때 : " + code[i] + " 값을 추가 " + answer)
        }
        return if(answer == "") "EMPTY" else answer
    }

}

fun main(){
    println("main")
    println(Main().solution("abc1abc1abc"))
}