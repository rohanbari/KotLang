package com.rohanbari.basics

/**
 * A value object class.
 */
data class Person(val name: String, var salary: Int)

fun main() {
    /* Declaring a list of value-object type basics.Employee. */
    val empList = listOf(
        Person("Rohan Bari", 25000),
        Person("Dipak Bari", 60000),
        Person("Max Weber", 45000)
    )

    /* For each employee in empList, print their corresponding details. */
    for (emp in empList)
        // When called, getters are involved. These are not accessed directly.
        println("${emp.name} earns \$${emp.salary} every month.")
}