//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.nio.ByteBuffer

fun main() {
    byteBufferExample()
}

fun byteBufferExample() {
    // A ByteBuffer manages a memory buffer internally
    val buffer = ByteBuffer.allocate(4)

    // Write to buffer (moves position forward automatically)
    buffer.put(10)
    buffer.put(20)
    buffer.put(30)
    buffer.put(40)

    // Prepare buffer for reading
    buffer.flip()

    // Read data in order
    while (buffer.hasRemaining()) {
        println(buffer.get())
    }
}