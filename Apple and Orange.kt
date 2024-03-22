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
 * Complete the 'countApplesAndOranges' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER s
 *  2. INTEGER t
 *  3. INTEGER a
 *  4. INTEGER b
 *  5. INTEGER_ARRAY apples
 *  6. INTEGER_ARRAY oranges
 
 s <-> t distance of sam's house 
 a loction on apple tree
 b location of orange tree
 */

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
   val applesPosition = applesLand(apples,a)
   val orangesPosition = orangesLand(oranges,b)
   var numOfApplesInHouse = 0
   var numOfOrangesInHouse = 0
   
    applesPosition.forEach { applePos ->
        if(applePos >= s && applePos <= t){
            numOfApplesInHouse++
        }
     }
     orangesPosition.forEach { orangePos ->
        if(orangePos >= s && orangePos <= t){
            numOfOrangesInHouse++
        }
     }
     
     println(numOfApplesInHouse)
     println(numOfOrangesInHouse)
}

fun applesLand(apples: Array<Int>,treePosition: Int): Array<Int>{
    var applesPosition = Array<Int>(apples.size){0}
    apples.forEachIndexed { i , apple ->
        applesPosition[i] = apple + treePosition
     }
     return applesPosition
}

fun orangesLand(oranges: Array<Int>,treePosition: Int): Array<Int>{
    var orangesPosition = Array<Int>(oranges.size){0}
    oranges.forEachIndexed { i , orange ->
        orangesPosition[i] = orange + treePosition
     }
     return orangesPosition
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val s = first_multiple_input[0].toInt()

    val t = first_multiple_input[1].toInt()

    val second_multiple_input = readLine()!!.trimEnd().split(" ")

    val a = second_multiple_input[0].toInt()

    val b = second_multiple_input[1].toInt()

    val third_multiple_input = readLine()!!.trimEnd().split(" ")

    val m = third_multiple_input[0].toInt()

    val n = third_multiple_input[1].toInt()

    val apples = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val oranges = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}
