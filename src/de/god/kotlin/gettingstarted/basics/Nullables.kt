package de.god.kotlin.gettingstarted.basics

fun otherFunc() {
    val a: Int? = maybeNull(50)

    if (a != null) {
        println(a)
    }
}

fun maybeNull(a: Int): Int? {
    if (a > 10)
        return null
    return a / 10
}
