import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*


fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    return getHighestCost(b, keyboards, drives)
}

fun getHighestCost(budget: Int, keyboards: Array<Int>, drives: Array<Int>) : Int{
    var highestPrice = -1
     keyboards.forEach { keyboardPrice ->
        drives.forEach{ usbDrivePrice->
            if(keyboardPrice + usbDrivePrice <= budget && keyboardPrice + usbDrivePrice > highestPrice){
                highestPrice = keyboardPrice + usbDrivePrice
            }
        }
    }
return highestPrice
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val bnm = scan.nextLine().split(" ")

    val b = bnm[0].trim().toInt()

    val n = bnm[1].trim().toInt()

    val m = bnm[2].trim().toInt()

    val keyboards = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val drives = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    /*
     * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
     */

    val moneySpent = getMoneySpent(keyboards, drives, b)

    println(moneySpent)
}
