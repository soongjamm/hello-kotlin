package com.nextstep.fuel

class K5(private val travelDistance: Int) : Car {
    override val kind get(): String = "K5"

    override fun lackOfFuel(): Int {
        return this.travelDistance / 13
    }
}