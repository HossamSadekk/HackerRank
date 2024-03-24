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
 * Complete the 'breakingRecords' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY scores as parameter.
 */

fun breakingRecords(scores: Array<Int>): Array<Int> {
    var highestScore = Array<Int>(scores.size){0}
    var lowestScore = Array<Int>(scores.size){0}
    highestScore[0] = scores[0]
    lowestScore[0] = scores[0]
    var breakHighest = 0
    var breakLowest = 0
    for(i in 1 until scores.size){
        if(scores[i] > highestScore[i-1]){
            breakHighest++
            highestScore[i] = scores[i]
            lowestScore[i] = lowestScore[i-1]
        }else if(scores[i] < lowestScore[i-1]){
            breakLowest++
            highestScore[i] = highestScore[i-1]
            lowestScore[i] = scores[i]
        } else {
            highestScore[i] = highestScore[i-1]
            lowestScore[i] = lowestScore[i-1]
        }
    }
    return arrayOf(breakHighest,breakLowest)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val scores = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
