import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    val inputFormat = SimpleDateFormat("hh:mm:ssa")
    val outputFormat = SimpleDateFormat("HH:mm:ss")

    val date = inputFormat.parse(s)
    return outputFormat.format(date)

}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
