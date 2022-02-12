package com.nextstep.fuel

class Sonata(travelDistance: Int) : Car(travelDistance) {
    override val kmPerLiter: Int = 10;
    override val kind get(): String = "Sonata"
}