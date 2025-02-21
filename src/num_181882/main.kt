package num_181882

fun main() {
    val arr = intArrayOf(1, 2, 3, 100, 99, 98)
    var answer = mutableListOf<Int>()

    // 1,000,000
    // 30
    //

    //arr.size 를 10으로 나눈 나머지가 0 일때 아닐때
    // 0일때면 10 으로 나눈 수 의 10, 20, 30 까지
    // 나눈수 의

    for ( i in arr.indices ) {
        answer.add(calNum(arr[i]))
    }

    println(answer)
}

fun calNum(num:Int): Int {
    return if( num % 2 == 0 && (num > 50 || num == 50) ){
            num / 2
        }else if ( num % 2 == 1 && num < 50){
            num * 2
        }else{
            num
        }
}