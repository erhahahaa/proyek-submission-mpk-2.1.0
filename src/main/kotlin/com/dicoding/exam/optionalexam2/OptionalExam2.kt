package com.dicoding.exam.optionalexam2

fun minAndMax(number: Int): Int {
    val numbers = number.toString().map { it.toString().toInt() }
    val min = numbers.minOrNull() ?: 0
    val max = numbers.maxOrNull() ?: 0
    return min + max
}
