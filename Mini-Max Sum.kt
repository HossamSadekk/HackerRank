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
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>): Unit {
    var miniSum = minimumSum(arr)
    var maxSum = maximumSum(arr)
    print("$miniSum $maxSum")
}

fun minimumSum(arrayOfValues: Array<Int>) : Long{
    var maxElement = arrayOfValues.max()
    var sum = arrayOfValues.map { it.toLong() }.sum()  - maxElement
    return sum.toLong()
}

fun maximumSum(arrayOfValues: Array<Int>) : Long{
    var miniElement = arrayOfValues.min()
    var sum = arrayOfValues.map { it.toLong() }.sum() - miniElement
    return sum.toLong()
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
