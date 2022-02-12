package com.nextstep.fuel

class K5(travelDistance: Int) : Car(travelDistance) {
    override val kmPerLiter: Int = 13;
    override val kind get(): String = "K5"
}