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

fun designerPdfViewer(h: Array<Int>, word: String): Int {
    val arrayOfWord = word.toCharArray()
    var biggest = h[getAlphabetIndex(arrayOfWord.get(0))]
    for(char in 1 until arrayOfWord.size){
        if(h[getAlphabetIndex(arrayOfWord.get(char))] > biggest){
            biggest = h[getAlphabetIndex(arrayOfWord.get(char))]
        }
    }
    return arrayOfWord.size * biggest
}

fun getAlphabetIndex(char: Char): Int {
    return when (char) {
        in 'A'..'Z' -> char - 'A'
        in 'a'..'z' -> char - 'a'
        else -> -1 
    }
}

fun main(args: Array<String>) {

    val h = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val word = readLine()!!

    val result = designerPdfViewer(h, word)

    println(result)
}
