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


fun angryProfessor(k: Int, a: Array<Int>): String {
    var attendence = 0
    for(arrival in a.indices){
        if(a[arrival] <= 0){
            attendence++
        }
    }
    if(attendence >= k){
        return "NO"
    }
    return "YES"
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val first_multiple_input = readLine()!!.trimEnd().split(" ")

        val n = first_multiple_input[0].toInt()

        val k = first_multiple_input[1].toInt()

        val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        val result = angryProfessor(k, a)

        println(result)
    }
}
