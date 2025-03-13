package num_181860

fun main() {
    var aar = arrayOf(3, 2, 4, 1, 3)
    var flag = arrayOf(true, false, true, false, false)
    val answer = mutableListOf<Int>()

    for ( i in flag.indices){
        if(flag[i]){
            for( j in 1..aar[i]*2){
                answer.add(aar[i])
            }
        }else{
            for( j in 1..aar[i]){
                answer.removeLast()
            }

        }
    }

    println(answer.joinToString())
}