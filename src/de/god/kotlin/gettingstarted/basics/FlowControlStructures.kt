package de.god.kotlin.gettingstarted.basics

fun forPlayground() {
    val numbers: List<Int> = listOf(1, 2, 3)
    for (number in numbers) {
        println(number)
    }
}

fun forWithIndices() {
    val items: List<String> = listOf("apple", "banana", "kiwifruit")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}

fun whenPlayground(a: Any) {
    val validNumbers = listOf(99, 104, 777)

    when (a) {
        1 -> println("number")
        2, 3 -> println("numbers")
        in 10..15 -> println("larger number")
        in validNumbers -> println("in valid numbers")
        "b" -> println("string")
        is Long -> println("is Long")
        !is String -> println("no String")
        else -> println("nope")
    }
}

fun whenAsIfElseIfAlternative(a: Any, b: Any) {
    // when has no param
    when {
        a is String -> println("a")
        b is Long -> println(a)
        else -> println("nope")
    }
}

fun whenInVar(a: Any) {
    val whenValue = when (a) {
        is String -> "$a + $a"
        is Long -> a + a
        else -> a
    }
    println(whenValue)
}

fun whenWithReturn(a: Any) = when (a) {
    is String -> "$a + $a"
    else -> "false"
}
