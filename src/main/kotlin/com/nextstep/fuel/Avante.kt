package com.nextstep.fuel

class Avante(travelDistance: Int) : Car(travelDistance) {
    override val kmPerLiter: Int = 15;
    override val kind get(): String = "Avante"
}