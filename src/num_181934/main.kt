package num_181934

class main {
    fun main(){

        val ineq: String = ">"
        val eq: String = "="
        val n = 10
        val m = 11
        if(ineq.contains(">") && eq.contains("=")){
            if(n >= m){ 1 } else 0
        }else if(ineq.contains("<") && eq.contains("=")){
            if(n <= m){ 1 } else 0
        }else if(ineq.contains(">") && eq.contains("!")){
            if(n > m){ 1 } else 0
        }else if(ineq.contains("<") && eq.contains("!")){
            if(n < m){ 1 } else 0
        }else 0
    }
}