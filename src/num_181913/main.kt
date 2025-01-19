package num_181913

fun main(){

    val my_string = "rermgorpsam"
    //[[2, 3], [0, 7], [5, 9], [6, 10]]
    val queries = arrayListOf(
        arrayOf(2,3),
        arrayOf(0,7),
        arrayOf(5,9),
        arrayOf(6,10),
    )
    var result = my_string

    for (i in queries) {
        val s = i[0]
        val e = i[1]
        println( " s $s , e $e ")
        val sliced = result.slice ( s..e  )
        println("sliced : " + sliced)
        val reversed = sliced.reversed()
        println("reversed : " + reversed)
        result = result.replaceRange(s,e+1,reversed)
        println("result : " + result)
    }

    println(result)


}