package com.dicoding.exam.optionalexam3

fun manipulateString(str: String, int: Int): String {
    val number = str.filter { it.isDigit() }
    if (number.isNotEmpty()) {
        val result = number.toInt() * int
        return str.replace(number, result.toString())
    }
    return "$str$int"
}
