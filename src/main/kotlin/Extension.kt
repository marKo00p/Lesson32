import kotlin.math.pow

fun main(args: Array<String>) {
    val d = 3
    println(d.pow(2.2))


    val word = "javanisimo"
    println(word.filter('j', 'v', 'i', 'o', 'p'))

}
// extension for Int class
fun Int.pow (x: Double) : Double {
    return this.toDouble().pow(x)
}
//extension for String class
fun String.filter(vararg specialSymbols: Char): String {
    var result = ""

        for (char in this) {
            if (specialSymbols.contains(char))
                result += char
        }

    return result
    }




