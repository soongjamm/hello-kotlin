package com.coursera._1fromjavatokotlin

fun main() {
    named()
    arguments(size = 3)
}

fun arguments(character: Char = '#', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}

fun named() {
    val names = listOf("a", "b", "c")
    println(names.joinToString(
            separator = "", prefix = "{", postfix = "}"))
}
