import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val pi = 3.14159
    val radius = scanner.next()
    val area = pi * (radius.toDouble() * radius.toDouble())
    var areaString = String.format("%.4f", area)

    println("A=${areaString.replace(',', '.')}")
}