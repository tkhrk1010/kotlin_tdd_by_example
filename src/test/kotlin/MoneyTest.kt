import org.junit.Assert.assertEquals
import org.junit.Test

class MoneyTest {
    @Test
    fun testMultiplication() {
        val five: Dollar = Dollar(5)
        five.times(2)
        assertEquals(10, five.amount)
    }
}