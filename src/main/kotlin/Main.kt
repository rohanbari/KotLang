/**
 * The main method accepting [args].
 */
fun main(args: Array<String>) {
    // If args is not empty, print here instead.
    if (args.isNotEmpty()) {
        println("Your name is: ${args.joinToString()}")
        return
    }

    print("Enter your name: ")
    val name: String? = readlnOrNull()

    println("Welcome, $name")
}
