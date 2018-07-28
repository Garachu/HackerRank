package com.algorithm

import java.util.*

/**
 * Created by meg on 7/28/18.
 */

/**
 * You are in-charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age.
 * When she blows out the candles, she’ll only be able to blow out the tallest ones.
 * Your task is to find out how many candles she can successfully blow out.
 * For example, if your niece is turning 4 years old, and the cake will have candles of height 1, 3, 2, 3
 * she will be able to blow out 2 candles successfully, since the tallest candle is of height and there are such candles.
 * Sample Input 0 :
 * 4
 * 3 2 1 3
 * Sample Output 0
 * 2
 * Explanation 0
 * We have one candle of height 1, one candle of height 2, and two candles of height 3.
 * Your niece only blows out the tallest candles, meaning the candles where heght == 3.
 * Because there are 2 such candles,
 * we print 2 on a new line.
 */
object CalendarInvite {

    // Complete the birthdayCakeCandles function below.
    fun birthdayCakeCandles(ar: Array<Int>): Int {

        var maxHeight = 0
        var maxHeightCount = 0

        for(i in ar.indices){

            if(maxHeight < ar[i]){
                maxHeight = ar[i]
                maxHeightCount = 1
            }else if (maxHeight == ar[i]){
                maxHeightCount = maxHeightCount.inc()
            }
        }

        return maxHeightCount
    }

    @JvmStatic
    fun calendarInvite(){
        val scan = Scanner(System.`in`)

        val arCount = scan.nextLine().trim().toInt()

        val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        val result = birthdayCakeCandles(ar)

        println(result)
    }

}