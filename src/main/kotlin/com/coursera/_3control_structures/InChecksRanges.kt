package com.coursera._3control_structures

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'

fun isValidIdentifier(s: String): Boolean {
    return s.isNotEmpty() && s.matches(Regex("^[1-9_a-zA-Z][a-zA-Z0-9_]+"))
}

fun main() {
    println(isLetter('g'))
    println(isNotDigit('g'))
    println(isValidIdentifier("_12"))
}
