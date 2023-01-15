/*
 * Copyright (c) 2023 Rohan Bari
 */

package com.rohanbari.ch1_basics

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun evaluate(expr: Expr): Int =
    when(expr) {
        is Num -> expr.value
        is Sum -> evaluate(expr.left) + evaluate(expr.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }

fun main() {
    val num1 = Num(10)
    val num2 = Num(20)
    val sum = Sum(num1, num2)

    println("num1 is ${evaluate(num1)} and num2 is ${evaluate(num2)}.")
    println("Their sum is ${evaluate(sum)}.")
}