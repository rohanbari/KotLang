/**
 * Add two numbers [a] and [b] together.
 */
fun add(a: Int, b: Int) : Int = a + b

/**
 * A method to see if var can be used to reassign variables.
 */
fun vars() {
    // Can be reassigned
    var x = 10

    x++
    println("New value of x is $x")
    x += 10
    println("Now, x is $x")
}

fun loops() {
    val items = listOf("apple", "banana", "cherry", "date")

    for (item in items)
        println("$item is very tasty.")
}

fun main() {
    println("Addition of 3+5: ${add(3, 5)}")

    vars()
    loops()

    val square = Square(10).area
    println("Area of the square is $square.")
}