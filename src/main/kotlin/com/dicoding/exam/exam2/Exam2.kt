package com.dicoding.exam.exam2

fun calculate(valueA: Int, valueB: Int, valueC: Int?): Int = valueA + (valueB - (valueC ?: 50))

fun result(result: Int): String = "Result is $result"
