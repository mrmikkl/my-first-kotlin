package de.god.kotlin.gettingstarted.basics


fun main(args: Array<String>) {
}

fun stringTemplate() {
    val a: String = "a"
    val b: String = "b"
    val c: String = "$a and $b is ${a + b}"
}

fun conditionalExpression(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun conditionalExpression1(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

fun conditionalExpression2(a: Int, b: Int): Int = if (a > b) a else b
