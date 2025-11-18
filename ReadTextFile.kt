import java.io.File


fun main() {
    println("FIRST NAME          LAST NAME           BIRTH DAY           PHONE               STREET ADDRESS      CITY                STATE               ZIP")
    println("-----------------------------------------------------------------------------------------------------------------------------------------------")

    val content = File("/Users/School/Documents/records.txt").readText() // reads data from file to one long string "content"
    val records : Array<String> = content.split(",").toTypedArray() // Passes content into array of strings where each element is deliminated by the commas in the data and converted to the array

    var index = 0 // index variable used to keep track of the index of the array to calculate when to add a newline to the table

    for (item in records) { // for loop iterates through each item in records
        print(item) // prints the item of the array
        for (j in 1..(20-item.length)){ // for loop adds spacing to keep table lined up
            print(" ")
        }
        if (((index + 1) % 8) == 0) { // if statement prints a newline after every 8 items in records
            println()
        }
        index++ // increment the index after each iteration
    }
}
