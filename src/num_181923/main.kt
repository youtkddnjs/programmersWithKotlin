package num_181923

fun main() {

    val arr : Array<Int> = arrayOf(0, 1, 2, 4, 3)
    //[[0, 4, 2],[0, 3, 2],[0, 2, 2]]
    val queries : Array<Array<Any>> = arrayOf(
        arrayOf(0,4,2),
        arrayOf(0,3,1),
        arrayOf(0,2,3)
    )
    var answer: IntArray = intArrayOf()
    var newarry = mutableListOf<Int>()

    fun mainGo(){
        var s = 0
        var e = 0
        var k = 0
        // queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
        for( i in queries){
            var sliced : List<Int>
            var aa = -1
            var temp = -1

            for( j in i.indices ){
                if( j == 0 ){
                    // s 에 해당
                    s = i[j] as Int
                }else if ( j == 1 ){
                    // e 에 해당
                    e = i[j] as Int
                }else {
                    // k 에 해당
                    k = i[j] as Int
                }

            }

            println( "k : " + k)
            // arr 배열에서 s 에서 e 까지 자른다.
            sliced = arr.slice(s..e)
            println(sliced)
            for ( i in sliced.indices){
                // sliced 의 요소들 중 k 보다 큰 숫자를 찾는다.
                if ( k < sliced[i] )
                {
                    if (temp == -1 ){ temp =  sliced[i] }

                    // k 보다 큰 숫자 중 이전에 가장 작은 값과 비교하여 더 작은 값을 temp에 넣는다.
                    if ( temp > sliced[i]){
                        temp = sliced[i]
                    }
                }

            }
            println( "aa : " + aa)
            answer = answer.plus(aa)
        }
    } //main go


    mainGo()
    println("answer : ${answer.joinToString()} ")
}