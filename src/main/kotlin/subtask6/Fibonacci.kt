package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        val result = arrayOf(0, 1, 1)

        while (result[0] * result[1] < n) {
            val sum = result[0] + result[1]
            result[0] = result[1]
            result[1] = sum
        }
        if(result[0]*result[1]!=n) result[2] = 0
        return result.toIntArray()
    }
}
