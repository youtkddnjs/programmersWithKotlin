package num_181924

fun main() {

    val arr : Array<Int> = arrayOf(0,1,2,3,4)
    val queries : Array<Array<Any>> = arrayOf(
        arrayOf(0,3),
        arrayOf(1,2),
        arrayOf(1,4)
    )
    var answer: IntArray = intArrayOf()

    fun mainGo(){
        var a = 0
        var b = 0
        var temp = 0
        for( i in queries){
            println("s")
            for( j in i.indices ){

                if( j == 0 ){
                    // queriees 의 요소의 배열 첫번째 값을 기억하며 arr의 인덱스로 사용하여 arr의 값을 저장한다.
                    a = i[j] as Int
                    temp = arr[a]

                }else{
                    // queriees 의 요소의 배열 두번째 값을
                    b = i[j] as Int
                    arr[a] = arr[b]
                    arr[b] = temp
                }

            }
            println("end : a = ${a}, b = ${b}")
            println("end arr = ${arr.contentToString()}")
        }
    }
    mainGo()
}

