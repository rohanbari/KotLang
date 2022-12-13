package com.rohanbari.what_why

/**
 * Data class accepting [name] and [age] as fields.
 * Nullable variables can be identified by their identifier followed by a question mark.
 */
data class Person(val name: String, val age: Int = 0)

fun main() {
    // List of Person objects.
    val people = listOf(
        Person("Rohan", 19),
        Person("Dipak", 29),
        Person("Max")
    )

    // Null values will be treated as zero.
    val youngest = people.minBy { it.name }
    val oldest = people.maxBy { it.age }

    println("Youngest is ${youngest.name} and oldest is ${oldest.name}.")
}