/**
 * The main method accepting [args].
 */
fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        println("Your name is: ${args.joinToString()}")
        return
    }

    print("Enter your name: ")
    val name = readlnOrNull()

    if (name == null) {
        println("error: Name must not be null.")
        return
    }

    println("Welcome, $name")
}
