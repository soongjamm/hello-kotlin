package com.nextstep.fuel

abstract class Car(private val travelDistance: Int) {
    abstract val kmPerLiter: Int
    abstract val kind: String
    val lackOfFuel: Int get() = this.travelDistance / kmPerLiter
}