package num_181859

fun main() {
    val arr = arrayOf(0, 1, 1, 1, 0)
    var result = mutableListOf<Int>()

    for (i in arr) {
        if(result.isEmpty()){
            result.add(i)
        }else{
            if( result.last() == i){
                result.removeLast()
            }else{
                result.add(i)
            }
        }
    }
    if(result.isEmpty()) {
        result.add(-1)
    }

    println(result.joinToString())
}