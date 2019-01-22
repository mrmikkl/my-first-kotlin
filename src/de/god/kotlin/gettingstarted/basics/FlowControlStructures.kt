package de.god.kotlin.gettingstarted.basics

fun foo() {
    val numbers: List<Int> = listOf(1, 2, 3)
    for (number in numbers) {
        println(number)
    }
}

fun bar() {
    val items: List<String> = listOf("apple", "banana", "kiwifruit")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}
