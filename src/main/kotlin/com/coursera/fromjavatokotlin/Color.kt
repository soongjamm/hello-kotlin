package com.coursera.fromjavatokotlin

enum class Color {
    RED, ORANGE, BLUE
}


fun main() {
    hello(15)
}

private fun hello(degrees: Int) {
    val (description: String, color: Color) =
            if (degrees < 10) {
                Pair("cold", Color.BLUE)
            } else if (degrees < 25) {
                Pair("mild", Color.ORANGE)
            } else {
                Pair("hot", Color.RED)
            }

    println("${description}, ${color}")
}