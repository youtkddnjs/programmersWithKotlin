package num_181865

fun main() {
    val binomial = "4 - 12"
    var answer = 0
    if(binomial.contains("+")){
        val bi = binomial.split("+").map{
            it.trim()
        }
        answer = bi[0].toInt() + bi[1].toInt()
    }else if(binomial.contains("-")){
        val bi = binomial.split("-").map{
            it.trim()
        }
        answer = bi[0].toInt() - bi[1].toInt()

    }else if(binomial.contains("*")){
        val bi = binomial.split("*").map{
            it.trim()
        }
        answer = bi[0].toInt() * bi[1].toInt()

    }


    println(answer)
}