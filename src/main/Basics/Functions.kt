/**
 * Evaluate the max of two integers [x] and [y].
 */
fun max(x: Int, y: Int) = if (x > y) x else y

fun main() {
    print("Input two numbers separated by a space: ")
    val input: String? = readlnOrNull()

    val container = input?.split(Regex(" "))

    // Null check condition
    if (container != null) {
        if (container.isEmpty() || container.size > 2) {
            println("Please provide two integer values only. No more, no less.")
        }
    } else {
        println("Container is empty. Quitting.")
        return
    }

    /* Dot call instead of nullable as further execution is guaranteed to have a non-null input. */
    val x: String = container[0]
    val y: String = container[1]
    val maxValue : Int = max(x.toInt(), y.toInt())

    println("The values retrieved are $x and $y. The maximum value is $maxValue.")
}