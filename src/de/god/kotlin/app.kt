package de.god.kotlin

val PI: Double = 3.14

fun main(args: Array<String>) {
    sumStuff()
    nullStuff()
    stringStuff()
    loopStuff()
    whenStuff()
    rangeStuff()
}

private fun sumStuff() {
    println("1 + 2 = ${sum(1, 2)}")
    println("4 + 5 = ${sum1(4, 5)}")
    printSum(3, 3)
    println("Max of 44 and 32 is: ${maxOf(44, 32)}")
}

private fun nullStuff() {
    val nullValue: Int? = nullSafety(-5)
    println("NullableValue is: $nullValue")
}

private fun stringStuff() {
    println("StringLength is: ${getStringLength("adfasdfasdfas")}")
    println("StringLength is: ${getStringLength(534534)}")
}

private fun loopStuff() {
    val numbers: List<Int> = listOf(1, 2, 3, 3, 5, 543, 2, 34, 3, 45, 3, 4534)
    println("Lots of Numbers")
    for (number in numbers) {
        print("$number, ")
    }
    for (index in numbers.indices) {
        println("Item at $index is ${numbers[index]}")
    }
}

fun whenStuff() {
    val obj: Any = 3.234
    val value: String = when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }
    println("when gives you: $value")
}

fun rangeStuff() {
    // Example 1
    val x = 3
    if(x in 1..10)
        println("X is in range")
    else
        println("X is out of range")

    // Example 2
    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }

    // Example 3
    for (x in 1..5) {
        print(x)
    }
    println()

    // Example 4
    for (x in 1..10 step 2) {
        print(x)
    }
    println()

    // Example 5
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
}

private fun sum(a: Int, b: Int): Int {
    return a + b
}

private fun sum1(a: Int, b: Int) = a + b

private fun printSum(a: Int, b: Int): Unit {
    println("Sum of $a and $b is ${a + b}")
}

private fun maxOf(a: Int, b: Int): Int = if (a > b) a else b

private fun nullSafety(a: Int): Int? = if (a < 0) null else a

private fun getStringLength(obj: Any): Int? {
    if (obj !is String) return null

    // `obj` is automatically cast to `String` in this branch
    return obj.length
}
