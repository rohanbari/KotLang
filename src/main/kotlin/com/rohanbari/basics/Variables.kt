/*
 * Copyright (c) 2022 Rohan Bari
 */

package com.rohanbari.basics

fun main() {
    var response: String?
    val container = arrayListOf<String>()

    do {
        print("Enter a name: ")
        val name = readlnOrNull()

        if (name != null) {
            container.add(name)
        }

        print("Add more? (yes/no) ")
        response = readlnOrNull()?.lowercase()
    } while (response == "yes" || response == "y")

    for (name in container)
        println(name)
}