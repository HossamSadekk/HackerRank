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
 * Complete the 'kangaroo' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. INTEGER x1
 *  2. INTEGER v1
 *  3. INTEGER x2
 *  4. INTEGER v2
 */

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    val state = willkKangarooMeet(x1, v1, x2, v2) 
    if(state){
        return "YES"
    }  
    return "NO"
}

fun willkKangarooMeet(x1: Int, v1: Int, x2: Int, v2: Int): Boolean {
    var location1 = x1
    var location2 = x2

    for (i in 0 until 10000) {
         location1 = locationOfFirstKangaroo(location1, v1)
         location2 = locationOfSecondKangaroo(location2, v2)
        if(location1.equals(location2)){
        return true
    }
}
    return false
}

fun locationOfFirstKangaroo(location: Int, jumpRate: Int): Int{
    return location + jumpRate
}

fun locationOfSecondKangaroo(location: Int, jumpRate: Int): Int{
    return location + jumpRate
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val x1 = first_multiple_input[0].toInt()

    val v1 = first_multiple_input[1].toInt()

    val x2 = first_multiple_input[2].toInt()

    val v2 = first_multiple_input[3].toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}
