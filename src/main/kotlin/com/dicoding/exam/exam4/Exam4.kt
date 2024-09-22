package com.dicoding.exam.exam4

// mentee notes:
// - actually i'm confused, if I use mapOf the linter will give warning if checking always true since it use mapOf
// - I'll ask the mentor about this
fun vehicle(): Map<String, String> = mapOf(
    "type" to "motorcycle",
    "maxSpeed" to "230Km/s",
    "maxTank" to "100Ltr"
)
