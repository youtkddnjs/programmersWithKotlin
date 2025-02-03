package num_181897

fun main() {
    val n = 3
    val slicer = arrayOf( 1,5,2)
    val num_list = arrayOf(1,2,3,4,5,6,7,8,9)
    var answer: IntArray = intArrayOf()

    when(n){
        1 -> { // 0번 부터 b번 인덱스 까지 즉 slicer[1]의 값을 뜻한다.
            for (i in 0 .. slicer[1]){
                answer = answer.plus(num_list[i])
            }
        }
        2 -> { // a번 인덱스 부터 마지막 까지 즉, slicer[0]의 값을 뜻한다.
            for (i in slicer[0] .. num_list.size-1){
                answer = answer.plus(num_list[i])
            }
        }
        3 -> { // a번 인덱스 ~ b 인덱스
            for (i in slicer[0] .. slicer[1]){
                answer = answer.plus(num_list[i])
            }
        }
        4 -> { // a번 인덱스 ~ b 인덱스 c 간격
            for (i in slicer[0] .. slicer[1] step slicer[2]){
                answer = answer.plus(num_list[i])
            }
        }
        else -> {}
    }
}