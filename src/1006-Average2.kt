import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.next()
    val b = scanner.next()
    val c = scanner.next()

    val media = (a.toDouble() * 2 + b.toDouble() * 3 + c.toDouble() * 5)/(2+3+5)

    println("MEDIA = ${String.format("%.1f", media).replace(',', '.')}")
}