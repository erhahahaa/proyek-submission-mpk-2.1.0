package com.dicoding.exam.optionalexam1

fun sumOfBigThree(vararg numbers: Int): Int {
    if (numbers.size !in 1..10) throw IllegalArgumentException("Number should be in range 1-10")
    val descOrder = numbers.sortedDescending()
    return descOrder.take(3).sum()
}
