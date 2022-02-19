package com.coursera._1fromjavatokotlin

fun main() {
    loopList()
    loopMap()
    withRange()
}

fun withRange() {
    for (i in 1..9) {
        print(i)
    }
    println()

    for (i in 1 until 9) {
        print(i)
    }
    println()

    for (i in 9 downTo 1 step 2) {
        print(i)
    }
    println()
}

fun loopMap() {
    val mapOf = mapOf(1 to "one",
            2 to "two",
            3 to "three")
    for ((key, value) in mapOf) {
        print("${key}, ${value} ||")
    }
    println()
}

fun loopList() {
    val listOf = listOf("a", "b", "c")
    for ((idx, each) in listOf.withIndex()) {
        print("${idx} ${each} || ")
    }
    println()
}
