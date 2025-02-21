package num_181881


fun main() {
    val arr = intArrayOf(1, 2, 3, 100, 99, 98)

    var answer: Int = 0
    var comarray_a = mutableListOf<Int>() // 리소스 배열 및 X + 1 배열
    var comarray_b = mutableListOf<Int>() // 계산된 배열
    var comarray2 = mutableListOf<Int>() // 이전 배열
    var count = 0


    comarray_a.addAll(arr.toList()) //최초 리소스를 담는다.


    while( comarray2 != comarray_a ){

        //작업 전 이전 결과물에 담는다.
        comarray2.clear()
        comarray2.addAll(comarray_a)

        for ( i in comarray_a.indices ) {
            comarray_b.add(calNum(comarray_a[i]))
        }
        count++

        comarray_a.clear()
        comarray_a.addAll(comarray_b)
        comarray_b.clear()

    }
    answer = count - 1
    println("answer: $answer")
}

fun calNum(num:Int): Int {
    return if( num % 2 == 0 && (num > 50 || num == 50) ){
        num / 2
    }else if ( num % 2 == 1 && num < 50){
        (num * 2) + 1
    }else{
        num
    }
}