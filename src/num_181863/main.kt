package num_181863

fun main() {
    val rny_string = "masterpiece"
    var answer: String = ""

    for (i in rny_string){
        if ( i == 'm'){
            answer += "rn"
        }else {
            answer += i
        }
    }

}