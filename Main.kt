//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello World")
    val x = 2
    val y = 3
    val z = x + y
    println("$x + $y = $z")

    val thread1 = Thread {
        for (i in 1..1000) {
            println("Thread 1: $i")
            Thread.sleep(10)
        }
    }

    val thread2 = Thread {
        for (i in 1..1000) {
            println("Thread 2: $i")
            Thread.sleep(10)
        }
    }
    // Set thread priorities
    thread1.priority = Thread.MAX_PRIORITY
    thread2.priority = Thread.MIN_PRIORITY

    // Start both threads
    thread1.start()
    thread2.start()

    // Wait for both to finish
    thread1.join()
    thread2.join()

    println("Both threads finished")
}