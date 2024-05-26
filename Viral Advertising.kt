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


fun viralAdvertising(n: Int): Int {
    var cumulativeLikes = 0
    var shared = 5
    for (day in 1..n){
        if(day == 1){
            cumulativeLikes+=2
        }else{
            shared = (shared/2).toInt()*3
            var l = (shared/2).toInt()
            cumulativeLikes+=l
        }
    }
    return cumulativeLikes
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val result = viralAdvertising(n)

    println(result)
}
