package com.rohanbari.basics

data class Polygon(val height: Int, val width: Int) {
    /* Custom accessors (getter) which is not a field. */
    val isSquare get() = height == width
    val isRectangle get() = height != width
}

fun main() {
    // Instantiation gone easy.
    val model1 = Polygon(10, 15)
    val model2 = Polygon(10, 10)

    println(
        "sq => model1: ${model1.isSquare}, model2: ${model2.isSquare}\n" +
                "rc => model1: ${model1.isRectangle}, model2: ${model2.isRectangle}"
    )
}