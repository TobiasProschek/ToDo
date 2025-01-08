fun main() {
    // Declare and initialize a map
    val myMap = mapOf(1 to "apple", 2 to "banana", 3 to "apricot", 4 to "carrot", 5 to "blueberry")

    // Define the prefix to filter by
    val prefix = "ap"

    // Filter the map based on the prefix
    val filteredMap = myMap.filterValues { it.startsWith(prefix) }

    // Print the filtered map
    println("Filtered Map by Prefix: $filteredMap")
}