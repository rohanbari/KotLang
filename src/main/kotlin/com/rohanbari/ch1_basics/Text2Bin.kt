/*
 * Copyright (c) 2023 Rohan Bari
 */

package com.rohanbari.ch1_basics

import java.util.*

fun main() {
    print("Enter a sentence: ")
    val input = readlnOrNull()

    if (input.isNullOrEmpty()) {
        println("error: Invalid input detected.")
        return
    }

    val binaryData = TreeMap<Char, String>()
    val data = input.trim()

    for (it in data) {
        val bin = Integer.toBinaryString(it.code)
        binaryData[it] = bin
    }

    var temp = 1
    for ((_, bin) in binaryData) {
        print("$bin ")
        if (++temp == 8) {
            println()
            temp = 1
        }
    }
}