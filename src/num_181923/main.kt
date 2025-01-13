package num_181923

fun main() {

    val arr : Array<Int> = arrayOf(0, 1, 2, 4, 3)
    //[[0, 4, 2],[0, 3, 2],[0, 2, 2]]
    val queries : Array<Array<Any>> = arrayOf(
        arrayOf(0,4,2),
        arrayOf(0,3,2),
        arrayOf(0,2,2)
    )
    var answer: IntArray = intArrayOf()
    var newarry = mutableListOf<Int>()

    fun mainGo(){
        var a = 0
        var b = 0
        var c = 0

        for( i in queries){
            var sliced : List<Int>
            var aa = -1
            for( j in i.indices ){
                if( j == 0 ){
                    // arr의 범위를 나타낼 값
                    a = i[j] as Int
                }else if ( j == 1 ){
                    // arr의 범위를 나타낼 값
                    b = i[j] as Int
                }else {
                    // c 는 arr[a~b] 범위 내에서 값을 찾을 때 필요한 기준값
                    c = i[j] as Int
                }
            }

            sliced = arr.slice(a..b)

            for ( i in sliced.indices){
                if ( c < sliced[i] )
                {
                    aa = sliced[i]
                    if ( aa > sliced[i])
                    {
                        aa = sliced[i]
                    }
                }
            }
            answer.plus(aa)
        }
    }
    mainGo()
    println("answer : ${answer.contentToString()} ")
}