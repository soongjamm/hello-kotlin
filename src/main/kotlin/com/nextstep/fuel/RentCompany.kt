package com.nextstep.fuel


class RentCompany {

    private val cars: MutableList<Car> = mutableListOf()

    private constructor()

    companion object {
        fun create(): RentCompany {
            return RentCompany()
        }
    }

    fun addCar(car: Car) {
        cars.add(car)
    }

    fun generateReport(): String {
        val sb: StringBuilder = StringBuilder()
        for (car in cars) {
            sb.append("${car.kind} : ${car.lackOfFuel}리터\n")
        }
        return sb.toString()
    }

}