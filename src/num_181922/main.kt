package num_181922

fun main(){
    val arr : Array<Int> = arrayOf(0, 1, 2, 4, 3)
    //[[0, 4, 2],[0, 3, 2],[0, 2, 2]]
    val queries : Array<Array<Any>> = arrayOf(
        arrayOf(0,4,1),
        arrayOf(0,3,2),
        arrayOf(0,3,3)
    )
    var answer: IntArray = intArrayOf()

    fun mainGo(){
        var s = 0
        var e = 0
        var k = 0

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

            for ( i in s..e){
                // sliced 의 요소들 중 k 배수를 찾는다.
                if (i % k == 0 ) {
                   arr[i] = arr [i] + 1
                }
            }
        }
    } //main go


    mainGo()
    println("answer : ${arr.joinToString()} ")
}
