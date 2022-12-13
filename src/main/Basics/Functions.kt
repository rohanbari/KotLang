/**
 * Evaluate the max of two integers [x] and [y].
 */
fun max(x: Int, y: Int) = if (x > y) x else y

fun main() {
    print("Input two numbers separated by a space: ")
    val input: String? = readlnOrNull()

    val container = input?.split(" ")

    // Null check condition
    if (container.isNullOrEmpty() || container.size > 2) {
        println("Please provide two integer values only. No more, no less.")
        return
    }

    val list = container.toTypedArray().map { element -> element.toInt() }.toList()

    /* Dot call instead of nullable as further execution is guaranteed to have a non-null input. */
    val x = list[0]
    val y = list[1]
    val maxValue: Int = max(x, y)

    println("The values retrieved are $x and $y. The maximum value is $maxValue.")
}