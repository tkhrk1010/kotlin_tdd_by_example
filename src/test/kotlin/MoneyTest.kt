import org.junit.Assert.*
import org.junit.Test

class MoneyTest {
    @Test
    fun testMultiplication() {
        val five: Dollar = Dollar(5)
        assertEquals(Dollar(10), five.times(2))
        assertEquals(Dollar(15), five.times(3))
    }
    @Test
    fun testEquality() {
        assertTrue(Dollar(5).equals(Dollar(5)))
        assertFalse(Dollar(5).equals(Dollar(6)))
    }
}