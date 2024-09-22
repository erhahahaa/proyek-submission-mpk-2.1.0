package com.dicoding.exam.exam5

import kotlinx.coroutines.delay

suspend fun sum(valueA: Int, valueB: Int): Int {
    delay(3000L)
    return valueA + valueB
}

suspend fun multiple(valueA: Int, valueB: Int): Int {
    delay(2001L)
    return valueA * valueB
}
