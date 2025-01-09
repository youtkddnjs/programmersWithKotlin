package num_181924

fun main() {

    val arr : Array<Int> = arrayOf(0,1,2,3,4)
    val qeuries : Array<Array<Any>> = arrayOf(
        arrayOf(0,3),
        arrayOf(1,2),
        arrayOf(1,4)
    )
    var answer: IntArray = intArrayOf()
    fun mainGo(){
        var a = 0
        var b = 0
        for( i in qeuries){
            println("s")
            for( j in i.indices ){

                if( j == 0 ){
                    a = arr[i[j] as Int]
                }else{
                    b = arr[i[j] as Int]
                }
            }
            println("e")
        }
    }
    mainGo()
}

