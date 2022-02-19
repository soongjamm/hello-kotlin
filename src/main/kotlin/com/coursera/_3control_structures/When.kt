package com.coursera._1fromjavatokotlin

fun main() {
    println(respondToInput("y"))
    hierarchy(Dog("my dog"))
    withCapturingInsideWhen()
    withoutCondition()
}

fun withoutCondition() = when {
    true -> println("it is true")
    else -> println("nothing")
}

fun withCapturingInsideWhen() = when (val animal: Animal = getAnimal()) {
    is Dog -> println("dog ${animal}")
    is Cat -> println("cat ${animal}")
    else -> println("who are you")
}

fun getAnimal(): Animal {
    return Cat("my cat")
}

fun hierarchy(animal: Animal) = when (animal) {
    is Dog -> println("wall wall")
    is Cat -> println("nyang")
    else -> println("who are you")
}

fun respondToInput(input: String): String = when (input) {
    "y", "yes" -> "I'm glad you agree"
    "n", "no" -> "Sorry to hear you."
    else -> "I don't understand."
}

open class Animal
data class Dog(val name: String) : Animal()
data class Cat(val name: String) : Animal()