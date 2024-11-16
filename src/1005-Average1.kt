import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.next()
    val b = scanner.next()

    val media = (a.toDouble() * 3.5 + b.toDouble() * 7.5)/(3.5 + 7.5)

    println("MEDIA = ${String.format("%.5f", media).replace(',', '.')}")
}