package num_181862

fun main() {
    val myStr = "abc"
    var result = mutableListOf<String>()
    var str = ""
    for (i in myStr){

        if ( i == 'a' || i == 'b' || i == 'c'){
            if( str != ""){
                result.add(str)
                str = ""
            }
        }else{
            str  += i
        }
    }
    if( str != ""){
        result.add(str)
    }
    if(result.isEmpty()) result.add("EMPTY")
    println(result.joinToString())
}