package num_181916

fun main() {

    val min = 1
    val max = 6

   for ( i in 0..5) {

       var a = (min..max).random()
       var b = (min..max).random()
       var c = (min..max).random()
       var d = (min..max).random()

       val numarray = arrayOf(a, b, c, d)

       var count = 0
       var p_num = -1
       var q_num = -1
       var r_num = -1
       var s_num = -1
       var m_num = -1
       var temp = -1
       var answer = 0

        for ( i  in 0  .. (numarray.size - 1)) {
            for ( j  in i + 1 .. (numarray.size - 1)) {
                if(numarray[i] == numarray[j]){
                    count++
                    when(count){
                        // 일단 같은 숫자가 하나 이므로 숫자 하나를 넣어 둔다.
                        1 -> {p_num = numarray[i]}

                        2 -> {
                            // count 1일 때 찾은 숫자와 다른 숫자이면 q_numd 넣어 둔다.
                            if( p_num != numarray[i] ) {
                                q_num = numarray[i]
                            }
                        }
                        3 -> {
                            // count 가 3일 때 숫자를 넣는다면 3개의 같은 수 일 것이다.
                            r_num = numarray[i]
                        }
                        6 -> { s_num = numarray[i] }
                    }
                }
            }
        }

       if( count == 6 ){

           //네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
           //여기서는 s_num
           answer = 1111 * s_num

       }else if ( count == 3 ){

           // 3개의 같은 숫자를 제외한 또다른 숫자를 찾느다.
           for ( i in numarray){
               if (r_num != i && s_num == -1 ) {
                   s_num = i
               }
           }

           answer = ( 10 * r_num + s_num) * ( 10 * r_num + s_num)

       }else if ( count == 2 ){

           answer = (p_num + q_num) * (if(p_num > q_num) { (p_num - q_num) } else { q_num - p_num })

       }else if ( count == 1 ){

           //기본 배열에서 다른 숫자 2개를 찾는다.
           for ( i in numarray){
               if (p_num != i && q_num == -1 ){
                   q_num = i
               }else if ( p_num != i && q_num != -1){
                   r_num = i
               }
           }
           answer = (q_num * r_num)

       }else if ( count == 0 ){

           // 가장 작은 수를 찾는다.
           for ( i in numarray.indices){
               if (temp == -1 ) temp = numarray[i]
               if (temp > numarray[i]) {
                   m_num = numarray[i]
                   temp = m_num
               }
           }
           m_num = temp
           answer = (m_num)

       }

       println(" 랜덤 ${i}번 째")
       println("a : " + a + " b : " + b + " c : " + c + " d : " + d)
       println("$p_num, $q_num, $r_num, $s_num 가장 작은 수 $m_num")
       println("")
    }

}