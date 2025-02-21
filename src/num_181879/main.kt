package num_181879

fun main() {
    var num_list = intArrayOf(3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1)
    var answer: Int = 0

    if (num_list.size > 10){
        for (i in num_list){
            answer += i
        }
    }else{
        answer += 1
        for (i in num_list){
            answer *= i
        }
    }
}