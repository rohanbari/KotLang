package com.rohanbari.ch1_basics

fun rangeBased() {
    val oneToTen = 1..10
    oneToTen.forEach { print("$it ") }
    println()
}

fun downToBased() {
    for (it in 50 downTo 0 step 2)
        print("$it ")
    println()
}

fun main() {
    rangeBased()
    downToBased()

    println()
}