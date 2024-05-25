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



fun beautifulDays(i: Int, j: Int, k: Int): Int {
    var beautifulDay = 0
    for(number in i..j){
        if(Math.abs(number-number.reverseNumber()) % k ==0){
            ++beautifulDay
        }
    }
    return beautifulDay
}
private fun Int.reverseNumber(): Int {
    val reversedNum = this.toString().reversed()
    return reversedNum.toInt()
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val i = first_multiple_input[0].toInt()

    val j = first_multiple_input[1].toInt()

    val k = first_multiple_input[2].toInt()

    val result = beautifulDays(i, j, k)

    println(result)
}
