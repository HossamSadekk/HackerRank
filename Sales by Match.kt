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
 * Complete the 'sockMerchant' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY ar
 */

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    var paired = 0 
    val list = mutableListOf<Int>()
    for(i in ar.indices){
    if(!list.contains(ar[i]))
    {
    list.add(ar[i])
    var sum = 1
        for(j in ar.indices)
        {
            if(ar[i]==ar[j] && i != j)
            {
                sum++
            }
        }
        if(sum%2==0)
        {
            paired += sum/2
        }
        else if(sum != 1)
        {
            paired += (sum - 1)/2
        }
     }
   }
return paired
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
