import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import kotlin.math.abs
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
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var firstDiagonal = getSumFirstDiagonal(arr)
    var secondDiagonal = getSumSecondDiagonal(arr)
    return abs(firstDiagonal - secondDiagonal)
}
fun getSumFirstDiagonal(twoDimensionalArray: Array<Array<Int>>): Int{
    var sum = 0
    for(i in twoDimensionalArray.indices){
        for(j in twoDimensionalArray[i].indices){
            if(i == j){
                sum += twoDimensionalArray[i][j]
            }
        }
    }
    return sum
}

fun getSumSecondDiagonal(twoDimensionalArray: Array<Array<Int>>): Int{
    var sum = 0
    for(i in twoDimensionalArray.indices){
        for(j in twoDimensionalArray[i].indices){
            if(i + j == twoDimensionalArray.size -1){
                sum += twoDimensionalArray[i][j]
            }
        }
    }
    return sum
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
