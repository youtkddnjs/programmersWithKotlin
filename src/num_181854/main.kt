package num_181854

fun main() {
    val arr = intArrayOf(49, 12, 100, 276, 33)
//    val arr = arrayListOf(49, 12, 100, 276, 33)
    val n = 27

    if(arr.size % 2 == 0){
        for ( i in arr.indices){
            if(i % 2 != 0){ arr[i] = arr[i] + n  }
        }
    }else{
        for ( i in arr.indices){
            if( i % 2 == 0){ arr[i] = arr[i] + n }
        }
    }

    print(arr.joinToString())

}