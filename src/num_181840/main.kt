package num_181840

fun main() {
    val num_list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
    val n = 20
    print( if(num_list.find { it == n } != null ) 1 else 0 )
}