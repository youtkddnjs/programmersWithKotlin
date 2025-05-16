package num_181851

fun main() {
    val rank = arrayOf(3, 7, 2, 5, 4, 6, 1)
    val attendance = arrayOf(false, true, true, true, true, false, false)
    var isattendace = mutableListOf<Int>()
    var count = 0
    for ( i in 1..rank.size) {
        var num = rank.indexOf(i)

        if(attendance[num]){
            count++
            isattendace.add(num)
        }

        if (count == 3 ) break
    }
    isattendace[0] * 10000 + isattendace[1] * 100 + isattendace[2]

}