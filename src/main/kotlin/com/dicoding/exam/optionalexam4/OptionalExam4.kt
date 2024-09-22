package com.dicoding.exam.optionalexam4

fun getMiddleCharacters(string: String): String {
    val middleIndex = string.length / 2
    if (string.length % 2 == 0) {
        return string.substring(middleIndex - 1, middleIndex + 1)
    }
    return string.substring(middleIndex, middleIndex + 1)
}
