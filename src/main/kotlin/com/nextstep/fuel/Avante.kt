package com.nextstep.fuel

class Avante(private val travelDistance: Int) : Car {
    override val kind get(): String = "Avante"

    override fun lackOfFuel(): Int {
        return this.travelDistance / 15
    }
}