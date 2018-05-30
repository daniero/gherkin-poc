package no.netcompany.sprak

import java.time.LocalDate

fun tolk(gittDato: LocalDate, tekst: String): LocalDate {
    if (tekst.contains("dag")) {
        return gittDato
    } else {
        return gittDato.plusDays(1)
    }
}

