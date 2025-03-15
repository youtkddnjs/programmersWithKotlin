package num_181856

fun main() {
    val arr1 = arrayOf(49, 13)
    val arr2 = arrayOf(70, 11, 2)
    var arr1Sum = 0
    var arr2Sum = 0
    var answer : Int
    if(arr1.size == arr2.size) {
        answer = if(arr1.size > arr2.size) 1 else -1
    }else{
        for(i in arr1.indices){
            arr1Sum += arr1[i]
            arr2Sum += arr2[i]
        }
        answer = if(arr1Sum > arr2Sum) 1 else -1
        if(arr1Sum == arr2Sum) answer = 0
    }

}