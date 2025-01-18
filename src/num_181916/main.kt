package num_181916

fun main() {

    val min = 1
    val max = 6

    var a = (min..max).random()
    var b = (min..max).random()
    var c = (min..max).random()
    var d = (min..max).random()

    val numarray = arrayOf(a, b, c, d)

    var count = 0
    var p_num = -1
    var q_num = -1

    for ( i  in 0  .. (numarray.size - 1)) {
        for ( j  in i .. (numarray.size - 1)) {
            if(numarray[i] == numarray[j]){
                count++
                p_num = numarray[i]
            }
            if ( p_num == -1 && count > 2 ){
                q_num = numarray[i]
            }
        }
    }





    var r1 = a == b
    var r2 = a == c
    var r3 = a == d
    var r4 = b == c
    var r5 = b == d
    var r6 = c == d



    for ( i in 0..5) {
        var a = (min..max).random()
        var b = (min..max).random()
        var c = (min..max).random()
        var d = (min..max).random()

        var r1 = a == b
        var r2 = a == c
        var r3 = a == d
        var r4 = b == c
        var r5 = b == d
        var r6 = c == d

        val rarray = arrayOf(r1, r2, r3, r4, r5, r6)
        var count = 0

        for ( j in rarray){
            if (j) count++
        }

        println(" 랜덤 ${i}번 째")
        println("a : " + a + " b : " + b + " c : " + c + " d : " + d)
        println( ""+ r1 + ", " + r2 + ", " + r3 + ", " + r4 + ", " + r5 + ", " + r6 + " True 갯수 : " + count)
        println("")


    }

}