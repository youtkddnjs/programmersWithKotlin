package num_181886

fun main() {
    val names = arrayOf("nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx")

    var answer: Array<String> = arrayOf<String>()

    for (i in names.indices) {
      if( i % 5 == 0){
          answer += names[i]
      }
    }

    println(answer.joinToString())
}