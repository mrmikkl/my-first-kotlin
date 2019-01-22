package de.god.kotlin.gettingstarted.basics


fun main(args: Array<String>) {
    add(3, 6)
}

// with expression body
fun add(a: Int, b: Int): Int = a + b

// with declaration
fun add1(a: Int, b: Int): Int {
    return a + b
}

// with no return meaningful value - see Unit
fun addNoReturn(a: Int, b: Int): Unit {
    println("$a + $b = ${a + b}")
}

fun addNoReturn1(a: Int, b: Int) {
    println("$a + $b = ${a + b}")
}
