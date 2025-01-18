package num_181920

fun main(){
    val min = 1
    val max = 1000
    val rn = (min..max).random()
    var answer: IntArray = intArrayOf()
    var x = 10

    answer = answer.plus(x)
    while( x > 1 ){
        if( x % 2 == 0){
            x = x / 2
        }else{
            x = (3 * x) + 1
        }
        println(x)
        answer = answer.plus(x)
    }
    print("답 : " + answer.joinToString())
}