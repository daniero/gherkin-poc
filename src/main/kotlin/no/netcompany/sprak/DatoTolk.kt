package no.netcompany.sprak

import java.time.DayOfWeek
import java.time.LocalDate

fun tolk(gittDato: LocalDate, tekst: String): LocalDate {
    if (tekst.matches(Regex("i\\s?dag"))) {
        return gittDato
    } else if (tekst.matches(Regex("i\\s?morgen"))) {
        return gittDato.plusDays(1)
    } else if (tekst == "mandag") {
        return finnMandag(gittDato)
    }

    throw IllegalArgumentException("funka ikke :(")
}

private fun finnMandag(gittDato: LocalDate): LocalDate {
    var dag = gittDato

    while (dag.dayOfWeek != DayOfWeek.MONDAY) {
        dag = dag.plusDays(1)
    }

    return dag;
}

