package com.nextstep.fuel

class Sonata(private val travelDistance: Int) : Car {
    override val kind get(): String = "Sonata"

    override fun lackOfFuel(): Int {
        return this.travelDistance / 10
    }
}