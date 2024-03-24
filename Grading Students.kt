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

fun gradingStudents(grades: Array<Int>): Array<Int> {
    var array = Array<Int>(grades.size){0}
    grades.forEachIndexed{ i , grade ->
        if (getNextMultiple(grade, 5) - grade < 3 && grade >= 38){
            array[i] = getNextMultiple(grade, 5)
        }else if(grade < 38 || getNextMultiple(grade, 5) - grade >= 3){
           array[i] = grade 
        }
    }
    return array
}

fun getNextMultiple(number: Int, multiple: Int): Int {
    val remainder = number % multiple
    return if (remainder == 0) {
        number
    } else {
        number + (multiple - remainder)
    }
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
