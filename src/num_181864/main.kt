package num_181864

fun main() {
    val myString = "ABBAA"
    val pat = "AABB"


    var answer = 0
    var tap = ""
    for ( i in pat){
        if ( i == 'A'){
            tap += 'B'
        }else{
            tap += 'A'
        }
    }
    answer = if(myString.contains(tap)) { 1 } else { 0 }
    println(answer)
}