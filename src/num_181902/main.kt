package num_181902

fun main() {
    val my_string = "Programmers"
    val array = Array(52) { 0 }
    for (c in my_string) {
        val stringIndex = c.code

        if( 65<= stringIndex && stringIndex <= 90 ){
            //대문자
            for ( i in 65 .. 90){
                if(stringIndex == i){
                    array[stringIndex - 65] +=  1
                }
            }
        }else if ( 96<= stringIndex && stringIndex <= 122){
            //소문자
            for ( i in 96 .. 122){
                if(stringIndex == i){
                    array[stringIndex - 96 + 25] +=  1
                }
            }
        }
    }
    println(array.joinToString(separator = ""))
}