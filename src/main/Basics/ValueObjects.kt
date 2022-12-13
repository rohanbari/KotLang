/**
 * A value object class.
 */
data class Employee(val name: String, var salary: Int)

fun main() {
    /* Declaring a list of value-object type Employee. */
    val empList = listOf(
        Employee("Rohan Bari", 25000),
        Employee("Dipak Bari", 60000),
        Employee("Max Weber", 45000)
    )

    /* For each employee in empList, print their corresponding details. */
    for (emp in empList)
        // When called, getters are involved. These are not accessed directly.
        println("${emp.name} earns \$${emp.salary} every month.")
}