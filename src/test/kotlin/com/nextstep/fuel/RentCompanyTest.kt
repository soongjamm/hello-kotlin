package com.nextstep.fuel

import org.junit.jupiter.api.Test

class RentCompanyTest {
    private val NEWLINE :String = System.getProperty("line.separator");

    @Test
    internal fun report() {
        val company: RentCompany = RentCompany.create() // factory method를 사용해 생성

        company.addCar(Sonata(150))
        company.addCar(K5(260))
        company.addCar(Sonata(120))
        company.addCar(Avante(300))
        company.addCar(K5(390))

        val report: String = company.generateReport()
        assertThat(report).isEqualTo(
                "Sonata : 15리터" + NEWLINE +
                        "K5 : 20리터" + NEWLINE +
                        "Sonata : 12리터" + NEWLINE +
                        "Avante : 20리터" + NEWLINE +
                        "K5 : 30리터" + NEWLINE
        )
    }
}