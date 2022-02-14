package com.coursera.fromjavatokotlin

enum class Color {
    RED, ORANGE, BLUE
}


fun main() {
    hello(15)
}

private fun hello(degrees: Int) {
    val description: String
    val color: Color

    if (degrees < 10) {
        description = "cold"
        color = Color.BLUE
    } else if (degrees < 25) {
        description = "mild"
        color = Color.ORANGE
    } else {
        description = "hot"
        color = Color.RED
    }

    println("${description}, ${color}")
}