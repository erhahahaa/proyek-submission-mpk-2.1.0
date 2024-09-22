package com.dicoding.exam.exam3

fun <T> checkType(args: T): String = when (args) {
    is Int -> "Yes! it's Integer"
    is String -> "Yes! it's String"
    is Boolean -> "Yes! it's Boolean"
    is Double -> "Yes! it's Double"
    is List<*> -> "Yes! it's List"
    is Map<*, *> -> "Yes! it's Map"
    else -> "Unidentified type: ${args!!::class.simpleName}"
}
