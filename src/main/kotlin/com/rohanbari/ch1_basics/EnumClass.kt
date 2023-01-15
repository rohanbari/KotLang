package com.rohanbari.ch1_basics

/**
 * An enum class accepting a [name].
 */
enum class Color {
    BLACK, BROWN, RED, ORANGE, YELLOW,
    GREEN, BLUE, VIOLET, GRAY, WHITE
}

// enum class and when idiom
fun name(color: Color) = when (color) {
    Color.BLACK -> "Black"
    Color.BROWN -> "Brown"
    Color.RED -> "Red"
    Color.ORANGE -> "Orange"
    Color.YELLOW -> "Yellow"
    Color.GREEN -> "Green"
    Color.BLUE -> "Blue"
    Color.VIOLET -> "Violet"
    Color.GRAY -> "Gray"
    Color.WHITE -> "White"
}

fun main() {
    println("${Color.BLACK} holds ${name(Color.BLACK)}.")
}